/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package singletonpatterndemo;

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
public class SingleObjectTest {
    
    public SingleObjectTest() {
    }
    
    

    /**
     * Test of getInstance method, of class SingleObject.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        SingleObject instance = new SingleObject();
        String expResult = "Adithya Anand";
        String result = instance.showMessage();
        
        assertEquals(expResult, result);
        assertSame(expResult, result);
//        SingleObject expResult = null;
//        SingleObject result = SingleObject.getInstance();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of showMessage method, of class SingleObject.
     */
    @Test
    public void testShowMessage() {
        System.out.println("showMessage");
        SingleObject instance = new SingleObject();
        String expResult = "Adithya Anand";
        String result = instance.showMessage();
        assertEquals(expResult, result);
        assertSame(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
