package com.desktop.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class TresorerieCategorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String designation;
    @OneToMany(mappedBy = "categorie")
    private List<Tresorerie> tresorerieList;

    public TresorerieCategorie() {
    }

    public TresorerieCategorie(int id, String designation, List<Tresorerie> tresorerieList) {
        this.id = id;
        this.designation = designation;
        this.tresorerieList = tresorerieList;
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

    public List<Tresorerie> getTresorerieList() {
        return tresorerieList;
    }

    public void setTresorerieList(List<Tresorerie> tresorerieList) {
        this.tresorerieList = tresorerieList;
    }

    @Override
    public String toString() {
        return "TresorerieCategorie{" +
                "id=" + id +
                ", designation='" + designation + '\'' +
                ", tresorerieList=" + tresorerieList +
                '}';
    }
}
