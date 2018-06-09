package com.example.brandonstevenmutiz.mundial.Respuestas.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.brandonstevenmutiz.mundial.R;
import com.example.brandonstevenmutiz.mundial.Respuestas.model.Respuestas;
import com.example.brandonstevenmutiz.mundial.profesional.adapter.ProfesionalAdapter;

import java.util.List;

public class RespuestasAdapter extends RecyclerView.Adapter{

    List<Respuestas> respuestasList;

    public RespuestasAdapter(List<Respuestas> respuestasList, Context context) {
        this.respuestasList = respuestasList;
        this.context = context;
    }

    Context context;
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_respuesta, parent, false);
        return new ViewHolderRespuestas(item) ;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Respuestas object = respuestasList.get(position);
        ViewHolderRespuestas viewHolderProfesional = (ViewHolderRespuestas) holder;
        viewHolderProfesional.textViewTipo.setText(object.getTipo());

        viewHolderProfesional.textViewRespuesta1.setText(object.getRespuesta1());
        viewHolderProfesional.textViewRespuesta2.setText(object.getRespuesta2());
        viewHolderProfesional.textViewRespuesta3.setText(object.getRespuesta3());
        viewHolderProfesional.textViewRespuesta4.setText(object.getRespuesta4());
        viewHolderProfesional.textViewRespuesta5.setText(object.getRespuesta5());

    }

    @Override
    public int getItemCount() {
        return respuestasList.size();
    }
    public class ViewHolderRespuestas extends RecyclerView.ViewHolder {
        TextView textViewTipo,textViewRespuesta1,textViewRespuesta2,textViewRespuesta3, textViewRespuesta4,textViewRespuesta5;


        public ViewHolderRespuestas(View item) {
            super(item);
            textViewTipo=item.findViewById(R.id.id_tipo);
            textViewRespuesta1=item.findViewById(R.id.resp1);
            textViewRespuesta2=item.findViewById(R.id.resp2);
            textViewRespuesta3=item.findViewById(R.id.resp3);
            textViewRespuesta4=item.findViewById(R.id.resp4);
            textViewRespuesta5=item.findViewById(R.id.resp5);

        }
    }
}
