/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noyauFonctionnel;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author JOFFREY
 */
public class Hostis {
    private static ConnexionBD connexionBD;
    
    public static void main(String[] args) {
        connexionBD = new ConnexionBD("jdbc:mysql://mysql-hostis.alwaysdata.net", "hostis", "Flucky972");
        if (connexionBD.connexion()) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                try {
                    Thread.sleep(2500);
                } catch (Exception e) {

                }
                new user_interface.Connexion().setVisible(true);
            }
        });
        }
        else {
            JOptionPane.showMessageDialog(new JFrame(), "Un problème a été rencontré lors de la connexion avec la base de données.");
        }
        
    } 

    public static ConnexionBD getConnexionBD() {
        return connexionBD;
    }
    
}
