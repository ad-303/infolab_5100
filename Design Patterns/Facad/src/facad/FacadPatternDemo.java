/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facad;

/**
 *
 * @author amirp
 */
public class FacadPatternDemo {

    
    public static void main(String[] args) {
        Facad shapemaker = new Facad();
        
        shapemaker.drawCircle();
        shapemaker.drawRectangle();
        shapemaker.drawSquare();
    }
    
}
