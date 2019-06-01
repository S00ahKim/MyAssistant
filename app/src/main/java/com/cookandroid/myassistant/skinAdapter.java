package com.cookandroid.myassistant;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class skinAdapter extends RecyclerView.Adapter<skinAdapter.ViewHolder> {
    private int clickedPosition;
    private ArrayList<skinData> mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public ImageView skinimage;
        public  TextView skinName;

        public ViewHolder(View view) {
            super(view);
            skinName = (TextView)view.findViewById(R.id.myskinname);
            skinimage = (ImageView)view.findViewById(R.id.myskinimage);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public skinAdapter(ArrayList<skinData> myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public skinAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.skin_view, parent, false);

        // set the view's size, margins, paddings and layout parameter
        final ViewHolder vh = new ViewHolder(v);

        vh.itemView.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                clickedPosition = vh.getAdapterPosition();
                Intent intent = new Intent(view.getContext(), SkinDetail.class);
                intent.putExtra("name", mDataset.get(clickedPosition).name);
                intent.putExtra("img", mDataset.get(clickedPosition).img);
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
        holder.skinName.setText(mDataset.get(position).name);
        holder.skinimage.setImageResource(mDataset.get(position).img);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}

class skinData {
    public String name;
    public int img;

    public skinData(String name, int img){
        this.name = name;
        this.img = img;
    }
}
