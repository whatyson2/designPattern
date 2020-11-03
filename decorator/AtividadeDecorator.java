/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadedecorator;

/**
 *
 * @author whatyson
 */
public class AtividadeDecorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Xiaomi red8 = new RedmiNote8();
        Xiaomi red8Preto = new Cor1Decorator(new RedmiNote8());
        Xiaomi mi10Azul = new Cor2Decorator(new RedmiNote8());
        
        System.out.println("\nRedmi Note 8: a definir a cor\n");
        red8.criar();
        
        System.out.println("Redmi Note 8: Preto\n");
        red8Preto.criar();
        
        System.out.println("\nMi 10T: Preto");
        mi10Azul.criar();
    }
    
}
