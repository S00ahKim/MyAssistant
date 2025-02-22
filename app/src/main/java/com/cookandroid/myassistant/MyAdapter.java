package com.cookandroid.myassistant;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private ArrayList<MyData> mDataset;
    public int clickedPosition;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public ImageView mImageView;
        public TextView mTextView;
        public  TextView Title;
        public TextView Author;

        public ViewHolder(View view) {
            super(view);
            Title = (TextView)view.findViewById(R.id.itemTitle);
            Author = (TextView) view.findViewById(R.id.author);
            mImageView = (ImageView)view.findViewById(R.id.cardImage);
            mTextView = (TextView)view.findViewById(R.id.textview);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter(ArrayList<MyData> myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.my_view, parent, false);

        // set the view's size, margins, paddings and layout parameter
        final ViewHolder vh = new ViewHolder(v);

        vh.itemView.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                clickedPosition = vh.getAdapterPosition();
                Intent intent = new Intent(view.getContext(), MarketDetail.class);
                intent.putExtra("title", mDataset.get(clickedPosition).title);
                intent.putExtra("author", mDataset.get(clickedPosition).author);
                intent.putExtra("img", mDataset.get(clickedPosition).img);
                intent.putExtra("detail", mDataset.get(clickedPosition).detail);
                intent.putExtra("tag", mDataset.get(clickedPosition).text);
                intent.putExtra("price", mDataset.get(clickedPosition).price);
                view.getContext().startActivity(intent);
            }
        });
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.Title.setText(mDataset.get(position).title);
        holder.Author.setText(mDataset.get(position).author);
        holder.mTextView.setText(mDataset.get(position).text);
        holder.mImageView.setImageResource(mDataset.get(position).img);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}

class MyData{
    public String text;
    public int img;
    public String title;
    public String author;

    public String detail;
    public int price;

    public MyData(String title, String author, String text, int img, String detail, int price){
        this.title = title;
        this.author = author;
        this.text = text;
        this.img = img;
        this.detail = detail;
        this.price = price;
    }
}
