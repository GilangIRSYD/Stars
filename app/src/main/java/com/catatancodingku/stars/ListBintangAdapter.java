package com.catatancodingku.stars;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListBintangAdapter extends RecyclerView.Adapter<ListBintangAdapter.ViewHolder> {
    private ArrayList<Stars> listBintang;

    public ListBintangAdapter(ArrayList<Stars> listBintang) {
        this.listBintang = listBintang;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.inflate,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Stars bintang = listBintang.get(position);
        holder.namaLayout.setText(bintang.getName());
        holder.detailLayout.setText(bintang.getDetail());
        Glide.with(holder.itemView.getContext()).
                load(bintang.getFoto()).
                apply(new RequestOptions().transform(new CenterCrop(),new RoundedCorners(30))).
                into(holder.fotoLayout);

    }

    @Override
    public int getItemCount() {
        return listBintang.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView fotoLayout;
        TextView namaLayout;
        TextView detailLayout;
        ConstraintLayout viewSelect;
        private Context context;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            fotoLayout = itemView.findViewById(R.id.fotoLayout);
            namaLayout = itemView.findViewById(R.id.tvJudulContent);
            detailLayout = itemView.findViewById(R.id.tvDescContent);
            viewSelect = itemView.findViewById(R.id.constLayoutClick);

            context = itemView.getContext();
            viewSelect.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();

                    switch (getAdapterPosition()){
                        case 0:
                            intent = new Intent(context,Matahari.class);
                            break;
                        case 1:
                            intent = new Intent(context, Sirius.class);
                            break;
                        case 2:
                            intent = new Intent(context,Rigel.class);
                            break;
                        case 3:
                            intent = new Intent(context, Betelgeuse.class);
                            break;
                        case 4:
                            intent = new Intent(context,Aldebaran.class);
                            break;
                        case 5:
                            intent = new Intent(context, Arcturus.class);
                            break;
                        case 6:
                            intent = new Intent(context,Vega.class);
                            break;
                        case 7:
                            intent = new Intent(context, Canopus.class);
                            break;
                        case 8:
                            intent = new Intent(context,Antares.class);
                            break;
                        case 9:
                            intent = new Intent(context, Capella.class);
                            break;
                    }
                    context.startActivity(intent);
                }
            });
        }
    }
}
