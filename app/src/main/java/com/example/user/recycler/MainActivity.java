package com.example.user.recycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<AndroidApi> androidApis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        androidApis= new ArrayList<>();

        init();

    }

    public void init(){

        androidApis.add(new AndroidApi("Ginger","1",R.drawable.ic_launcher_background));
        androidApis.add(new AndroidApi("Ginger","1",R.drawable.ic_launcher_background));
        androidApis.add(new AndroidApi("Ginger","1",R.drawable.ic_launcher_background));
        androidApis.add(new AndroidApi("M","1",R.drawable.ic_launcher_background));

        setRec(androidApis);

    }

    public void setRec(List<AndroidApi> androidApis){

        RecyclerView recyclerView=findViewById(R.id.list_rec);

        CustomAdapter customAdapter= new CustomAdapter(this,androidApis);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(customAdapter);

    }
}
