package com.example.brandonstevenmutiz.mundial.leyenda.Presenter;

import com.example.brandonstevenmutiz.mundial.leyenda.model.Leyenda;
import com.example.brandonstevenmutiz.mundial.profesional.model.Profesional;

import java.util.List;

public interface LeyendaPresenter {
    void showResultLeyenda(List<Leyenda> leyendaList);
    void getDataLeyenda();
}
