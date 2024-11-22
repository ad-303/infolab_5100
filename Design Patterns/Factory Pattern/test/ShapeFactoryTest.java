/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import static org.junit.Assert.*;
//import static org.junit.Assert.*;

/**
 *
 * @author Adithya Anand
 */
public class ShapeFactoryTest {
    
    public ShapeFactoryTest() {
    }
   

    /**
     * Test of getShape method, of class ShapeFactory.
     */
    @Test
    public void testGetShape() {
        System.out.println("Circle, Rectangle and Square are Tested Successfully !!!");
        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.getShape("Circle");
        assertNotNull(circle);
        
        assertTrue(circle instanceof Circle);
        
        Shape rectangle = factory.getShape("Rectangle");
        assertNotNull(rectangle);
        
        assertTrue(rectangle instanceof Rectangle);
        
        Shape square = factory.getShape("Square");
        assertNotNull(square);
        
        assertTrue(square instanceof Square);
        
        
        
        
        
//        String shapeType = "";
//        ShapeFactory instance = new ShapeFactory();
//        Shape expResult = null;
//        Shape result = instance.getShape(shapeType);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
