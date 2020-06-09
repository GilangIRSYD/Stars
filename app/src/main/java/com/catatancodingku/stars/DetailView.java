package com.catatancodingku.stars;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailView extends AppCompatActivity {

    ImageView imgDetail;
    TextView tvJudulDetail, tvDetail;
    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_view);

        imgDetail = findViewById(R.id.imgDetail);
        tvJudulDetail = findViewById(R.id.tvJudulDetail);
        tvDetail = findViewById(R.id.tvDetail);
        btnBack = findViewById(R.id.back);
        
    }
}
