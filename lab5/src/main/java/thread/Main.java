/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thread;

/**
 *
 * @author Nghia
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LE KHAI
 */
public class Main {
    public static void main(String[] args) {
        ShareData shareData =new ShareData();
        
        ThreadOne t1 = new ThreadOne(shareData);
        ThreadTwo t2 = new ThreadTwo(shareData);
        
        t1.start();
        t2.start();
    }
}
