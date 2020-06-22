package com.example.miwok_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

public class activity_family extends AppCompatActivity {
    RecyclerView recyclerView;
    String s1[],s2[];
    int images[]={R.drawable.family_father,R.drawable.family_mother,R.drawable.family_son,R.drawable.family_daughter,R.drawable.family_older_brother,R.drawable.family_younger_brother,R.drawable.family_older_sister,R.drawable.family_younger_sister,R.drawable.family_grandfather,R.drawable.family_grandmother};
    int media[]={R.raw.family_father,R.raw.family_mother,R.raw.family_son,R.raw.family_daughter,R.raw.family_older_brother,R.raw.family_younger_brother,R.raw.family_older_sister,R.raw.family_younger_sister,R.raw.family_grandfather,R.raw.family_grandmother};
    int colourResourceid=R.color.family;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        recyclerView=findViewById(R.id.family);
        s1=getResources().getStringArray(R.array.miwok_name);
        s2=getResources().getStringArray(R.array.english_name);
        MyAdapter myAdapter=new MyAdapter(this,s1,s2,images,media,colourResourceid);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
