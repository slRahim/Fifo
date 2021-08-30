package com.desktop.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table
public class Tresorerie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id ;
    @Column(
            unique = true
    )
    private int uid ;
    @Column
    private Date date ;
    @Column
    private int mov ;
    @Column
    private int ticketId ;
    @Column
    private int clientId ;
    @Column
    private String clientNom ;
    @Column
    private int compteId ;
    @Column
    private int categorieId ;
    @Column
    private int chargeId ;
    @Column
    private int modaliteId ;
    @Column
    private String objet ;
    @Column
    private double montant ;

    public Tresorerie() {
    }

    public Tresorerie(int id, int uid, Date date, int mov, int ticketId, int clientId, String clientNom, int compteId, int categorieId, int chargeId, int modaliteId, String objet, double montant) {
        this.id = id;
        this.uid = uid;
        this.date = date;
        this.mov = mov;
        this.ticketId = ticketId;
        this.clientId = clientId;
        this.clientNom = clientNom;
        this.compteId = compteId;
        this.categorieId = categorieId;
        this.chargeId = chargeId;
        this.modaliteId = modaliteId;
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

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getClientNom() {
        return clientNom;
    }

    public void setClientNom(String clientNom) {
        this.clientNom = clientNom;
    }

    public int getCompteId() {
        return compteId;
    }

    public void setCompteId(int compteId) {
        this.compteId = compteId;
    }

    public int getCategorieId() {
        return categorieId;
    }

    public void setCategorieId(int categorieId) {
        this.categorieId = categorieId;
    }

    public int getChargeId() {
        return chargeId;
    }

    public void setChargeId(int chargeId) {
        this.chargeId = chargeId;
    }

    public int getModaliteId() {
        return modaliteId;
    }

    public void setModaliteId(int modaliteId) {
        this.modaliteId = modaliteId;
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
                ", ticketId=" + ticketId +
                ", clientId=" + clientId +
                ", clientNom='" + clientNom + '\'' +
                ", compteId=" + compteId +
                ", categorieId=" + categorieId +
                ", chargeId=" + chargeId +
                ", modaliteId=" + modaliteId +
                ", objet='" + objet + '\'' +
                ", montant=" + montant +
                '}';
    }
}
