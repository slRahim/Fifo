package com.desktop.entity;

import javax.persistence.*;

@Entity
@Table
public class Guichet {
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
    private String numero ;
    @Column
    private String statut ;
    @Column
    private int employeeId ;

    public Guichet() {
    }

    public Guichet(int id, String designation, String numero, String statut, int employeeId) {
        this.id = id;
        this.designation = designation;
        this.numero = numero;
        this.statut = statut;
        this.employeeId = employeeId;
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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Guichet{" +
                "id=" + id +
                ", designation='" + designation + '\'' +
                ", numero='" + numero + '\'' +
                ", statut='" + statut + '\'' +
                ", employeeId=" + employeeId +
                '}';
    }
}
