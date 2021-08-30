package com.desktop.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id ;
    @Column(
            unique = true
    )
    private int uid ;
    @Column
    private String nom ;
    @Column
    private String adresse ;
    @Column
    private String ville ;
    @Column
    private String telephone ;
    @Column
    private String mobile ;
    @Column
    private String role ;
    @Column
    private Date dateRecrutement ;
    @Column
    private Date datePayment ;
    @Column
    private double salaire ;
    @Column
    private double acompte ;

    public Employee() {
    }

    public Employee(int id, String nom, String adresse, String ville, String telephone, String mobile, String role, Date dateRecrutement, Date datePayment, double salaire, double acompte) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.ville = ville;
        this.telephone = telephone;
        this.mobile = mobile;
        this.role = role;
        this.dateRecrutement = dateRecrutement;
        this.datePayment = datePayment;
        this.salaire = salaire;
        this.acompte = acompte;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Date getDateRecrutement() {
        return dateRecrutement;
    }

    public void setDateRecrutement(Date dateRecrutement) {
        this.dateRecrutement = dateRecrutement;
    }

    public Date getDatePayment() {
        return datePayment;
    }

    public void setDatePayment(Date datePayment) {
        this.datePayment = datePayment;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public double getAcompte() {
        return acompte;
    }

    public void setAcompte(double acompte) {
        this.acompte = acompte;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", ville='" + ville + '\'' +
                ", telephone='" + telephone + '\'' +
                ", mobile='" + mobile + '\'' +
                ", role='" + role + '\'' +
                ", dateRecrutement=" + dateRecrutement +
                ", datePayment=" + datePayment +
                ", salaire=" + salaire +
                ", acompte=" + acompte +
                '}';
    }
}
