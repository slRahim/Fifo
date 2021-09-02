package com.desktop.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true)
    private int uid;
    private int numeroTicket;
    private Date date;
    @ManyToOne
    @JoinColumn(name = "clientId", nullable = true)
    private Client client ;
    @ManyToOne
    @JoinColumn(name = "guichetId", nullable = false)
    private Guichet guichet;
    private String statut;
    @OneToMany(mappedBy = "ticket")
    private List<Tresorerie> tresorerieList;

    public Ticket() {
    }

    public Ticket(int id, int uid, int numeroTicket, Date date, Client client, Guichet guichet, String statut, List<Tresorerie> tresorerieList) {
        this.id = id;
        this.uid = uid;
        this.numeroTicket = numeroTicket;
        this.date = date;
        this.client = client;
        this.guichet = guichet;
        this.statut = statut;
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

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Guichet getGuichet() {
        return guichet;
    }

    public void setGuichet(Guichet guichet) {
        this.guichet = guichet;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public List<Tresorerie> getTresorerieList() {
        return tresorerieList;
    }

    public void setTresorerieList(List<Tresorerie> tresorerieList) {
        this.tresorerieList = tresorerieList;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", uid=" + uid +
                ", numeroTicket=" + numeroTicket +
                ", date=" + date +
                ", client=" + client +
                ", guichet=" + guichet +
                ", statut='" + statut + '\'' +
                ", tresorerieList=" + tresorerieList +
                '}';
    }
}
