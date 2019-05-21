package com.cookandroid.myassistant;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MarketDetail extends AppCompatActivity {
    public TextView detailviewTitle;
    public TextView detailviewAuthor;
    public ImageView detailImage;
    public TextView detailviewDetail;
    public TextView detailviewTextview;
    public Button priceButton;

    //Market Market;

    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market_detail);

        //position = getIntent().getIntExtra("position", 1);
        //Market = new Market();

        Button priceButton = (Button) findViewById(R.id.priceButton);

        TextView detailviewTitle = (TextView) findViewById(R.id.detailviewTitle);
        TextView detailviewAuthor = (TextView) findViewById(R.id.detailviewAuthor);
        ImageView detailImage = (ImageView) findViewById(R.id.detailviewImage);
        TextView detailviewDetail = (TextView) findViewById(R.id.detailviewDetail);
        TextView detailviewTextview = (TextView) findViewById(R.id.detailviewTextview);

//        detailviewTitle.setText(Market.myDataset.get(position).title);
//        detailviewAuthor.setText(Market.myDataset.get(position).author);
//        detailImage.setImageResource(Market.myDataset.get(position).img);
//        detailviewDetail.setText(Market.myDataset.get(position).detail);
//        detailviewTextview.setText(Market.myDataset.get(position).text);
//        priceButton.setText(Market.myDataset.get(position).price);

        String title = getIntent().getStringExtra("title");
        String author = getIntent().getStringExtra("author");
        int img = getIntent().getIntExtra("img", 1);
        String detail = getIntent().getStringExtra("detail");
        String tag = getIntent().getStringExtra("tag");
        int price = getIntent().getIntExtra("price", 1);

        detailviewTitle.setText(title);
        detailviewAuthor.setText(author +" 님 작품");
        detailImage.setImageResource(img);
        detailviewDetail.setText(detail);
        detailviewTextview.setText(tag);
        priceButton.setText(price + " 원");

        priceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "구매가 완료되었습니다.", Toast.LENGTH_LONG).show();
            }
        });
    }
}
