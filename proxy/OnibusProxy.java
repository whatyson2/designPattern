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
public class OnibusProxy extends Onibus{
    
    protected boolean passagem;

    public OnibusProxy(boolean passagem) {
        this.passagem = passagem;
    }
    
    private boolean possuiPassagem(){
        return true;
    }
    
   
    
    @Override
    public String getQtdPassageiros() {
        if(possuiPassagem()){
            
            return super.getQtdPassageiros();
        }
        return null;
    }
    
    @Override
    public String getLugaresOcupados(){
        if(possuiPassagem()){
            return super.getLugaresOcupados();
        }
        return null;
    }
    
    
    
}
