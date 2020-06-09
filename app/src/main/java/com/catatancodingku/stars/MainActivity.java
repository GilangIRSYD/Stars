package com.catatancodingku.stars;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    RecyclerView rvBintang;
    TextView tvaboutMe;
    ImageView imgaboutme;
    private ArrayList<Stars> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvBintang = findViewById(R.id.rvBintang);
        tvaboutMe = findViewById(R.id.tvAboutme);
        imgaboutme = findViewById(R.id.imgaboutMe);

        rvBintang.setHasFixedSize(true);
        tvaboutMe.setOnClickListener(this);
        imgaboutme.setOnClickListener(this);

        list.addAll(StarsData.getListData());
        showRecyclerView();

    }

    private void showRecyclerView() {
        rvBintang.setLayoutManager(new LinearLayoutManager(this));
        ListBintangAdapter adapterBintang = new ListBintangAdapter(list);
        rvBintang.setAdapter(adapterBintang);
    }

    @Override
    public void onClick(View v) {
        Intent aboutme = new Intent(this,AboutMe.class);
        switch (v.getId()){

            case R.id.tvAboutme:

                startActivity(aboutme);
                break;

            case R.id.imgaboutMe:

                startActivity(aboutme);
                break;
        }
    }
}
