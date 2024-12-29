package net.javaguides.dentiste.model;

import jakarta.persistence.*;

@Entity
@Table(name = "actes")
public class Acte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int acteId;

    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "rv_id", nullable = false)
    private RendezVous rendezVous;

    private String libelle;
    private String dents;
    
    public int getActeId() {
        return acteId;
    }
    
    public void setActeId(int acteId) {
        this.acteId = acteId;
    }
    
    public Patient getPatient() {
        return patient;
    }
    
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    public RendezVous getRendezVous() {
        return rendezVous;
    }
    
    public void setRendezVous(RendezVous rendezVous) {
        this.rendezVous = rendezVous;
    }
    
    public String getLibelle() {
        return libelle;
    }
    
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    
    public String getDents() {
        return dents;
    }
    
    public void setDents(String dents) {
        this.dents = dents;
    }
    
}
