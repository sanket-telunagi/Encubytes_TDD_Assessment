package eta;

import static org.junit.Assert.assertEquals;

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
}
