package com.cookandroid.myassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class EditBackground extends AppCompatActivity {
    ImageView imageview1 = null;
    ImageView imageview2=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_background);

        Button prevButton = (Button) findViewById(R.id.prev) ;
        Button nextButton = (Button) findViewById(R.id.next) ;

        imageview1 =findViewById(R.id.bgblue);
        imageview2 = findViewById(R.id.mainImage);
        ImageView bluebg = (ImageView)findViewById(R.id.bg4);

        imageview1.setVisibility(View.INVISIBLE);
        imageview2.setVisibility(View.VISIBLE);

        prevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), EditAssistantACC.class);
                startActivity(intent);
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), editVoice.class);
                startActivity(intent);
            }
        });

        bluebg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageview1.setVisibility(View.VISIBLE);
                imageview2.setVisibility(View.INVISIBLE);
            }
        });
    }
}
