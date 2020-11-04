/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeproxy;

/**
 *
 * @author whatyson
 */
public class AtividadeProxy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Onibus lugar = new OnibusProxy(true);
        System.out.println(lugar.getQtdPassageiros());
        System.out.println(lugar.getLugaresOcupados());
 
        lugar = new OnibusProxy(true);
        System.out.println(lugar.getQtdPassageiros());
        System.out.println(lugar.getLugaresOcupados());

    }
    
}
