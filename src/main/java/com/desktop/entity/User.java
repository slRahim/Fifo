package com.desktop.entity;

import javax.persistence.*;

@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id ;
    @Column
    private String nom ;
    @Column(
            unique = true
    )
    private String username ;
    @Column
    private String password ;
    @Column
    private String type ;
    @Column
    private int addTresorerie ;
    @Column
    private int editTresorerie ;
    @Column
    private int dellTresorerie ;
    @Column
    private int crudUsers ;
    @Column
    private int crudClients ;
    @Column
    private int crudEmployee ;
    @Column
    private int crudCaisse ;
    @Column
    private int consulteRapport ;
    @Column
    private int consulteDashboard ;


    public User() {
    }

    public User(int id, String nom, String username, String password, String type, int addTresorerie, int editTresorerie, int dellTresorerie, int crudUsers, int crudClients, int crudEmployee, int crudCaisse, int consulteRapport, int consulteDashboard) {
        this.id = id;
        this.nom = nom;
        this.username = username;
        this.password = password;
        this.type = type;
        this.addTresorerie = addTresorerie;
        this.editTresorerie = editTresorerie;
        this.dellTresorerie = dellTresorerie;
        this.crudUsers = crudUsers;
        this.crudClients = crudClients;
        this.crudEmployee = crudEmployee;
        this.crudCaisse = crudCaisse;
        this.consulteRapport = consulteRapport;
        this.consulteDashboard = consulteDashboard;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAddTresorerie() {
        return addTresorerie;
    }

    public void setAddTresorerie(int addTresorerie) {
        this.addTresorerie = addTresorerie;
    }

    public int getEditTresorerie() {
        return editTresorerie;
    }

    public void setEditTresorerie(int editTresorerie) {
        this.editTresorerie = editTresorerie;
    }

    public int getDellTresorerie() {
        return dellTresorerie;
    }

    public void setDellTresorerie(int dellTresorerie) {
        this.dellTresorerie = dellTresorerie;
    }

    public int getCrudUsers() {
        return crudUsers;
    }

    public void setCrudUsers(int crudUsers) {
        this.crudUsers = crudUsers;
    }

    public int getCrudClients() {
        return crudClients;
    }

    public void setCrudClients(int crudClients) {
        this.crudClients = crudClients;
    }

    public int getCrudEmployee() {
        return crudEmployee;
    }

    public void setCrudEmployee(int crudEmployee) {
        this.crudEmployee = crudEmployee;
    }

    public int getConsulteRapport() {
        return consulteRapport;
    }

    public void setConsulteRapport(int consulteRapport) {
        this.consulteRapport = consulteRapport;
    }

    public int getConsulteDashboard() {
        return consulteDashboard;
    }

    public void setConsulteDashboard(int consulteDashboard) {
        this.consulteDashboard = consulteDashboard;
    }

    public int getCrudCaisse() {
        return crudCaisse;
    }

    public void setCrudCaisse(int crudCaisse) {
        this.crudCaisse = crudCaisse;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", type='" + type + '\'' +
                ", addTresorerie=" + addTresorerie +
                ", editTresorerie=" + editTresorerie +
                ", dellTresorerie=" + dellTresorerie +
                ", crudUsers=" + crudUsers +
                ", crudClients=" + crudClients +
                ", crudEmployee=" + crudEmployee +
                ", crudCaisse=" + crudCaisse +
                ", consulteRapport=" + consulteRapport +
                ", consulteDashboard=" + consulteDashboard +
                '}';
    }
}
