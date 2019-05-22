package com.cookandroid.myassistant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MySkin extends AppCompatActivity {
    private RecyclerView MySkinView;
    private RecyclerView.Adapter skinAdapter;
    private RecyclerView.LayoutManager skinLayoutManager;
    private ArrayList<skinData> mySkinDataset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_skin);

        MySkinView = (RecyclerView) findViewById(R.id.my_skin_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        MySkinView.setHasFixedSize(true);

        // use a linear layout manager
        skinLayoutManager = new LinearLayoutManager(this);
        MySkinView.setLayoutManager(skinLayoutManager);

        // specify an adapter (see also next example)
        mySkinDataset = new ArrayList<>();
        skinAdapter = new skinAdapter(mySkinDataset);
        MySkinView.setAdapter(skinAdapter);

        // 이 부분으로 데이터를 추가하는 것!!
        mySkinDataset.add(new skinData("내가만든예제", R.drawable.twintail));
    }
}
