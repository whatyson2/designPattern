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
public class AtividadeChain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Pix chaves = new Email();
		chaves.setNext(new Cpf());
		chaves.setNext(new Telefone());
		chaves.setNext(new ChaveAleatoria());
		
		try {
			chaves.cadastrarChave(IDChave.email);
			chaves.cadastrarChave(IDChave.cpf);
			chaves.cadastrarChave(IDChave.telefone);
			chaves.cadastrarChave(IDChave.chaveAleatoria);
		} catch (Exception e) {
		}
	}
    }
    

