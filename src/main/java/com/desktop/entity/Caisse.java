package com.desktop.entity;

import javax.persistence.*;

@Entity
@Table
public class Caisse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id ;
    @Column(
            unique = true
    )
    private int uid ;
    @Column
    private String designation ;
    @Column
    private double soldeDepart ;
    @Column
    private double solde ;

    public Caisse() {
    }

    public Caisse(int id, String designation, double soldeDepart, double solde) {
        this.id = id;
        this.designation = designation;
        this.soldeDepart = soldeDepart;
        this.solde = solde;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSoldeDepart() {
        return soldeDepart;
    }

    public void setSoldeDepart(double soldeDepart) {
        this.soldeDepart = soldeDepart;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "Caisse{" +
                "id=" + id +
                ", designation='" + designation + '\'' +
                ", soldeDepart='" + soldeDepart + '\'' +
                ", solde='" + solde + '\'' +
                '}';
    }
}
