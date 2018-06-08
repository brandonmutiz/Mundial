package com.example.brandonstevenmutiz.mundial.mundial.model;

public class Mundial {
    private String nom_mundi;

    public String getNom_mundi() {
        return nom_mundi;
    }

    public void setNom_mundi(String nom_mundi) {
        this.nom_mundi = nom_mundi;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Mundial(String nom_mundi, String photo) {
        this.nom_mundi = nom_mundi;

        this.photo = photo;
    }

    private String photo;
}
