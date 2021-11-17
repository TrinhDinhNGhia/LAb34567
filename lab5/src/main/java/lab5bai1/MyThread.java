/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5bai1;

/**
 *
 * @author Nghia
 */
public class MyThread extends Thread{
   
   
    @Override
    public void run()
    {
        while(true)
        {
        try{
            System.out.println("Day la thread con");
            sleep(1000);
             }catch(InterruptedException ex)
                     {
                            ex.printStackTrace();
                      }
          }
    }
     public static void main(String[] args)
          {
             MyThread th = new MyThread();
              th.start();
             System.out.println("Đây là thread cha ");
            }
}
