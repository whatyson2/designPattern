/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod;

/**
 *
 * @author whatyson
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CelularTemplate teste = new AppleTemplate();
        teste.buildCelular();
        System.out.println();
        
        CelularTemplate teste2 = new UlefoneTemplate();
        teste2.buildCelular();
        System.out.println();
        
        
        CelularTemplate teste3 = new XiaomiTemplate();
        teste3.buildCelular();


    }
    
}
