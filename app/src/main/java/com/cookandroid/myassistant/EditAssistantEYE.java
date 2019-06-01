package com.cookandroid.myassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class EditAssistantEYE extends AppCompatActivity {
    int clicked = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_assistant_eye);

        Button prevButton = (Button) findViewById(R.id.prev) ;
        Button nextButton = (Button) findViewById(R.id.next) ;

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

        ImageView paint = (ImageView) findViewById(R.id.paint);
        final Button red = (Button) findViewById(R.id.red);
        final Button blue = (Button) findViewById(R.id.blue);
        final Button yellow = (Button) findViewById(R.id.yellow);

        red.setVisibility(View.INVISIBLE);
        blue.setVisibility(View.INVISIBLE);
        yellow.setVisibility(View.INVISIBLE);

        paint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (clicked==0){
                    red.setVisibility(View.VISIBLE);
                    blue.setVisibility(View.VISIBLE);
                    yellow.setVisibility(View.VISIBLE);
                    clicked += 1;
                }else{
                    red.setVisibility(View.INVISIBLE);
                    blue.setVisibility(View.INVISIBLE);
                    yellow.setVisibility(View.INVISIBLE);
                    clicked -=1;
                }
            }
        });

        final ImageView imageview1 = (ImageView)findViewById(R.id.redeyes);
        final ImageView imageview2 = (ImageView)findViewById(R.id.blueeyes);
        final ImageView imageview3 = (ImageView)findViewById(R.id.twintail);

        imageview1.setVisibility(View.INVISIBLE);
        imageview2.setVisibility(View.INVISIBLE);
        imageview3.setVisibility(View.VISIBLE);

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageview1.setVisibility(View.VISIBLE);
                imageview2.setVisibility(View.INVISIBLE);
                imageview3.setVisibility(View.INVISIBLE);
            }
        });

        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageview2.setVisibility(View.VISIBLE);
                imageview1.setVisibility(View.INVISIBLE);
                imageview3.setVisibility(View.INVISIBLE);
            }
        });

        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageview2.setVisibility(View.INVISIBLE);
                imageview1.setVisibility(View.INVISIBLE);
                imageview3.setVisibility(View.VISIBLE);
            }
        });

        ImageView save = (ImageView) findViewById(R.id.save);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "내가만든스킨에 저장되었습니다.", Toast.LENGTH_LONG).show();
            }
        });

    }
}
