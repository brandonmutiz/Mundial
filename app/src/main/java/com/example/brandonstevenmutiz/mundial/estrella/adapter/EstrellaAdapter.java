package com.example.brandonstevenmutiz.mundial.estrella.adapter;

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
import com.example.brandonstevenmutiz.mundial.profesional.adapter.ProfesionalAdapter;
import com.example.brandonstevenmutiz.mundial.profesional.model.Profesional;

import java.util.List;

public class EstrellaAdapter  extends RecyclerView.Adapter{
    List<Estrella> estrellaList;
    Context context;

    public EstrellaAdapter(List<Estrella> estrellaList, Context context){

            this.estrellaList= estrellaList;
            this.context=context;
        }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pregunta,parent,false);

        return new ViewHolderEstrella(item);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Estrella object = estrellaList.get(position);
        ViewHolderEstrella viewHolderEstrella = (ViewHolderEstrella) holder;
        viewHolderEstrella.textViewPregunta.setText(object.getNom_pregunta());
        viewHolderEstrella.radioButton1.setText(object.getRespuesta1());
        viewHolderEstrella.radioButton2.setText(object.getRespuesta2());
        viewHolderEstrella.radioButton3.setText(object.getRespuesta3());
        viewHolderEstrella.radioButton4.setText(object.getRespuesta4());
    }

    @Override
    public int getItemCount() {
        return estrellaList.size();

    }
    public class ViewHolderEstrella extends RecyclerView.ViewHolder{
        TextView textViewPregunta;
        RadioButton radioButton1,radioButton2,radioButton3,radioButton4;


        public ViewHolderEstrella(View item) {
            super(item);
            textViewPregunta=item.findViewById(R.id.id_pregunta);
            radioButton1=item.findViewById(R.id.id_res1);
            radioButton2=item.findViewById(R.id.id_res2);
            radioButton3=item.findViewById(R.id.id_res3);
            radioButton4=item.findViewById(R.id.id_res4);
        }
    }

    }

