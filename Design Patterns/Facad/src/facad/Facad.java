/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facad;

/**
 *
 * @author amirp
 */
public class Facad {
    private Shape circle;
    private Shape rectangle;
    private Shape square;
    
    public Facad(){
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }
    
    public String drawCircle(){
        circle.draw();
        return "Circle: draw()";
    }
        public String drawRectangle(){
        rectangle.draw();
        return "Rectangle: draw()";
    }
        public String drawSquare(){
        square.draw();
        return "Square: draw()";
    }
}
