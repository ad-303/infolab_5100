/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package rover;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Adithya Anand
 */
public class StateTest {
    
    public StateTest() {
    }
    
    

    /**
     * Test of pressRightPedal method, of class State.
     */
    @Test
    public void testPressRightPedal() {
        System.out.println("RightPedalforTime Successfully Tested");
        State st = new State();
        assertFalse(st.pressRightPedal(1));
//        System.out.println("pressRightPedal");
//        int numOfTimesPressed = 0;
//        State instance = new State();
//        Boolean expResult = null;
//        Boolean result = instance.pressRightPedal(numOfTimesPressed);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of pressRightPedalForTime method, of class State.
     */
    @Test
    public void testPressRightPedalForTime() {
        System.out.println("RightPedalforTime Successfully Tested ");
        State st = new State();
        assertFalse(st.pressRightPedal(1));
//        System.out.println("pressRightPedalForTime");
//        int numOfSecondsPressed = 0;
//        State instance = new State();
//        instance.pressRightPedalForTime(numOfSecondsPressed);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of pressLeftPedal method, of class State.
     */
    @Test
    public void testPressLeftPedal() {
        System.out.println("LeftPedalforTime Successfully Tested ");
        State st = new State();
        assertFalse(st.pressLeftPedal(1));
//        System.out.println("pressLeftPedal");
//        int numOfTimesPressed = 0;
//        State instance = new State();
//        Boolean expResult = null;
//        Boolean result = instance.pressLeftPedal(numOfTimesPressed);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of pressLeftPedalForTime method, of class State.
     */
    @Test
    public void testPressLeftPedalForTime() {
        System.out.println("LeftPedal Successfully Tested");
        State st = new State();
        assertFalse(st.pressLeftPedal(1));
//        System.out.println("pressLeftPedalForTime");
//        int numOfSecondsPressed = 0;
//        State instance = new State();
//        Boolean expResult = null;
//        Boolean result = instance.pressLeftPedalForTime(numOfSecondsPressed);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of voidPressLeftPedalForTime method, of class State.
     */
    @Test
    public void testVoidPressLeftPedalForTime() {
//        System.out.println("voidPressLeftPedalForTime");
//        int numOfSecondsPressed = 0;
//        State instance = new State();
//        instance.voidPressLeftPedalForTime(numOfSecondsPressed);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
