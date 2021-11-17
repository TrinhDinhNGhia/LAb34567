/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LE KHAI
 */
public class ThreadTwo extends Thread{
    ShareData shareData;

    public ThreadTwo(ShareData shareData) {
        this.shareData = shareData;
    }

    @Override 
    public void run() {
        for (int i = 0; ; i++) {
            synchronized(shareData){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadTwo.class.getName()).log(Level.SEVERE, null, ex);
                }
                shareData.notifyAll();
                try {
                    shareData.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadTwo.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                int rad = shareData.getRad();
                System.out.println("Binh Phuong: " +rad*rad);
            }
        }
        
    }
    
}
