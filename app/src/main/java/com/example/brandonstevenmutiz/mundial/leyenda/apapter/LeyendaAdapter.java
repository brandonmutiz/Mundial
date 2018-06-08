package com.example.brandonstevenmutiz.mundial.leyenda.apapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.brandonstevenmutiz.mundial.R;
import com.example.brandonstevenmutiz.mundial.estrella.model.Estrella;
import com.example.brandonstevenmutiz.mundial.leyenda.model.Leyenda;
import com.example.brandonstevenmutiz.mundial.profesional.adapter.ProfesionalAdapter;
import com.example.brandonstevenmutiz.mundial.profesional.model.Profesional;

import java.util.List;

public class LeyendaAdapter extends RecyclerView.Adapter{

    List<Leyenda> leyendaList;
    Context context;



    public LeyendaAdapter(List<Leyenda> leyendaList, Context context) {

        this.leyendaList=leyendaList;
        this.context=context;

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pregunta, parent, false);
        return  new ViewHolderLeyenda(item);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        Leyenda object= leyendaList.get(position);
        LeyendaAdapter.ViewHolderLeyenda viewHolderLeyenda = (LeyendaAdapter.ViewHolderLeyenda) holder;
        viewHolderLeyenda.textViewPregunta.setText(object.getNom_pregunta());
        viewHolderLeyenda.radioButton1.setText(object.getRespuesta1());
        viewHolderLeyenda.radioButton2.setText(object.getRespuesta2());
        viewHolderLeyenda.radioButton3.setText(object.getRespuesta3());
        viewHolderLeyenda.radioButton4.setText(object.getRespuesta4());
    }

    @Override
    public int getItemCount() {
        return leyendaList.size();
    }

    public  class ViewHolderLeyenda extends RecyclerView.ViewHolder{
        TextView textViewPregunta;
        RadioButton radioButton1,radioButton2,radioButton3,radioButton4;


        public ViewHolderLeyenda(View item) {
            super(item);
            textViewPregunta= item.findViewById(R.id.id_pregunta);
            radioButton1=item.findViewById(R.id.id_res1);
            radioButton2=item.findViewById(R.id.id_res2);
            radioButton3=item.findViewById(R.id.id_res3);
            radioButton4=item.findViewById(R.id.id_res4);
        }
    }
}
