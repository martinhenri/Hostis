/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noyauFonctionnel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Patient extends Personne {

    private String adresse;
    private String id;
    private Date dateDeNaissance;
    private Sexe genre;

    public Patient(String n, String p, String ad, Date d, String iD, Sexe g) {
        super(n, p);
        this.adresse = ad;
        this.id = iD;
        this.dateDeNaissance = d;
        this.genre = g;
    }

    public Sexe getGenre() {
        return genre;
    }

    /**
     * @return the adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * @param adresse the adresse to set
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the dateDeNaissance
     */
    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    /**
     * @param dateDeNaissance the dateDeNaissance to set
     */
    public void setDateDeNaissance(Date dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }
 
    public int calculAge() {
        int age;
        Date date = new Date();
        age = date.getYear() - this.dateDeNaissance.getYear();
        if ((date.getMonth() - this.dateDeNaissance.getMonth()) < 0){
            age = age - 1;
        } else if ((date.getMonth() - this.dateDeNaissance.getMonth()) == 0) {
            if (date.getDay() - this.dateDeNaissance.getDay() < 0) {
                age = age - 1;
            }
        }
        return age ;
    }

}