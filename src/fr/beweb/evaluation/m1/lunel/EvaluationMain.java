/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.beweb.evaluation.m1.lunel;

import bwb_evaluation_algo.library.CoreEvaluation;
import bwb_evaluation_algo.library.EvaluationSystem;
import bwb_evaluation_algo.library.Tag;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author thierryCoreEvaluation eval = EvaluationSystem.getEvaluation();
 */
public class EvaluationMain {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //preparation de la méthode pour écrire dans un fichier
//        //File f = new File("");
//       
//// création des balises
//Tag root = new Tag("html");
//Tag head = new Tag("head");
//Tag body = new Tag("body");
//
//// style doit être dans le même dossier que index.html
//head.addStylesheet("style.css");
//// insertion de la balise head dans la balise html
//head.insertInto(root);
//// insertion de la balise body dans la balise html
//body.insertInto(root);
//// insertion d'une div dans la balise body
//Tag a = new Tag("div");
//a.insertInto(body);
//        
//FileInputStream input = new FileInputStream(f);
//
////initialisation d'un tableau         
//        String [] Q1 = new String [3];
//        
//// choix possible        
//         Q1[0] = "1 octet";
//         Q1[1] = "8 bits";
//         Q1[2] = "16 bits";
//         Q1[3] ="4 octets";
//// initialisation d'une variable pour stocker les réponse         
//         int i = 0;
//         String Rq1;
//
////mise en pce d'une boucle pour stocker les réponces         
//         while(i < Q1.length){
//             
//             // affichage des réponse
//             System.out.println(Q1[i]);
//             // cette variable devait servir a stocker la réponce taper par l'uttilisateur
//             Rq1 = 
//                  
//         
//                     }
//       
//    
//        /**
//         * la suite du code sert a écrire par paquet de 8 bit dans mon fichier
//         */
//        
//        byte[] paquet = new byte[8];
//        
//        while(input.read(paquet)!= -1){
//        
//        for (int i = 0; i < paquet.length; i++){
//            
//            System.out.println((char)paquet[i]);
//        }
//        
//        paquet = new byte[8];
//    }
//    input.close();
//        
//CoreEvaluation eval = EvaluationSystem.getEvaluation();
//
//
//    }
    
    EvaluationSystem.getAutorun().launch("/home/thierry/ServeurWeb/Evaluation_01/questionnaire.txt","/home/thierry/ServeurWeb/Evaluation_01/index.html");
    }
}
