/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noyauFonctionnel;

import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JOFFREY
 */
public class DMR {
    private Patient p ;
    private ArrayList<Examen> listeExamens;
    private CompteRendu compterendu;
    private int numArchivage;
    
    public DMR(Patient p, CompteRendu cr, int num){
        this.p=p;
        listeExamens= new ArrayList<>();
        this.compterendu=cr;
        this.numArchivage=num;
    }
    
    public ArrayList identificationExam(Date d){
     ArrayList<Examen> liste = new ArrayList<Examen>();
     for(int i=0; i<listeExamens.size();i++){
         if(listeExamens.get(i).getDate().equals(d)){
             liste.add(listeExamens.get(i));
         }
     }
     return liste;
    }
   
    public void addExamen(Examen e){
        listeExamens.add(e);
    }
    
    public void deleteExam(Examen e){
        listeExamens.remove(e);
    }
}

