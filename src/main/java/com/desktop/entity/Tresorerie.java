package com.desktop.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table
public class Tresorerie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true)
    private int uid;
    private Date date;
    private int mov;
    @ManyToOne
    @JoinColumn(name = "ticketId", nullable = true)
    private Ticket ticket;
    @ManyToOne
    @JoinColumn(name = "clientId", nullable = true)
    private Client client;
    @ManyToOne
    @JoinColumn(name = "caisseId", nullable = true)
    private Caisse caisse;
    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private User user;
    @ManyToOne
    @JoinColumn(name = "categorieId", nullable = false)
    private TresorerieCategorie categorie;
    @ManyToOne
    @JoinColumn(name = "chargeId", nullable = true)
    private Charge charge;
    @ManyToOne
    @JoinColumn(name = "modaliteId", nullable = false)
    private ModalitePayement modalite;
    private String numeroCarteCredit;
    private String objet;
    private double montant;

    public Tresorerie() {
    }

    public Tresorerie(int id, int uid, Date date, int mov, Ticket ticket, Client client, Caisse caisse, User user, TresorerieCategorie categorie, Charge charge, ModalitePayement modalite, String numeroCarteCredit, String objet, double montant) {
        this.id = id;
        this.uid = uid;
        this.date = date;
        this.mov = mov;
        this.ticket = ticket;
        this.client = client;
        this.caisse = caisse;
        this.user = user;
        this.categorie = categorie;
        this.charge = charge;
        this.modalite = modalite;
        this.numeroCarteCredit = numeroCarteCredit;
        this.objet = objet;
        this.montant = montant;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getMov() {
        return mov;
    }

    public void setMov(int mov) {
        this.mov = mov;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Caisse getCaisse() {
        return caisse;
    }

    public void setCaisse(Caisse caisse) {
        this.caisse = caisse;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public TresorerieCategorie getCategorie() {
        return categorie;
    }

    public void setCategorie(TresorerieCategorie categorie) {
        this.categorie = categorie;
    }

    public Charge getCharge() {
        return charge;
    }

    public void setCharge(Charge charge) {
        this.charge = charge;
    }

    public ModalitePayement getModalite() {
        return modalite;
    }

    public void setModalite(ModalitePayement modalite) {
        this.modalite = modalite;
    }

    public String getNumeroCarteCredit() {
        return numeroCarteCredit;
    }

    public void setNumeroCarteCredit(String numeroCarteCredit) {
        this.numeroCarteCredit = numeroCarteCredit;
    }

    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    @Override
    public String toString() {
        return "Tresorerie{" +
                "id=" + id +
                ", uid=" + uid +
                ", date=" + date +
                ", mov=" + mov +
                ", ticket=" + ticket +
                ", client=" + client +
                ", caisse=" + caisse +
                ", user=" + user +
                ", categorie=" + categorie +
                ", charge=" + charge +
                ", modalite=" + modalite +
                ", numeroCarteCredit='" + numeroCarteCredit + '\'' +
                ", objet='" + objet + '\'' +
                ", montant=" + montant +
                '}';
    }
}
