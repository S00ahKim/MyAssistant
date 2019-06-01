package com.cookandroid.myassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class EditBackground extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_background);

        Button prevButton = (Button) findViewById(R.id.prev) ;
        Button nextButton = (Button) findViewById(R.id.next) ;

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

        final ImageView imageview1 = (ImageView)findViewById(R.id.bgblue);
        final ImageView imageview2 = (ImageView)findViewById(R.id.blueeyes);

        imageview1.setVisibility(View.INVISIBLE);
        imageview2.setVisibility(View.VISIBLE);

        final ImageView bluebg = (ImageView)findViewById(R.id.bg4);

        bluebg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageview1.setVisibility(View.VISIBLE);
                imageview2.setVisibility(View.INVISIBLE);
            }
        });
    }
}
