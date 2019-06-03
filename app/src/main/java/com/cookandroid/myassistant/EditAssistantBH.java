package com.cookandroid.myassistant;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class EditAssistantBH extends AppCompatActivity {
    ImageView imageview1 = null, imageview2 = null, imageview3=null, imageview4=null, imageview5=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_assistant_bh);

        Button prevButton = (Button) findViewById(R.id.prev) ;
        Button nextButton = (Button) findViewById(R.id.next) ;

        imageview1 = (ImageView)findViewById(R.id.mainImage);
        imageview2 = (ImageView)findViewById(R.id.longcurlyhair);
        imageview5 = (ImageView)findViewById(R.id.twintail);

        imageview3 = (ImageView)findViewById(R.id.longcurlyhairSRC);
        imageview4 = (ImageView)findViewById(R.id.twintailSRC);

        imageview1.setVisibility(View.VISIBLE);
        imageview2.setVisibility(View.INVISIBLE);
        imageview5.setVisibility(View.INVISIBLE);

        imageview3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                imageview2.setVisibility(View.VISIBLE);
                imageview1.setVisibility(View.GONE);
                imageview5.setVisibility(View.GONE);
            }
        });

        imageview4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                imageview5.setVisibility(View.VISIBLE);
                imageview2.setVisibility(View.GONE);
                imageview1.setVisibility(View.GONE);
            }
        });

        prevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), EditAssistantFH.class);
                startActivity(intent);
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), EditAssistantEYE.class);
                startActivity(intent);
            }
        });


    }
}
