/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeiterator;

import java.util.Arrays;

/**
 *
 * @author whatyson
 */
public class AtividadeIterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             
                Fruta [] frutas = new Fruta[4];

		frutas[0] = new Fruta("Morango");
		frutas[1] = new Fruta("Abacaxi");
		frutas[2] = new Fruta("Melancia");
		frutas[3] = new Fruta("Abacate");
//                
//                Iterator frutaIterator = new FrutaIterator(frutas);
//
//		while (frutaIterator.temProximo()) {
//			Fruta menuItem = (Fruta) frutaIterator.proximo();
//			System.out.println(menuItem.nome);
//		}

              for (Fruta menuIten : frutas) {
            System.out.println(menuIten.nome);
           
        }
                

	}


    }
    

