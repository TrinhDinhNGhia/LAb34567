/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package la5bai3;

/**
 *
 * @author Nghia
 */
public class Square implements Runnable, Listener {
    Thread t;
    int number;
    boolean flag = false; 
// nhận số được tạo ra từ Generator
    @Override
    public void addNumber(int number){
    this.number = number;
    flag=true;// khi nhan duoc so moi tao ra
    }
    
    @Override
    public void run() {
        try{
            while(true) {
               if(this.flag) {
                System.out.println("Binh phuong so vua sinh: " + number * number);
                       this.flag = false;
                             }
                       Thread.sleep(1000);
                          }        
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    
    }
    public void start(){
    if(t==null){
        t = new Thread(this, "Square");
         t.start();
    }
    }
    
    
}
