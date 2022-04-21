package com.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA=0,scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick3A(View view){
        scoreA+=3;
        displayA();
    }
    public void onClick2A(View view){
        scoreA+=2;
        displayA();
    }
    public void onClick1A(View view){
        scoreA+=1;
        displayA();
    }
    public void reset(View view){
        scoreA=0;
        scoreB=0;
        displayA();
        displayB();
    }

    public void displayA(){
        TextView scoreView=findViewById(R.id.scoreA);
        scoreView.setText(scoreA+"");
    }
    public void onClick3B(View view){
        scoreB+=3;
        displayB();
    }
    public void onClick2B(View view){
        scoreB+=2;
        displayB();
    }
    public void onClick1B(View view){
        scoreB+=1;
        displayB();
    }


    public void displayB(){
        TextView scoreView=findViewById(R.id.scoreB);
        scoreView.setText(scoreB+"");
    }

}