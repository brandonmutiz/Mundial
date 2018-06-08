package com.example.brandonstevenmutiz.mundial.mundial.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.brandonstevenmutiz.mundial.R;
import com.example.brandonstevenmutiz.mundial.mundial.model.Mundial;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MundialAdapter extends RecyclerView.Adapter{
    List<Mundial> mundialList;
    Context context;

    public MundialAdapter(List<Mundial> mundialList, Context context) {
        this.mundialList = mundialList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mundiales, parent, false);
        return new ViewHolderMundial(item);
}

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Mundial object = mundialList.get(position);
        ViewHolderMundial viewHolderMundial = (ViewHolderMundial) holder;
        viewHolderMundial.textViewNombre.setText(object.getNom_mundi());
        Picasso.get().load(object.getPhoto()).into(viewHolderMundial
                .imageViewMundial);
    }

    @Override
    public int getItemCount() {
        return mundialList.size();
    }
    public class ViewHolderMundial extends RecyclerView.ViewHolder {
        TextView textViewNombre;
        ImageView imageViewMundial;

        public ViewHolderMundial(View item) {
            super(item);
           textViewNombre=item.findViewById(R.id.id_txv_stadium_name);
           imageViewMundial=item.findViewById(R.id.id_img_mundiales);
        }
    }
}
