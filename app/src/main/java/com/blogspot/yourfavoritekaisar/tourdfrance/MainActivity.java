package com.blogspot.yourfavoritekaisar.tourdfrance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btnperancis)
    Button btnperancis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnperancis)
    public void onViewClicked() {
        Intent pindah = new Intent(MainActivity.this, RecyclerActivity.class);
        startActivity(pindah);
    }
}
