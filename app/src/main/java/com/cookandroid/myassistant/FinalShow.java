package com.cookandroid.myassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FinalShow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_show);

        Button setMyFrameButton = (Button) findViewById(R.id.setMyFrame) ;
        Button saveMySkinButton = (Button) findViewById(R.id.saveMySkin) ;
        Button goHomeButton = (Button) findViewById(R.id.goHome);

        setMyFrameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "프레임에 적용되었습니다.", Toast.LENGTH_LONG).show();
                //여기에 추가로 프레임으로 넘겨주는 코드가 들어가면 된다.
            }
        });

        saveMySkinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "내가 만든 스킨에 저장되었습니다.", Toast.LENGTH_LONG).show();
            }
        });

        goHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
