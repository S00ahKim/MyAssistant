package com.cookandroid.myassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class editVoice extends AppCompatActivity {
    int clicked = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_voice);

        Button defaultVoice = (Button) findViewById(R.id.defaultvoice) ;
        Button defaultWoman = (Button) findViewById(R.id.default_woman) ;
        Button defaultMan = (Button) findViewById(R.id.default_man) ;

        final SeekBar loh = (SeekBar) findViewById(R.id.low_or_high);
        final SeekBar thickness = (SeekBar) findViewById(R.id.thickness);
        final SeekBar fastness = (SeekBar) findViewById(R.id.fastness);

        final TextView explain = (TextView) findViewById(R.id.explain);
        explain.setVisibility(View.INVISIBLE);

        TextView llmtxt = (TextView) findViewById(R.id.learnlikemetxt);

        Button prevButton = (Button) findViewById(R.id.prev) ;
        Button nextButton = (Button) findViewById(R.id.next) ;

        // 기본값 설정
        defaultVoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loh.setProgress(50);
                thickness.setProgress(50);
                fastness.setProgress(50);
            }
        });

        defaultWoman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loh.setProgress(80);
                thickness.setProgress(30);
                fastness.setProgress(50);
            }
        });

        defaultMan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loh.setProgress(20);
                thickness.setProgress(70);
                fastness.setProgress(50);
            }
        });

        llmtxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (clicked==0){
                    explain.setVisibility(View.VISIBLE);
                    clicked +=1;
                }
                else {
                    explain.setVisibility(View.INVISIBLE);
                    clicked -=1;
                }
            }
        });

        //이전, 다음
        prevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), EditBackground.class);
                startActivity(intent);
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FinalShow.class);
                startActivity(intent);
            }
        });
    }
}
