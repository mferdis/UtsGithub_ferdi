package com.example.utsgithub_ferdi;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {

    private ArrayList<Myitem> mdataList;
    private onItemClickListener mListener;


    public interface onItemClickListener {
        void onItemClick(int position);
    }

    public void setOnItemClickListener(onItemClickListener listener) {
        mListener = listener;
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder {

        public ImageView mImageView;
        public TextView mTextView1;
        public TextView mTextView2;

        public ItemViewHolder(@NonNull View itemView, onItemClickListener listener) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.imageList);
            mTextView1 = itemView.findViewById(R.id.tvTitle);
            mTextView2 = itemView.findViewById(R.id.tvSub);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION){
                            listener.onItemClick(position);
                        }
                    }
                }
            });
        }
    }

    public ItemAdapter(ArrayList<Myitem> dataList) {
        mdataList = dataList;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        ItemViewHolder ivh = new ItemViewHolder(v, mListener);
        return ivh;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        final Myitem tItem = mdataList.get(position);

        holder.mImageView.setImageResource(tItem.getMimageResource());
        holder.mTextView1.setText(tItem.getmText1());
        holder.mTextView2.setText(tItem.getmText2());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(), Activity2.class);
                intent.putExtra("Myitem", tItem);
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mdataList.size();
    }

}
