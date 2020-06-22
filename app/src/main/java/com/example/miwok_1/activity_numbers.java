package com.example.miwok_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

public class activity_numbers extends AppCompatActivity {
    RecyclerView recyclerView;
    String s1[],s2[];
    int images[]={R.drawable.number_one,R.drawable.number_two,R.drawable.number_three,R.drawable.number_four,R.drawable.number_five,R.drawable.number_six,R.drawable.number_seven,R.drawable.number_eight,R.drawable.number_nine,R.drawable.number_ten};
    int media[]={R.raw.number_one,R.raw.number_two,R.raw.number_three,R.raw.number_four,R.raw.number_five,R.raw.number_six,R.raw.number_seven,R.raw.number_eight,R.raw.number_nine,R.raw.number_ten};
    int colourResourceid=R.color.number;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        recyclerView=findViewById(R.id.numbers);
        s1=getResources().getStringArray(R.array.miwok_number);
        s2=getResources().getStringArray(R.array.english_numbers);
        MyAdapter myAdapter=new MyAdapter(this,s1,s2,images,media,colourResourceid);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
