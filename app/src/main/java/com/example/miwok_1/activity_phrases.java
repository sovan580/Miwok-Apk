package com.example.miwok_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

public class activity_phrases extends AppCompatActivity {
    RecyclerView recyclerView1;
    String s3[],s4[];
    int media[]={R.raw.phrase_where_are_you_going,R.raw.phrase_what_is_your_name,R.raw.phrase_my_name_is,R.raw.phrase_how_are_you_feeling,R.raw.phrase_im_feeling_good,R.raw.phrase_are_you_coming,R.raw.phrase_yes_im_coming,R.raw.phrase_im_coming,R.raw.phrase_lets_go,R.raw.phrase_come_here};

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        recyclerView1=findViewById(R.id.phrases);
        s3=getResources().getStringArray(R.array.phrases_miwok);
        s4=getResources().getStringArray(R.array.phrases_english);
        MyAdapter1 myAdapter1=new MyAdapter1(this,s3,s4,media);
        recyclerView1.setAdapter(myAdapter1);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this));


    }
}
