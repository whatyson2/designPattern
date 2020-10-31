/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadechain;

/**
 *
 * @author whatyson
 */
public class ChaveAleatoria extends Pix {
    
    public ChaveAleatoria(){
        super(IDChave.chaveAleatoria);
    }
    
    @Override
    protected void cadastraChave() {

        System.out.println("Chave Aleatoria cadastrada como chave no PIX");

    }
    
}
