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
public class XiaomiTemplate extends CelularTemplate {

    @Override
    public void buildResistenciaAgua() {
        resistenciaAgua = false;
        System.out.println("Resistência a Água: "+resistenciaAgua);
    }

    @Override
    public void buildPreco() {
        preco = 2499.00;
        System.out.println("Preço: "+preco);
    }

    @Override
    public void buildCapacidadeBateria() {
        capacidadeBateria = 3070;
        System.out.println("Capacidade da Bateria: "+capacidadeBateria);
    }

    @Override
    public void buildModeloEmpresa() {
        modeloEmpresa = "Xiaomi Mi 9";
        System.out.println("Modelo e Empresa: "+modeloEmpresa);
    }
    
}
