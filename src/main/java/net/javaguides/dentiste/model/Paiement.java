package net.javaguides.dentiste.model;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "paiements")
public class Paiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int paiementId;

    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "docteur_id", nullable = false)
    private Docteur docteur;

    private double montant;
    private double paye;
    private double rembourse;
    private Date dateFacture;

    public int getPaiementId() {
        return paiementId;
    }

    public void setPaiementId(int paiementId) {
        this.paiementId = paiementId;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Docteur getDocteur() {
        return docteur;
    }

    public void setDocteur(Docteur docteur) {
        this.docteur = docteur;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public double getPaye() {
        return paye;
    }

    public void setPaye(double paye) {
        this.paye = paye;
    }

    public double getRembourse() {
        return rembourse;
    }

    public void setRembourse(double rembourse) {
        this.rembourse = rembourse;
    }

    public Date getDateFacture() {
        return dateFacture;
    }

    public void setDateFacture(Date dateFacture) {
        this.dateFacture = dateFacture;
    }


}
