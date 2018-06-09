package com.example.brandonstevenmutiz.mundial.profesional.model;

public class Profesional {
    private String nom_tipo;
    private String nom_pregunta;
    private String correcta;
    private String respuesta1;
    private String respuesta2;
    private String respuesta3;
    private String respuesta4;

    public String getNom_tipo() {
        return nom_tipo;
    }

    public void setNom_tipo(String nom_tipo) {
        this.nom_tipo = nom_tipo;
    }

    public String getNom_pregunta() {
        return nom_pregunta;
    }

    public void setNom_pregunta(String nom_pregunta) {
        this.nom_pregunta = nom_pregunta;
    }

    public String getCorrecta() {
        return correcta;
    }

    public void setCorrecta(String correcta) {
        this.correcta = correcta;
    }

    public String getRespuesta1() {
        return respuesta1;
    }

    public void setRespuesta1(String respuesta1) {
        this.respuesta1 = respuesta1;
    }

    public String getRespuesta2() {
        return respuesta2;
    }

    public void setRespuesta2(String respuesta2) {
        this.respuesta2 = respuesta2;
    }

    public String getRespuesta3() {
        return respuesta3;
    }

    public void setRespuesta3(String respuesta3) {
        this.respuesta3 = respuesta3;
    }

    public String getRespuesta4() {
        return respuesta4;
    }

    public void setRespuesta4(String respuesta4) {
        this.respuesta4 = respuesta4;
    }

    public Profesional(String nom_tipo, String nom_pregunta, String correcta, String respuesta1, String respuesta2, String respuesta3, String respuesta4) {
        this.nom_tipo = nom_tipo;
        this.nom_pregunta = nom_pregunta;
        this.correcta = correcta;
        this.respuesta1 = respuesta1;
        this.respuesta2 = respuesta2;
        this.respuesta3 = respuesta3;
        this.respuesta4 = respuesta4;
    }
}
