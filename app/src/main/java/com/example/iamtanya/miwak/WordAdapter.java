package com.example.iamtanya.miwak;

import android.content.Context;
import android.media.Image;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by iamtanya on 4/24/2018.
 */

public class WordAdapter extends RecyclerView.Adapter<WordAdapter.MyViewHolder> {
    ArrayList<Word> arrayList;
    Context context;

    public WordAdapter(ArrayList<Word> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.listitem,parent,false);
        final MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.def_name.setText(arrayList.get(position).getDefault_word());
        holder.miw_name.setText(arrayList.get(position).getMiwok_word());
        holder.imageView.setImageResource(arrayList.get(position).getImageView());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyViewHolder  extends RecyclerView.ViewHolder{
        TextView def_name;
        TextView miw_name;
        ImageView imageView;

        public MyViewHolder(View itemView) {
            super(itemView);
           def_name = itemView.findViewById(R.id.default_text);
           miw_name = itemView.findViewById(R.id.miwok_text);
           imageView = itemView.findViewById(R.id.image);
        }
    }
}
