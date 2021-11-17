/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LE KHAI
 */
public class ThreadOne extends Thread{
    ShareData shareData;

    public ThreadOne(ShareData shareData) {
        this.shareData = shareData;
    }
   
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadOne.class.getName()).log(Level.SEVERE, null, ex);
        }
        Random random = new Random();
        
        for (int i = 0; ; i++) {
            synchronized(shareData){
            int rad = random.nextInt(20);
            shareData.setRad(rad);
            System.out.println(rad);  
            
            shareData.notifyAll();
                try {
                    shareData.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadOne.class.getName()).log(Level.SEVERE, null, ex);
                }
            }           
        }
    }
    
}
