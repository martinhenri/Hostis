/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noyauFonctionnel;

import java.util.Date;

public class Examen {
    private String nomPH;
    private String mention;
    private int lienPacs;
    private TypeExamen typeExamen;
    private Date date;
    private CompteRendu compteRendu;
    
    public Examen(String nPH, String m, int lienP, TypeExamen tE, Date d, CompteRendu cr){
        this.nomPH=nPH;
        this.mention=m;
        this.lienPacs=lienP;
        this.typeExamen = tE;
        this.date=d;
        this.compteRendu=cr;
    }

    public String getNomPH() {
        return nomPH;
    }

    public void setNomPH(String nomPH) {
        this.nomPH = nomPH;
    }

    public String getMention() {
        return mention;
    }

    public void setMention(String mention) {
        this.mention = mention;
    }

    public int getLienPacs() {
        return lienPacs;
    }

    public void setLienPacs(int lienPacs) {
        this.lienPacs = lienPacs;
    }

    public TypeExamen getTypeExamen() {
        return typeExamen;
    }

    public void setTypeExamen(TypeExamen typeExamen) {
        this.typeExamen = typeExamen;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public CompteRendu getCompteRendu() {
        return compteRendu;
    }
    
//    public String getCompteRendu2(){
//        String s="";
//        s+= "date d'examen :" + this.compteRendu.getDateExamen() + "contenu :" + this.compteRendu.getContenu();
//        return s;
//    }
    
    
    public void setCompteRendu(CompteRendu compteRendu) {
        this.compteRendu = compteRendu;
    }
    
    
}
