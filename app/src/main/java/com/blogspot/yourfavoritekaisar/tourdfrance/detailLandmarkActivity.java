package com.blogspot.yourfavoritekaisar.tourdfrance;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;

public class detailLandmarkActivity extends AppCompatActivity {

    @BindView(R.id.txtDetail)
    TextView txtDetail;
    @BindView(R.id.txt_Bio)
    TextView txtBio;
    @BindView(R.id.imgLandmark)
    ImageView imgLandmark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_landmark);
        ButterKnife.bind(this);

        txtDetail.setText(getIntent().getStringExtra("nl"));
        txtBio.setText(getIntent().getStringExtra("dl"));
        Glide.with(this).load(getIntent().getIntExtra("gl", 0)).into(imgLandmark);
    }
}
