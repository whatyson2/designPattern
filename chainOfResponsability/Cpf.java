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
public class Cpf extends Pix{
    
    public Cpf(){
        super(IDChave.cpf);
    }
    
    @Override
    protected void cadastraChave() {

        System.out.println("Cpf cadastrado como chave no PIX");

    }
}
