package com.desktop.entity;

import javax.persistence.*;

@Entity
@Table
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id ;
    @Column
    private String raisonSocial ;
    @Column
    private String type ;
    @Column
    private String telephone ;
    @Column
    private String mobile ;
    @Column
    private String fax ;
    @Column
    private String email ;
    @Column
    private String siteWeb ;
    @Column
    private String adresse ;
    @Column
    private String ville ;
    @Column
    private String departement ;
    @Column
    private String pays ;
    @Column
    private String rc ;
    @Column
    private String ntva ;
    @Column
    private String nis ;
    @Column
    private String ai ;
    @Column
    private String capitaleSociale ;
    @Column
    private String logo ;


    public Profile() {
    }

    public Profile(int id, String raisonSocial, String type, String telephone, String mobile, String fax, String email, String siteWeb, String adresse, String ville, String departement, String pays, String rc, String ntva, String nis, String ai, String capitaleSociale, String logo) {
        this.id = id;
        this.raisonSocial = raisonSocial;
        this.type = type;
        this.telephone = telephone;
        this.mobile = mobile;
        this.fax = fax;
        this.email = email;
        this.siteWeb = siteWeb;
        this.adresse = adresse;
        this.ville = ville;
        this.departement = departement;
        this.pays = pays;
        this.rc = rc;
        this.ntva = ntva;
        this.nis = nis;
        this.ai = ai;
        this.capitaleSociale = capitaleSociale;
        this.logo = logo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRaisonSocial() {
        return raisonSocial;
    }

    public void setRaisonSocial(String raisonSocial) {
        this.raisonSocial = raisonSocial;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSiteWeb() {
        return siteWeb;
    }

    public void setSiteWeb(String siteWeb) {
        this.siteWeb = siteWeb;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getRc() {
        return rc;
    }

    public void setRc(String rc) {
        this.rc = rc;
    }

    public String getNtva() {
        return ntva;
    }

    public void setNtva(String ntva) {
        this.ntva = ntva;
    }

    public String getNis() {
        return nis;
    }

    public void setNis(String nis) {
        this.nis = nis;
    }

    public String getAi() {
        return ai;
    }

    public void setAi(String ai) {
        this.ai = ai;
    }

    public String getCapitaleSociale() {
        return capitaleSociale;
    }

    public void setCapitaleSociale(String capitaleSociale) {
        this.capitaleSociale = capitaleSociale;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", raisonSocial='" + raisonSocial + '\'' +
                ", type='" + type + '\'' +
                ", telephone='" + telephone + '\'' +
                ", mobile='" + mobile + '\'' +
                ", fax='" + fax + '\'' +
                ", email='" + email + '\'' +
                ", siteWeb='" + siteWeb + '\'' +
                ", adresse='" + adresse + '\'' +
                ", ville='" + ville + '\'' +
                ", departement='" + departement + '\'' +
                ", pays='" + pays + '\'' +
                ", rc='" + rc + '\'' +
                ", ntva='" + ntva + '\'' +
                ", nis='" + nis + '\'' +
                ", ai='" + ai + '\'' +
                ", capitaleSociale='" + capitaleSociale + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }
}
