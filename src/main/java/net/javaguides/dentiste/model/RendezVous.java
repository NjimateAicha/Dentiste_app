package net.javaguides.dentiste.model;
import jakarta.persistence.*;

import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "rendezvous")
public class RendezVous {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rvId;

    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "docteur_id", nullable = false)
    private Docteur docteur;

    private Date dateRv;
    private LocalTime duree;
    private String status;

    public int getRvId() {
        return rvId;
    }

    public void setRvId(int rvId) {
        this.rvId = rvId;
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

    public Date getDateRv() {
        return dateRv;
    }

    public void setDateRv(Date dateRv) {
        this.dateRv = dateRv;
    }

    public LocalTime getDuree() {
        return duree;
    }

    public void setDuree(LocalTime duree) {
        this.duree = duree;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
