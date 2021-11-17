
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nghia
 */
class Xemay implements Ixe {
       private  String bienso;
       private  String loaixe;
        private  String  mauxe;
         private  float giatien;

    public Xemay(String bienso, String loaixe, String mauxe, float giatien) {
        this.bienso = bienso;
        this.loaixe = loaixe;
        this.mauxe = mauxe;
        this.giatien = giatien;
    }

    public Xemay() {
    }
         

        public String getBienso() {
            return bienso;
        }

        public String getLoaixe() {
            return loaixe;
        }

        public String getMauxe() {
            return mauxe;
        }

        public float getGiatien() {
            return giatien;
        }

        public void setBienso(String bienso) {
            this.bienso = bienso;
        }

        public void setLoaixe(String loaixe) {
            this.loaixe = loaixe;
        }

        public void setMauxe(String mauxe) {
            this.mauxe = mauxe;
        }

        public void setGiatien(float giatien) {
            this.giatien = giatien;
        }
         
         
         
         

        @Override
        public void nhap() {
            Scanner sc= new Scanner(System.in);
            System.out.println("Moi ban nhap vao bien so");
            this.bienso=sc.nextLine();
            System.out.println("MOi ban nhap vao loai xe");
            this.loaixe=sc.nextLine();
            System.out.println("Nhap vao mau xe");
            this.mauxe =sc.nextLine();
            System.out.println("Nhap vao gia tien");
            this.giatien=sc.nextFloat();
        }

       
       @Override
        public void hienthi() {
            System.out.println("Bien so la: "+this.bienso);
            System.out.println("Loai xe: "+this.loaixe);
            System.out.println("Mau xe:"+this.mauxe);
            System.out.println("Gia tien: "+this.giatien);
        }
   
    }
