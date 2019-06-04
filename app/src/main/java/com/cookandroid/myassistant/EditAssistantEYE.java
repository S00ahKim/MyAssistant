package com.cookandroid.myassistant;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class EditAssistantEYE extends AppCompatActivity {
    int clicked =0;

    int statusRed = 0;
    int statusBlue = 0;
    int statusYellow = 1;

    ImageView paint =null;
    ImageView save =null;

    Button red;
    Button blue;
    Button yellow;
    //코드방식 - 재할당으로수정
    ImageView mainImage = null;

    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_assistant_eye);

        Button prevButton = (Button) findViewById(R.id.prev) ;
        Button nextButton = (Button) findViewById(R.id.next) ;

        paint = findViewById(R.id.paint);
        save = findViewById(R.id.save);

        mainImage = findViewById(R.id.mainImage);
        mainImage.setImageResource(R.drawable.twintail);

        red = findViewById(R.id.red);
        blue = findViewById(R.id.blue);
        yellow = findViewById(R.id.yellow);

        //상태: 이미 visible 한걸 언급 ㄴㄴ
        red.setVisibility(View.INVISIBLE);
        blue.setVisibility(View.INVISIBLE);
        yellow.setVisibility(View.INVISIBLE);

        prevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), EditAssistantBH.class);
                startActivity(intent);
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), EditAssistantCL.class);
                startActivity(intent);
            }
        });

        //페인트 요소
        paint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (clicked==0){
                    red.setVisibility(View.VISIBLE);
                    blue.setVisibility(View.VISIBLE);
                    yellow.setVisibility(View.VISIBLE);
                    clicked += 1;
                }
                else{
                    red.setVisibility(View.INVISIBLE);
                    blue.setVisibility(View.INVISIBLE);
                    yellow.setVisibility(View.INVISIBLE);
                    clicked -= 1;
                }
            }
        });


        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (statusBlue==1){
                    mainImage.setImageResource(R.drawable.redeyes);
                    statusRed = 1;
                    statusBlue=0;
                }else if (statusYellow==1){
                    mainImage.setImageResource(R.drawable.redeyes);
                    statusRed = 1;
                    statusYellow=0;
                }
            }
        });

        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (statusYellow==1){
                    mainImage.setImageResource(R.drawable.blueeyes);
                    statusBlue = 1;
                    statusYellow=0;
                }else if (statusRed==1){
                    mainImage.setImageResource(R.drawable.blueeyes);
                    statusBlue = 1;
                    statusRed=0;
                }
            }
        });

        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (statusBlue==1){
                    mainImage.setImageResource(R.drawable.twintail);
                    statusYellow = 1;
                    statusBlue=0;
                }else if (statusRed==1){
                    mainImage.setImageResource(R.drawable.twintail);
                    statusYellow = 1;
                    statusRed=0;
                }
            }
        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Intent myskinIntent = new Intent(getApplicationContext(), MySkin.class);
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context); // 빌더 얻기
                // 제목 설정
                alertDialogBuilder.setTitle("저장");
                // 다이얼로그 메세지 생성
                alertDialogBuilder
                        .setMessage("내가 만든 스킨에 저장되었습니다. 내가 만든 스킨으로 이동할까요?")
                        .setCancelable(false)
                        .setPositiveButton("예", // Positive 버튼 기능 작성
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        EditAssistantEYE.this.finish(); // 앱종료??
                                        startActivity(myskinIntent);//인텐트 오픈
                                }})
                        .setNegativeButton("아니오", //Negative 버튼 기능 작성
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel(); // 다이얼로그 취소
                                    } });
                // 다이얼로그 객체 얻어오기
                AlertDialog alertDialog = alertDialogBuilder.create();
                // 다이얼로그 보여주기
                alertDialog.show();

            }
        });

    }
}
