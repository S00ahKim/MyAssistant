package com.cookandroid.myassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button nameSubmit = (Button) findViewById(R.id.namesubmit);
        final TextView name = (TextView) findViewById(R.id.assistantname);
        final LinearLayout editName = (LinearLayout) findViewById(R.id.editassistantname) ;
        final EditText nameEdit = (EditText) findViewById(R.id.nameedit);

        editName.setVisibility(View.INVISIBLE);

        name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name.setVisibility(View.INVISIBLE);
                editName.setVisibility(View.VISIBLE);
            }
        });

        nameSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name.setText(nameEdit.getText());
                name.setVisibility(View.VISIBLE);
                editName.setVisibility(View.INVISIBLE);
            }
        });

        Button editButton = (Button) findViewById(R.id.editButton) ;
        Button mySkinButton = (Button) findViewById(R.id.mySkinButton);
        Button marketButton = (Button) findViewById(R.id.marketButton);

        editButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), EditAssistantFH.class);
                startActivity(intent);
            }
        });

        mySkinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MySkin.class);
                startActivity(intent);
            }
        });

        marketButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Market.class);
                startActivity(intent);
            }
        });

    }
}
