package com.cookandroid.myassistant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SkinDetail extends AppCompatActivity {
    public TextView name;
    public ImageView img;
    public Button adaptButton;

    String skinname;
    int skinimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skin_detail);

        TextView name = (TextView) findViewById(R.id.skinName);
        ImageView img = (ImageView) findViewById(R.id.skinImage);
        Button adaptButton = (Button) findViewById(R.id.adaptButton);

        skinname = getIntent().getStringExtra("name");
        skinimg = getIntent().getIntExtra("img", 1);

        name.setText(skinname);
        img.setImageResource(skinimg);

        adaptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "적용되었습니다.", Toast.LENGTH_LONG).show();
            }
        });


    }
}
