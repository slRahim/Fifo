package com.desktop.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column(unique = true , nullable = false)
    private int uid;
    private String nom;
    private String adresse;
    private String ville;
    private String telephone;
    private String mobile;
    private String role;
    private Date dateRecrutement;
    private Date datePayment;
    private double salaire;
    private double acompte;
    @OneToOne(mappedBy = "employee")
    private Guichet guichet ;

    public Employee() {
    }

    public Employee(int id, int uid, String nom, String adresse, String ville, String telephone, String mobile, String role, Date dateRecrutement, Date datePayment, double salaire, double acompte, Guichet guichet) {
        this.id = id;
        this.uid = uid;
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
        this.guichet = guichet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
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

    public Guichet getGuichet() {
        return guichet;
    }

    public void setGuichet(Guichet guichet) {
        this.guichet = guichet;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", uid=" + uid +
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
                ", guichet=" + guichet +
                '}';
    }
}
