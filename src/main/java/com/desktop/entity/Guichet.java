package com.desktop.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Guichet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true , nullable = false)
    private int uid;
    private String designation;
    private String numero;
    private String statut;
    @OneToOne
    @JoinColumn(name = "employeeId" , nullable = false)
    private Employee employee;
    @OneToMany(mappedBy = "guichet")
    private List<Ticket> ticketList;

    public Guichet() {
    }

    public Guichet(int id, int uid, String designation, String numero, String statut, Employee employee, List<Ticket> ticketList) {
        this.id = id;
        this.uid = uid;
        this.designation = designation;
        this.numero = numero;
        this.statut = statut;
        this.employee = employee;
        this.ticketList = ticketList;
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

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public List<Ticket> getTicketList() {
        return ticketList;
    }

    public void setTicketList(List<Ticket> ticketList) {
        this.ticketList = ticketList;
    }

    @Override
    public String toString() {
        return "Guichet{" +
                "id=" + id +
                ", uid=" + uid +
                ", designation='" + designation + '\'' +
                ", numero='" + numero + '\'' +
                ", statut='" + statut + '\'' +
                ", employee=" + employee +
                ", ticketList=" + ticketList +
                '}';
    }
}
