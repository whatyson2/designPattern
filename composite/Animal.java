/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadecomposite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author whatyson
 */
public abstract class Animal {
    
    private List<Animal>animais;
    
    public abstract void qtdPatas();
    
    public Animal(){
        this.animais = new ArrayList<>();
    }
    
    public void adicionarAnimal(Animal animal){
        this.animais.add(animal);
    }

    public List<Animal> getAnimais() {
        return animais;
    }

    public void setAnimal(List<Animal> animais) {
        this.animais = animais;
    }
    
    
}
