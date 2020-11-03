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
public abstract class XiaomiDecorator implements Xiaomi{
    
   protected Xiaomi xiaomiDecorator;

    public Xiaomi getXiaomiDecorator() {
        return xiaomiDecorator;
    }

    public void setXiaomiDecorator(Xiaomi xiaomiDecorator) {
        this.xiaomiDecorator = xiaomiDecorator;
    }

    public XiaomiDecorator(Xiaomi xiaomiDecorator) {
        this.xiaomiDecorator = xiaomiDecorator;
    }
   
   
   
   public void criar(){
       xiaomiDecorator.criar();
   }
   
   
}
