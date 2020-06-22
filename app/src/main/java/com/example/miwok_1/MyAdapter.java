package com.example.miwok_1;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    String d1[],d2[];
    int images[];
    Context context;
    int media[];
    MediaPlayer myMediaPlayer;
    int color;
    public MyAdapter(Context ct,String s1[],String s2[],int img[],int m[],int c)
    {
        context=ct;
        d1=s1;
        d2=s2;
        images=img;
        media=m;
        color=c;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.my_row,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.myText1.setText(d1[position]);
        holder.myText2.setText(d2[position]);
        holder.myImage.setImageResource(images[position]);
        holder.myLayout.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                myMediaPlayer = MediaPlayer.create(context, media[position]);
                myMediaPlayer.start();

            }
        });
        holder.layout.setBackgroundColor(ContextCompat.getColor(context,color));

    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView myText1,myText2;
        ImageView myImage;
        ConstraintLayout myLayout;
        ConstraintLayout layout;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            myText1=itemView.findViewById(R.id.myText1);
            myText2=itemView.findViewById(R.id.myText2);
            myImage=itemView.findViewById(R.id.imageView);
            myLayout=itemView.findViewById(R.id.myLayout);
            layout=itemView.findViewById(R.id.layout);
        }
    }


}
