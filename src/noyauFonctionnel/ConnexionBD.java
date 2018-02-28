/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noyauFonctionnel;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JOFFREY
 */
public class ConnexionBD {
    public String url; 
    private String identifiant;
    private String mdp;
    private java.sql.Connection bdConnect = null;
    private java.sql.Statement bdStatement = null;
    
    public ConnexionBD(String url, String identifiant, String mdp){
        this.url = url ;
        this.identifiant = identifiant;
        this.mdp = mdp;
    }
    
    public boolean connexion(){
        /* Chargement du drier JDBC par MySQL */
        try{
            Class.forName("com.mysq.jdbc.Driver").newInstance();
            this.bdConnect = DriverManager.getConnection("jdbc:mysql:" + this.url, this.identifiant, this.mdp);
            this.bdStatement = this.bdConnect.createStatement();
            return true;
        }catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(ConnexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    /*méthode permettant d'exécuter une requête SQL lors de la connexion sur l'interface 
    Ici, la requête correspond au String sql */
     public ResultSet exec(String sql) {
        try {
            ResultSet rs = this.bdStatement.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(ConnexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
