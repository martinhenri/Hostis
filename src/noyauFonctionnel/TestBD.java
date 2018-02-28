/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noyauFonctionnel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestBD {

    /**
     * @param args the command line arguments
 */
public static void main(String[] args) {
        /* Chargement du driver JDBC pour MySQL */
    try {
        Class.forName( "com.mysql.jdbc.Driver" );
    } catch ( ClassNotFoundException e ) {
                System.out.println(e.getMessage()) ;
    }
    /* Connexion à la base de données */
    String url = "jdbc:mysql://mysql-hostis.alwaysdata.net";
    String utilisateur = "hostis";
    String motDePasse = "Flucky972";
    Connection connexion = null;
    Statement statement = null;
    ResultSet resultat = null;
    try {
        connexion = DriverManager.getConnection( url, utilisateur, motDePasse );

        /* Création de l'objet gérant les requêtes */
        statement = connexion.createStatement();

        /* Exécution d'une requête de lecture */
        
        resultat = statement.executeQuery( "SELECT * FROM hostis_dmr.ProfessionMed;" );
        /* Récupération des données du résultat de la requête de lecture */
        while ( resultat.next() ) {
            String LoginProMed = resultat.getString( "Login" );
            String NomProMed = resultat.getString( "Nom" );
            String PrenomProMed= resultat.getString( "Prenom" );
            String MDPProMed = resultat.getString( "MDP" );
            String FonctionProMed = resultat.getString( "Fonction" );
            /* Formatag des données pour affichage dans la JSP finale. */
            System.out.println(LoginProMed +"\n"+NomProMed+"\n"+PrenomProMed+"\n"+MDPProMed+"\n"+FonctionProMed);
        }
    } catch ( SQLException e ) {
                 System.out.println(e.getMessage()) ;
    } finally {
        if ( resultat != null ) {
            try {
                resultat.close();
            } catch ( SQLException ignore ) {
            }
        }
        if ( statement != null ) {
            try {
                statement.close();
            } catch ( SQLException ignore ) {
            }
        }
        if ( connexion != null ) {
            try {
                connexion.close();
            } catch ( SQLException ignore ) {
            }
        }
    }

}

}
