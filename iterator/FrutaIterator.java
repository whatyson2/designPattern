/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeiterator;

/**
 *
 * @author whatyson
 */
public class FrutaIterator implements Iterator{
        Fruta[] itens;
	int posicao = 0;

	public FrutaIterator(Fruta[] itens) {
		this.itens = itens;
	}

	public Object proximo() {
		Fruta fruta = itens[posicao];
		posicao++;
		return itens;
	}

	public boolean temProximo() {
		if (posicao >= itens.length || itens[posicao] == null) {
			return false;
		} else {
			return true;
		}
	}
}
