package com.desktop.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Caisse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true , nullable = false)
    private int uid;
    private String designation;
    private double soldeDepart;
    private double solde;
    @OneToMany(mappedBy = "caisse")
    private List<Tresorerie> tresorerieList;

    public Caisse() {
    }

    public Caisse(int id, int uid, String designation, double soldeDepart, double solde, List<Tresorerie> tresorerieList) {
        this.id = id;
        this.uid = uid;
        this.designation = designation;
        this.soldeDepart = soldeDepart;
        this.solde = solde;
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

    public List<Tresorerie> getTresorerieList() {
        return tresorerieList;
    }

    public void setTresorerieList(List<Tresorerie> tresorerieList) {
        this.tresorerieList = tresorerieList;
    }

    @Override
    public String toString() {
        return "Caisse{" +
                "id=" + id +
                ", uid=" + uid +
                ", designation='" + designation + '\'' +
                ", soldeDepart=" + soldeDepart +
                ", solde=" + solde +
                ", tresorerieList=" + tresorerieList +
                '}';
    }
}
