package com.desktop.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true , nullable = false)
    private int uid;
    private String nom;
    private String adresse;
    private String mobile;
    private String telephone;
    private String email;
    private String facebook;
    private int pointFidelite;
    private double soldeDepart;
    private double chiffreAffaire;
    private double regle;
    private double credit;
    @OneToMany(mappedBy = "client")
    private List<Ticket> ticketList ;
    @OneToMany(mappedBy = "client")
    private List<Tresorerie> tresorerieList;


    public Client() {
    }

    public Client(int id, int uid, String nom, String adresse, String mobile, String telephone, String email, String facebook, int pointFidelite, double soldeDepart, double chiffreAffaire, double regle, double credit, List<Ticket> ticketList, List<Tresorerie> tresorerieList) {
        this.id = id;
        this.uid = uid;
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
        this.ticketList = ticketList;
        this.tresorerieList = tresorerieList;
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

    public List<Ticket> getTicketList() {
        return ticketList;
    }

    public void setTicketList(List<Ticket> ticketList) {
        this.ticketList = ticketList;
    }

    public List<Tresorerie> getTresorerieList() {
        return tresorerieList;
    }

    public void setTresorerieList(List<Tresorerie> tresorerieList) {
        this.tresorerieList = tresorerieList;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", uid=" + uid +
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
                ", ticketList=" + ticketList +
                ", tresorerieList=" + tresorerieList +
                '}';
    }
}
