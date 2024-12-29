package net.javaguides.dentiste.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "historique")
public class Historique {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "docteur_id", nullable = false)
    private Docteur docteur;

    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "paiement_id")
    private Paiement paiement;

    @ManyToOne
    @JoinColumn(name = "rv_id")
    private RendezVous rendezVous;

    private Date dateDebut;
    private Date dateFin;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Docteur getDocteur() {
        return docteur;
    }

    public void setDocteur(Docteur docteur) {
        this.docteur = docteur;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Paiement getPaiement() {
        return paiement;
    }

    public void setPaiement(Paiement paiement) {
        this.paiement = paiement;
    }

    public RendezVous getRendezVous() {
        return rendezVous;
    }

    public void setRendezVous(RendezVous rendezVous) {
        this.rendezVous = rendezVous;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

}
