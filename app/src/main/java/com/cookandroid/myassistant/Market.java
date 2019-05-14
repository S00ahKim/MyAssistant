package com.cookandroid.myassistant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class Market extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market);

        TabHost tabHost1 = (TabHost) findViewById(R.id.tabHost1) ;
        tabHost1.setup() ;

        // 첫 번째 Tab. (탭 표시 텍스트:"TAB 1"), (페이지 뷰:"content1")
        TabHost.TabSpec ts1 = tabHost1.newTabSpec("Tab Spec 1") ;
        ts1.setContent(R.id.content1) ;
        ts1.setIndicator("인기") ;
        tabHost1.addTab(ts1)  ;

        TabHost.TabSpec ts2 = tabHost1.newTabSpec("Tab Spec 2") ;
        ts2.setContent(R.id.content2) ;
        ts2.setIndicator("여성") ;
        tabHost1.addTab(ts2) ;

        TabHost.TabSpec ts3 = tabHost1.newTabSpec("Tab Spec 3") ;
        ts3.setContent(R.id.content3) ;
        ts3.setIndicator("남성") ;
        tabHost1.addTab(ts3) ;

        TabHost.TabSpec ts4 = tabHost1.newTabSpec("Tab Spec 4") ;
        ts4.setContent(R.id.content4) ;
        ts4.setIndicator("기타") ;
        tabHost1.addTab(ts4) ;
    }
}
