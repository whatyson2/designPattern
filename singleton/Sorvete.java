/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraosingleton;

/**
 *
 * @author whatyson
 */
public class Sorvete {
    
    private static Sorvete sabor;
    
    private Sorvete(){
        
    }

    public static Sorvete getSabor(){

        if( sabor == null ){

            sabor = new Sorvete();
        }

        return sabor;
    }
   
}
    
    
    

