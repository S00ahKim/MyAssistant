package com.cookandroid.myassistant;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class EditAssistantACC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_assistant_acc);

//        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);
//
//        //툴바 설정
//        toolbar.setTitleTextColor(Color.parseColor("#84C1FF")); //제목의 칼라
//        toolbar.setTitle("");
//        setSupportActionBar(toolbar); //툴바를 액션바와 같게 만들어 준다.
//        getSupportActionBar().setTitle("Acc");

        Button prevButton = (Button) findViewById(R.id.prev) ;
        Button nextButton = (Button) findViewById(R.id.next) ;

        prevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), EditAssistantAP.class);
                startActivity(intent);
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), EditBackground.class);
                startActivity(intent);
            }
        });
    }
}
