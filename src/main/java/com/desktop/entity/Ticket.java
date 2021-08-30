package com.desktop.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id ;
    @Column(
            unique = true
    )
    private int uid ;
    @Column
    private int numeroTicket ;
    @Column
    private Date date ;
    @Column
    private int guichetId ;
    @Column
    private Date guichetNumero ;
    @Column
    private String statut ;

    public Ticket() {
    }

    public Ticket(int id, int uid, int numeroTicket, Date date, int guichetId, Date guichetNumero, String statut) {
        this.id = id;
        this.uid = uid;
        this.numeroTicket = numeroTicket;
        this.date = date;
        this.guichetId = guichetId;
        this.guichetNumero = guichetNumero;
        this.statut = statut;
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

    public int getNumeroTicket() {
        return numeroTicket;
    }

    public void setNumeroTicket(int numeroTicket) {
        this.numeroTicket = numeroTicket;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getGuichetId() {
        return guichetId;
    }

    public void setGuichetId(int guichetId) {
        this.guichetId = guichetId;
    }

    public Date getGuichetNumero() {
        return guichetNumero;
    }

    public void setGuichetNumero(Date guichetNumero) {
        this.guichetNumero = guichetNumero;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", uid=" + uid +
                ", numeroTicket=" + numeroTicket +
                ", date=" + date +
                ", guichetId=" + guichetId +
                ", guichetNumero=" + guichetNumero +
                ", statut='" + statut + '\'' +
                '}';
    }
}
