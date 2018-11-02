package com.blogspot.yourfavoritekaisar.tourdfrance;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecyclerActivity extends AppCompatActivity {

    @BindView(R.id.my_recycler_view)
    RecyclerView myRecyclerView;

    String[] nama_Landmark,detail_Landmark;
    int[] gambar_landmark;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        ButterKnife.bind(this);

        nama_Landmark = getResources().getStringArray(R.array.nama_landmark);
        detail_Landmark = getResources().getStringArray(R.array.detail_landmar);
        gambar_landmark = new int[]{R.drawable.eifell,R.drawable.lource,R.drawable.arc,R.drawable.notre,
        R.drawable.versalies,R.drawable.riviera,R.drawable.chapms,R.drawable.sacre};

        adapterPerancos adapterPerancos = new adapterPerancos(RecyclerActivity.this, gambar_landmark,nama_Landmark,detail_Landmark);

        myRecyclerView.setHasFixedSize(true);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(RecyclerActivity.this));
        myRecyclerView.setAdapter((RecyclerView.Adapter) adapterPerancos);
    }
}
