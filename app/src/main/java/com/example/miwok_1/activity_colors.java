package com.example.miwok_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

public class activity_colors extends AppCompatActivity {
    RecyclerView recyclerView;
    String s1[],s2[];
    int images[]={R.drawable.color_red,R.drawable.color_green,R.drawable.color_brown,R.drawable.color_gray,R.drawable.color_white,R.drawable.color_black,R.drawable.color_mustard_yellow,R.drawable.color_dusty_yellow};
    int media[]={R.raw.color_red,R.raw.color_green,R.raw.color_brown,R.raw.color_gray,R.raw.color_white,R.raw.color_black,R.raw.color_mustard_yellow,R.raw.color_dusty_yellow};
    int colourResourceid=R.color.colors;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        recyclerView=findViewById(R.id.colors);
        s1=getResources().getStringArray(R.array.miwok_colors);
        s2=getResources().getStringArray(R.array.english_colors);
        MyAdapter myAdapter=new MyAdapter(this,s1,s2,images,media,colourResourceid);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
