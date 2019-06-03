package com.cookandroid.myassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class EditAssistantEYE extends AppCompatActivity {
    int clicked =0;
    int rdclick=0;
    int blclick=0;
    int yeclick=0;

    ImageView paint =null;
    ImageView save =null;

    Button red;
    Button blue;
    Button yellow;

    ImageView re = null;
    ImageView be = null;
    ImageView ye = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_assistant_eye);

        Button prevButton = (Button) findViewById(R.id.prev) ;
        Button nextButton = (Button) findViewById(R.id.next) ;

        paint = findViewById(R.id.paint);
        save = findViewById(R.id.save);

        re = findViewById(R.id.redeyes);
        be = findViewById(R.id.blueeyes);
        ye = findViewById(R.id.twintail);

        red = findViewById(R.id.red);
        blue = findViewById(R.id.blue);
        yellow = findViewById(R.id.yellow);

        //상태: 이미 visible 한걸 언급 ㄴㄴ
        red.setVisibility(View.INVISIBLE);
        blue.setVisibility(View.INVISIBLE);
        yellow.setVisibility(View.INVISIBLE);

        re.setVisibility(View.INVISIBLE);
        be.setVisibility(View.INVISIBLE);

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
                re.setVisibility(View.VISIBLE);
            }
        });

        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                be.setVisibility(View.VISIBLE);
            }
        });

        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ye.setVisibility(View.VISIBLE);
            }
        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "내가만든스킨에 저장되었습니다.", Toast.LENGTH_LONG).show();
            }
        });

    }
}
