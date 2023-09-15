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
    public void testExecuteCommands() {
        Spacecraft spacecraft = new Spacecraft();
        spacecraft.executeCommands(new String[]{"f", "r", "u", "b", "l"});
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
}
