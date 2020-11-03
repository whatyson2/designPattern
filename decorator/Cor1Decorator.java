/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadedecorator;

/**
 *
 * @author whatyson
 */
public class Cor1Decorator extends XiaomiDecorator{

    
    public Cor1Decorator(Xiaomi xiaomiDecorator) {
        super(xiaomiDecorator);
    }
    
    @Override
    public void criar(){
        xiaomiDecorator.criar();
        setCorAparelho(xiaomiDecorator);
    }


   private void setCorAparelho(Xiaomi xiaomiDecorator){
      System.out.println("Cor do Aparelho: Preto");
   }
    
}
