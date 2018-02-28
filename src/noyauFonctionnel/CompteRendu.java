/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noyauFonctionnel;

import java.util.Date;

public class CompteRendu {
    private String contenu;
    private Date dateExamen;

    public CompteRendu(){
        dateExamen = new Date();
        contenu = new String();
    }
    
    public CompteRendu(String c, Date dE){
        this.dateExamen = dE;
        this.contenu=c;
    }
    /**
     * @return the contenu
     */
    public String getContenu() {
        return contenu;
    }

    /**
     * @param contenu the contenu to set
     */
    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    /**
     * @return the dateExamen
     */
    public Date getDateExamen() {
        return dateExamen;
    }

    /**
     * @param dateExamen the dateExamen to set
     */
    public void setDateExamen(Date dateExamen) {
        this.dateExamen = dateExamen;
    }
    
    
}
