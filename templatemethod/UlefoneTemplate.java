/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod;

/**
 *
 * @author whaty
 */
public class UlefoneTemplate extends CelularTemplate {

    @Override
    public void buildResistenciaAgua() {
        resistenciaAgua = true;
        System.out.println("Resistência a Água: "+resistenciaAgua);
    }

    @Override
    public void buildPreco() {
        preco = 1200.00;
        System.out.println("Preço: "+preco);
    }

    @Override
    public void buildCapacidadeBateria() {
        capacidadeBateria = 5000;
        System.out.println("Capacidade da Bateria: "+capacidadeBateria);
    }

    @Override
    public void buildModeloEmpresa() {
        modeloEmpresa = "Ulefone Armor 6E";
        System.out.println("Modelo e Empresa: "+modeloEmpresa);
    }
    
    
}
