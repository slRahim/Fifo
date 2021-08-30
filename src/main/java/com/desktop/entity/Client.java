package com.desktop.entity;

import javax.persistence.*;

@Entity
@Table
public class Client {
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
    private String mobile ;
    @Column
    private String telephone ;
    @Column
    private String email ;
    @Column
    private String facebook ;
    @Column
    private int pointFidelite ;
    @Column
    private double soldeDepart ;
    @Column
    private double chiffreAffaire ;
    @Column
    private double regle ;
    @Column
    private double credit ;

    public Client() {
    }

    public Client(int id, String nom, String adresse, String mobile, String telephone, String email, String facebook, int pointFidelite, double soldeDepart, double chiffreAffaire, double regle, double credit) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.mobile = mobile;
        this.telephone = telephone;
        this.email = email;
        this.facebook = facebook;
        this.pointFidelite = pointFidelite;
        this.soldeDepart = soldeDepart;
        this.chiffreAffaire = chiffreAffaire;
        this.regle = regle;
        this.credit = credit;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public int getPointFidelite() {
        return pointFidelite;
    }

    public void setPointFidelite(int pointFidelite) {
        this.pointFidelite = pointFidelite;
    }

    public double getSoldeDepart() {
        return soldeDepart;
    }

    public void setSoldeDepart(double soldeDepart) {
        this.soldeDepart = soldeDepart;
    }

    public double getChiffreAffaire() {
        return chiffreAffaire;
    }

    public void setChiffreAffaire(double chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
    }

    public double getRegle() {
        return regle;
    }

    public void setRegle(double regle) {
        this.regle = regle;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", mobile='" + mobile + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", facebook='" + facebook + '\'' +
                ", pointFidelite=" + pointFidelite +
                ", soldeDepart=" + soldeDepart +
                ", chiffreAffaire=" + chiffreAffaire +
                ", regle=" + regle +
                ", credit=" + credit +
                '}';
    }
}
