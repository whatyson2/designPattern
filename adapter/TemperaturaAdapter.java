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
public class TemperaturaAdapter extends Temperatura {
    
    @Override
    public void setTemperatura(double temperatura){
        super.setTemperatura(temperatura + 273);
    }
    
     @Override
    public double getTemperatura(){
        return (super.getTemperatura());
    }
    
    public double getTemperaturaKelvin(){
        return super.getTemperatura();
    }
}
