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
public class Onibus {
    private int qtdPassageiros;
    private int lugaresOcupados;

    public Onibus() {
        this.qtdPassageiros = 60;
        this.lugaresOcupados = (int) (Math.random()*20);
    }

    public String getQtdPassageiros() {
        return new String ("Total de Passageiros: "+ qtdPassageiros);
    }

    public String getLugaresOcupados() {
        return new String ("Vagas Ocupadas: "+ lugaresOcupados);
    }
      
    
    
    
}
