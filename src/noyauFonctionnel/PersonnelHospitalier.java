/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noyauFonctionnel;

public class PersonnelHospitalier extends Personne {
    private String id;
    private String mdp;
    
    public PersonnelHospitalier(String n, String p, String id, String mdp){
        super(n,p);
        this.setId(id);
        this.setMdp(mdp);
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
     * @return the mdp
     */
    public String getMdp() {
        return mdp;
    }

    /**
     * @param mdp the mdp to set
     */
    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
    
}