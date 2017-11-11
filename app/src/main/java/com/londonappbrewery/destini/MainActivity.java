package com.londonappbrewery.destini;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    private TextView Tv_Story;
    private Button Btn_Top;
    private Button Btn_Bottom;
    private int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
            Tv_Story = (TextView) findViewById(R.id.storyTextView);
            Btn_Top = (Button) findViewById(R.id.buttonTop);
            Btn_Bottom = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
            Btn_Top.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mStoryIndex == 1 || mStoryIndex ==2){
                        Tv_Story.setText(R.string.T3_Story);
                        Btn_Top.setText(R.string.T3_Ans1);
                        Btn_Bottom.setText(R.string.T3_Ans2);
                        mStoryIndex = 3;
                    }
                    else if (mStoryIndex == 3){
                        Tv_Story.setText(R.string.T6_End);
                        Btn_Top.setVisibility(View.GONE);
                        Btn_Bottom.setVisibility(View.GONE);
                    }


                }
            });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
            Btn_Bottom.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mStoryIndex ==1) {
                        Tv_Story.setText(R.string.T2_Story);
                        Btn_Top.setText(R.string.T2_Ans1);
                        Btn_Bottom.setText(R.string.T2_Ans2);
                        mStoryIndex = 2;
                    }
                    else if(mStoryIndex ==2){
                        Tv_Story.setText(R.string.T4_End);
                        Btn_Top.setVisibility(View.GONE);
                        Btn_Bottom.setVisibility(View.GONE);
                    }
                    else if (mStoryIndex == 3){
                        Tv_Story.setText(R.string.T5_End);
                        Btn_Top.setVisibility(View.GONE);
                        Btn_Bottom.setVisibility(View.GONE);
                    }


                }
            });

    }

}
