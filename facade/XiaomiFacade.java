/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadefacade;

/**
 *
 * @author whatyson
 */
public class XiaomiFacade {
    
   protected Xiaomi mi10t;
   protected Xiaomi redmi9;
   protected Xiaomi redminote8;

   public XiaomiFacade(){
       mi10t = new Mi10T();
       redmi9 = new Redmi9();
       redminote8 = new RedmiNote8();
   }
   
   public void criarMi10T(){
       mi10t.criar();
   }

   public void criarRedmi9(){
       redmi9.criar();
   }
    
   public void criarRedmiNote8(){
       redminote8.criar();
   }

    public Xiaomi getMi10t() {
        return mi10t;
    }

    public void setMi10t(Xiaomi mi10t) {
        this.mi10t = mi10t;
    }

    public Xiaomi getRedmi9() {
        return redmi9;
    }

    public void setRedmi9(Xiaomi redmi9) {
        this.redmi9 = redmi9;
    }

    public Xiaomi getRedminote8() {
        return redminote8;
    }

    public void setRedminote8(Xiaomi redminote8) {
        this.redminote8 = redminote8;
    }
   
   
}
