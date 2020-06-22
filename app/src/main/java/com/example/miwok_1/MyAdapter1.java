package com.example.miwok_1;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter1 extends RecyclerView.Adapter<MyAdapter1.MyViewHolder> {
    String d3[],d4[];
    Context con;
    int media[];
    MediaPlayer myMediaPlayer;
    public MyAdapter1(Context ct,String s3[],String s4[],int m[]){
        d3=s3;
        d4=s4;
        con=ct;
        media=m;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater1=LayoutInflater.from(con);
        View view1=inflater1.inflate(R.layout.my_row1,parent,false);
        return new MyViewHolder(view1);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.myText3.setText(d3[position]);
        holder.myText4.setText(d4[position]);
        holder.myLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myMediaPlayer = MediaPlayer.create(con, media[position]);
                myMediaPlayer.start();

            }
        });


    }

    @Override
    public int getItemCount() {
        return d3.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView myText3,myText4;
        LinearLayout myLayout1;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            myText3=itemView.findViewById(R.id.myText3);
            myText4=itemView.findViewById(R.id.myText4);
            myLayout1=itemView.findViewById(R.id.myLayout1);
        }
    }
}
