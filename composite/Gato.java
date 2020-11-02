/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadecomposite;

/**
 *
 * @author whatyson
 */
public class Gato extends Animal{
    
    @Override
    public void qtdPatas() {
        System.out.print("O gato tem: 4 Patas\n");
        for(Animal ani : super.getAnimais()){
            ani.qtdPatas();
        }
    }
}
