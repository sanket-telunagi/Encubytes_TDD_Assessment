package eta;

import static org.junit.Assert.assertEquals;

import java.beans.Transient;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class EncubytesTDDAssessmentTest 
{
    /**
     * Rigorous Test :-)
     */
    // initialisation test scenario 
    @Test
    public void testInitializeSpacecraft() {
        Spacecraft spacecraft = new Spacecraft();
        assertEquals(0, spacecraft.getX());
        assertEquals(0, spacecraft.getY());
        assertEquals(0, spacecraft.getZ());
        assertEquals("N", spacecraft.getDirection());
        String actualCoordinates = "(0, 0, 0) N" ;
        String result = spacecraft.getCoordinates() ;
        assertEquals(actualCoordinates, result) ;

    }
    // testing move forward function 
    @Test
    public void testMoveForward() {
        Spacecraft spacecraft = new Spacecraft();
        spacecraft.executeCommand("f");
        assertEquals(0, spacecraft.getX());
        assertEquals(1, spacecraft.getY());
    }
    // tesing move backward function 
    @Test
    public void testMoveBackward() {
        Spacecraft spacecraft = new Spacecraft();
        spacecraft.executeCommand("b");
        assertEquals(0, spacecraft.getX());
        assertEquals(-1, spacecraft.getY());
    }

    // testing left turn 
    @Test
    public void testTurnLeft() {
        Spacecraft spacecraft = new Spacecraft();
        spacecraft.executeCommand("l");
        assertEquals("W", spacecraft.getDirection());
    }

    // testing right turn 
    @Test
    public void testTurnRight() {
        Spacecraft spacecraft = new Spacecraft();
        spacecraft.executeCommand("r");
        assertEquals("E", spacecraft.getDirection());
    }

    // testing up tilt 
    @Test
    public void testTiltUp() {
        Spacecraft spacecraft = new Spacecraft();
        spacecraft.executeCommand("u");
        assertEquals("Up", spacecraft.getDirection());
    }

    // tesing down tilt 
    @Test
    public void testTiltDown() {
        Spacecraft spacecraft = new Spacecraft();
        spacecraft.executeCommand("d");
        assertEquals("Down", spacecraft.getDirection());
    }

    // executing all the commands 
    @Test
    public void testExecuteCommands() {
        Spacecraft spacecraft = new Spacecraft();
        String args [] = new String[]{"f", "r", "u", "b", "l"} ;
        spacecraft.executeCommands(args);
        assertEquals(0, spacecraft.getX());
        assertEquals(1, spacecraft.getY());
        assertEquals(-1, spacecraft.getZ());
        assertEquals("N", spacecraft.getDirection());
    }
    // tesing out of bounds commands 
    @Test
    public void testOutOfBounds() {
        Spacecraft spacecraft = new Spacecraft();
        spacecraft.executeCommand("b");
        assertEquals(0, spacecraft.getX());
        assertEquals(-1, spacecraft.getY());
        spacecraft.executeCommand("l");
        assertEquals("W", spacecraft.getDirection());
        spacecraft.executeCommand("f");
        assertEquals(-1, spacecraft.getX());
        assertEquals(-1, spacecraft.getY());
        System.out.println(spacecraft.getCoordinates());
    }
    // tesing invalid commands
    @Test
    public void testInvalidCommands() {
        Spacecraft spacecraft = new Spacecraft();
        spacecraft.executeCommand("x"); // Invalid command
        assertEquals(0, spacecraft.getX());
        assertEquals(0, spacecraft.getY());
        assertEquals(0, spacecraft.getZ());
        assertEquals("N", spacecraft.getDirection());
    }
    // tesing multiple commands 
    @Test
    public void testMultipleCommands() {
        Spacecraft spacecraft = new Spacecraft();
        spacecraft.executeCommands(new String[]{"f", "r", "b", "l", "u", "d"});
        assertEquals(-1, spacecraft.getX());
        assertEquals(1, spacecraft.getY());
        assertEquals(0, spacecraft.getZ());
        assertEquals("Down", spacecraft.getDirection());
    }
}
