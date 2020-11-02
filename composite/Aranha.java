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
public class Aranha extends Animal {
    @Override
    public void qtdPatas() {
        System.out.print("A aranha tem: 8 Patas\n");
        for(Animal ani : super.getAnimais()){
            ani.qtdPatas();
        }
    }
}
