/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadefacade;

/**
 *
 * @author whatyson
 */
public class AtividadeFacade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      XiaomiFacade xiaomiFacade = new XiaomiFacade();

      xiaomiFacade.criarMi10T();
      xiaomiFacade.criarRedmi9();
      xiaomiFacade.criarRedmiNote8();
    }
    
}
