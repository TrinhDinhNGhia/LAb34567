/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package la5bai3;

import java.util.Random;

/**
 *
 * @author Nghia
 */
public class Generator implements Runnable {
    Thread t;
    Listener listener;
    public Generator(Listener listener){
       this.listener=listener;
    }

    @Override
    public void run() {
        try{
            while(true){
                int number=new Random().nextInt(20) +1;
                System.out.println("Generator: "+number);
                //thong bao si va tao ra cho listenr
                listener.addNumber(number);
                Thread.sleep(2000);
            }
            
        }catch(InterruptedException e)
        {
            e.printStackTrace();

        }
    }
   
    
    public void start(){
        if(t==null){
        t=new Thread(this,"So moi sinh la");
        t.start();
        }
    
    }
   
}
