/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package facad;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adithya Anand
 */
public class FacadTest {
    
    public FacadTest() {
    }
    

    /**
     * Test of drawCircle method, of class Facad.
     */
    @Test
    public void testDrawCircle() {
        System.out.println("drawCircle");
        Facad instance = new Facad();
        String expResult = "Circle: draw()";
        String result = instance.drawCircle();
        //Positive Test Cases
        assertEquals(expResult, result);
        assertEquals("Circle: draw()", instance.drawCircle());
        
        //Negative Test Cases
        assertNotEquals("Not Circle", instance.drawCircle());
        assertNotEquals("Rectangle", instance.drawCircle());
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of drawRectangle method, of class Facad.
     */
    @Test
    public void testDrawRectangle() {
        System.out.println("drawRectangle");
        Facad instance = new Facad();
        String expResult = "Rectangle: draw()";
        String result = instance.drawRectangle();
        //assertEquals(expResult, result);
        
        assertEquals(expResult, result);
        assertEquals("Rectangle: draw()", instance.drawRectangle());
        
        //Negative Test Cases
        assertNotEquals("Not Rectangle", instance.drawRectangle());
        assertNotEquals("Square", instance.drawRectangle());
        
        
        
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of drawSquare method, of class Facad.
     */
    @Test
    public void testDrawSquare() {
        System.out.println("drawSquare");
        Facad instance = new Facad();
        String expResult = "Square: draw()";
        String result = instance.drawSquare();
        assertEquals(expResult, result);
        
        assertEquals(expResult, result);
        assertEquals("Square: draw()", instance.drawSquare());
        
        //Negative Test Cases
        assertNotEquals("Not Square", instance.drawSquare());
        assertNotEquals("Circle", instance.drawSquare());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        
    }
    
}
