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
public abstract class Pix {

	protected Pix next;
	protected IDChave tipoDeChave;

	public Pix(IDChave id) {
		this.next = null;
		this.tipoDeChave = id;
	}

	public void setNext(Pix forma) {
		if (next == null) {
			next = forma;
		} else {
			next.setNext(forma);
		}
	}

	public void cadastrarChave(IDChave id) throws Exception {
		if (chaveCadastrada(id)) {
			cadastraChave();
		} else {
			if (next == null) {
				throw new Exception("Chave não cadastrada");
			}
			next.cadastrarChave(id);
		}
	}

        
        
	private boolean chaveCadastrada(IDChave id) {
		if (tipoDeChave == id) {
                  
			return true;
		}
		return false;
	}

	protected abstract void cadastraChave();
        
       
}
