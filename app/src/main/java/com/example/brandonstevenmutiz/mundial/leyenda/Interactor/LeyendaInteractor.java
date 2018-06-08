package com.example.brandonstevenmutiz.mundial.leyenda.Interactor;

import com.example.brandonstevenmutiz.mundial.leyenda.model.Leyenda;
import com.example.brandonstevenmutiz.mundial.profesional.model.Profesional;

import java.util.List;

public interface LeyendaInteractor {
    void getDataLeyenda();
    void showResultLeyenda(List<Leyenda> leyendaList);
}
