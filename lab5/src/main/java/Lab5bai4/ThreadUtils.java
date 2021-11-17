/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5bai4;

/**
 *
 * @author Nghia
 */
public class ThreadUtils implements Runnable {
    static int arr[]= new int [1000];
    private int fromIndex;
    private int toIndex;
    private long total;
    
    public ThreadUtils(int fromIndex,int toIndex, int [] aaa){
              this.fromIndex=fromIndex;
              this.toIndex=toIndex;
              this.arr=aaa;
              this.total=0L;
    }
    

    @Override
    public void run() {
        for(int i=fromIndex;i<=toIndex;i++)
            total +=arr[i];
        
    }
    public long GetSum(){
        return total;
    }
    
}
