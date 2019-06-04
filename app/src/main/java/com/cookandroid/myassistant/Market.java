package com.cookandroid.myassistant;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;

import java.util.ArrayList;

public class Market extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView fRecyclerView;
    private RecyclerView nRecyclerView;
    private RecyclerView eRecyclerView;

    private RecyclerView.Adapter mAdapter;
    private RecyclerView.Adapter fAdapter;
    private RecyclerView.Adapter nAdapter;
    private RecyclerView.Adapter eAdapter;

    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView.LayoutManager fLayoutManager;
    private RecyclerView.LayoutManager nLayoutManager;
    private RecyclerView.LayoutManager eLayoutManager;

    public static ArrayList<MyData> myDataset;
    public ArrayList<MyData> femaleDataset;
    public ArrayList<MyData> maleDataset;
    public ArrayList<MyData> etcDataset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market);

        TabHost tabHost1 = (TabHost) findViewById(R.id.tabHost1);
        tabHost1.setup();

        // 첫 번째 Tab. (탭 표시 텍스트:"TAB 1"), (페이지 뷰:"content1")
        TabHost.TabSpec ts1 = tabHost1.newTabSpec("Tab Spec 1");
        ts1.setContent(R.id.content1);
        ts1.setIndicator("인기");
        tabHost1.addTab(ts1);

        TabHost.TabSpec ts2 = tabHost1.newTabSpec("Tab Spec 2");
        ts2.setContent(R.id.content2);
        ts2.setIndicator("여성");
        tabHost1.addTab(ts2);

        TabHost.TabSpec ts3 = tabHost1.newTabSpec("Tab Spec 3");
        ts3.setContent(R.id.content3);
        ts3.setIndicator("남성");
        tabHost1.addTab(ts3);

        TabHost.TabSpec ts4 = tabHost1.newTabSpec("Tab Spec 4");
        ts4.setContent(R.id.content4);
        ts4.setIndicator("기타");
        tabHost1.addTab(ts4);

        //-----------------------------------------------------------------------------------------------------------

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        myDataset = new ArrayList<>();
        mAdapter = new MyAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);

        myDataset.add(new MyData("루시아", "핑크조아", "#분홍머리, #공주님", R.drawable.favitem1, "분홍색을 좋아하시는 분들을 위해 만들어 보았습니다 ^^ 예쁘게 써주세요!", 300));
        myDataset.add(new MyData("강아지안은꼬마", "댕댕이", "#멍멍이와_함께, #안경, #발랄", R.drawable.favitem2, "강아지를 안은 꼬마가 제일 귀여운 법!!", 500));
        myDataset.add(new MyData("기본이미지", "MyAssistant", "#기본이_최고", R.drawable.defaultimage, "기본으로 제공되는 이미지입니다.", 0));

        // 여성 목록--------------------------------------------------------------------------------------------------------------
        fRecyclerView = (RecyclerView) findViewById(R.id.femaleItemMarket);

        fRecyclerView.setHasFixedSize(true);

        fLayoutManager = new LinearLayoutManager(this);
        fRecyclerView.setLayoutManager(fLayoutManager);

        femaleDataset = new ArrayList<>();
        fAdapter = new MyAdapter(femaleDataset);
        fRecyclerView.setAdapter(fAdapter);

        femaleDataset.add(new MyData("갈색머리", "soyoung3", "#갈색머리, #초록눈", R.drawable.femaleitem1,"",100));
        femaleDataset.add(new MyData("엘사", "프로즌짱", "#하얀머리, #차분, #파란색", R.drawable.femaleitem2,"",100));
        femaleDataset.add(new MyData("붉은악마", "오필승코리아", "#카드놀이, #게임지원", R.drawable.femaleitem3,"",100));
        femaleDataset.add(new MyData("파이걸", "쿠우", "#검은머리, #파이만들기, #갈색배경", R.drawable.femaleitem4,"",100));

        // 남성 목록----------------------------------------------------------------------------------------------------------------
        nRecyclerView = (RecyclerView) findViewById(R.id.maleItemMarket);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        nRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        nLayoutManager = new LinearLayoutManager(this);
        nRecyclerView.setLayoutManager(nLayoutManager);

        // specify an adapter (see also next example)
        maleDataset = new ArrayList<>();
        nAdapter = new MyAdapter(maleDataset);
        nRecyclerView.setAdapter(nAdapter);

        // 이 부분으로 데이터를 추가하는 것!!
        maleDataset.add(new MyData("철수", "철수주인", "#양복, #파란배경", R.drawable.maleitem1,"",100));
        maleDataset.add(new MyData("무서운녀석", "jung2", "#한대칠것같아요, #무섭지만착해요", R.drawable.maleitem2,"",100));
        maleDataset.add(new MyData("유에", "체리가좋아", "#망했어요, #아무리봐도유에아님", R.drawable.maleitem3,"",100));
        maleDataset.add(new MyData("특이한애", "xmrdlxmrdl", "#보라머리, #안경", R.drawable.maleitem4,"",100));

        // 기타 목록--------------------------------------------------------------------------------------------------------------
        eRecyclerView = (RecyclerView) findViewById(R.id.etcItemMarket);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        eRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        eLayoutManager = new LinearLayoutManager(this);
        eRecyclerView.setLayoutManager(eLayoutManager);

        // specify an adapter (see also next example)
        etcDataset = new ArrayList<>();
        eAdapter = new MyAdapter(etcDataset);
        eRecyclerView.setAdapter(eAdapter);

        // 이 부분으로 데이터를 추가하는 것!!
        etcDataset.add(new MyData("생선주세요", "todtjswn", "#점박이, #고양이", R.drawable.etcitem1,"",100));
        etcDataset.add(new MyData("책읽는 야옹이", "cat", "#무슨책을읽고있니", R.drawable.etcitem2,"",100));
        etcDataset.add(new MyData("루니", "루니맘", "#꽃이_좋은_고양이, #리본꼬리", R.drawable.etcitem3,"",100));


    }
}
