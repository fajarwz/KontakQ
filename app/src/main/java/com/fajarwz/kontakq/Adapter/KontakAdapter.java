package com.fajarwz.kontakq.Adapter;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.fajarwz.kontakq.EditActivity;
import com.fajarwz.kontakq.Model.Kontak;
import com.fajarwz.kontakq.R;

import java.util.List;

/*
    Dengan KontakAdapter RecyclerView pada MainActivity akan menampilkan data
    yang diterima dengan layout yang telah didefinisikan pada kontak_list.
 */

public class KontakAdapter extends RecyclerView.Adapter<KontakAdapter.MyViewHolder> {
    List<Kontak> mKontakList;

    public KontakAdapter(List<Kontak> KontakList){
        mKontakList = KontakList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.kontak_list, parent, false);
        MyViewHolder mViewHolder = new MyViewHolder(mView);
        return mViewHolder;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.mTextViewId.setText("Id = "+mKontakList.get(position).getId());
        holder.mTextViewNama.setText("Nama = "+mKontakList.get(position).getNama());
        holder.mTextViewNomor.setText("Nomor = "+mKontakList.get(position).getNomor());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(view.getContext(), EditActivity.class);
                mIntent.putExtra("Id", mKontakList.get(position).getId());
                mIntent.putExtra("Nama", mKontakList.get(position).getNama());
                mIntent.putExtra("Nomor", mKontakList.get(position).getNomor());
                view.getContext().startActivity(mIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mKontakList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView mTextViewId, mTextViewNama, mTextViewNomor;

        public MyViewHolder(View itemView){
            super(itemView);
            mTextViewId = itemView.findViewById(R.id.tvId);
            mTextViewNama = itemView.findViewById(R.id.tvNama);
            mTextViewNomor = itemView.findViewById(R.id.tvNomor);
        }
    }

}
