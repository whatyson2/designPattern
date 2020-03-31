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
public abstract class CelularTemplate {
    public boolean resistenciaAgua;
    public double preco;
    public int capacidadeBateria;
    public String modeloEmpresa;

    

    public final void buildCelular() {
        buildModeloEmpresa();
        buildResistenciaAgua();
        buildPreco();
        buildCapacidadeBateria();
        
        System.out.println("Smartphone is built.");
    }
    
    
    public abstract void buildResistenciaAgua();
    public abstract void buildPreco();
    public abstract void buildCapacidadeBateria();
    public abstract void buildModeloEmpresa();

    public boolean isResistenciaAgua() {
        return resistenciaAgua;
    }

    public void setResistenciaAgua(boolean resistenciaAgua) {
        this.resistenciaAgua = resistenciaAgua;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCapacidadeBateria() {
        return capacidadeBateria;
    }

    public void setCapacidadeBateria(int capacidadeBateria) {
        this.capacidadeBateria = capacidadeBateria;
    }

    public String getModeloEmpresa() {
        return modeloEmpresa;
    }

    public void setModeloEmpresa(String modeloEmpresa) {
        this.modeloEmpresa = modeloEmpresa;
    }
    
    
    



}
