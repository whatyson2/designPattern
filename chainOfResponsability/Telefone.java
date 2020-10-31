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
public class Telefone extends Pix{
    
    public Telefone(){
        super(IDChave.telefone);
    }
    
    @Override
    protected void cadastraChave() {

        System.out.println("Telefone cadastrado como chave no PIX");

    }
}
