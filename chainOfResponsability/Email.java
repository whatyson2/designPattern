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
public class Email extends Pix {

    public Email(){
        super(IDChave.email);
    }
    
    @Override
    protected void cadastraChave() {
        
        System.out.println("Email cadastrado como chave no PIX");
        
    }
    
}
