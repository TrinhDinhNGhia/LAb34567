
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nghia
 */
public class XeMayHaNoi extends Xemay {
   private int n;
    Xemay[] mangxe;

    public XeMayHaNoi() {
    }

    public XeMayHaNoi(String bienso,String loaixe,String mauxe,float giatien,int n, Xemay[] mangxe) {
        super(bienso,loaixe,mauxe,giatien);
        this.n = n;
        this.mangxe = mangxe;
    }
    
    public int getN() {
        return n;
    }
    
     public void setN(int n) {
        this.n = n;
    }
     public Xemay[] getXe() {
        return mangxe;
    }
    
    @Override
     public void nhap()
     {
          Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập vào số lượng xe máy ở Hà Nội: ");
        n = nhap.nextInt();
        mangxe = new Xemay[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Nhập vào thông tin xe máy ở Hà Nội thứ "+(i+1));
            mangxe[i]=new Xemay();
            mangxe[i].nhap();
        }
     }
    public void HienThi()
    {
        for(int i=0;i<n;i++)
        {
            System.out.println("Thông tin xe máy thứ "+(i+1));
            mangxe[i].hienthi();
        }
    }
}
