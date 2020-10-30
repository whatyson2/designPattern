/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeadapter;

/**
 *
 * @author whatyson
 */
public class AtividadeAdapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    TemperaturaAdapter temperatura = new TemperaturaAdapter();
    temperatura.setTemperatura(11);
    
        System.out.println("Temperatura em Kelvin: "+temperatura.getTemperaturaKelvin());
    }
    
}
