/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadecomposite;

/**
 *
 * @author whatyson
 */
public class AtividadeComposite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Animal animal = new Cachorro();
        animal.adicionarAnimal(new Aranha());
        animal.adicionarAnimal(new Gato());
        animal.qtdPatas();
        System.out.println("\n");

    }
    
}
