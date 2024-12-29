package net.javaguides.dentiste.model;

import jakarta.persistence.*;

@Entity
@Table(name = "docteurs")
public class Docteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int docteurId;

    private String nom;
    private String prenom;

    public int getDocteurId() {
        return docteurId;
    }

    public void setDocteurId(int docteurId) {
        this.docteurId = docteurId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

}
