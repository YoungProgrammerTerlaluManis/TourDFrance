package com.blogspot.yourfavoritekaisar.tourdfrance;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class adapterPerancos extends RecyclerView.Adapter<adapterPerancos.ViewHolder> {
    Context context;
    int[] gambarLnmrk;
    String[] nama_lndmrk,dtil_lndmrk;

    public adapterPerancos(Context context, int[] gambarLnmrk, String[] nama_lndmrk, String[] dtil_lndmrk) {
        this.context = context;
        this.gambarLnmrk = gambarLnmrk;
        this.nama_lndmrk = nama_lndmrk;
        this.dtil_lndmrk = dtil_lndmrk;
    }


    @NonNull
    @Override
    public adapterPerancos.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_landmark, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull adapterPerancos.ViewHolder viewHolder, final int i) {
        viewHolder.txtLndmrk.setText(nama_lndmrk[i]);
        Glide.with(context).load(gambarLnmrk[i]).into(viewHolder.logo);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(context,detailLandmarkActivity.class);
                pindah.putExtra("nl", nama_lndmrk[i]);
                pindah.putExtra("dl", dtil_lndmrk[i]);
                pindah.putExtra("gl", gambarLnmrk[i]);
                context.startActivity(pindah);
            }
        });

    }

    @Override
    public int getItemCount() { return gambarLnmrk.length; }


    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView logo;
        TextView txtLndmrk;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            logo = itemView.findViewById(R.id.imgList);
            txtLndmrk = itemView.findViewById(R.id.txtLandmark);
        }
    }
}
