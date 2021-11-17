/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package la5bai3;

/**
 *
 * @author Nghia
 */
public class Demo {
    public static void main(String[] args)
    {
        Square square = new Square();
        square.start();
        Generator generator = new Generator(square);
         generator.start();
    }
    
}
