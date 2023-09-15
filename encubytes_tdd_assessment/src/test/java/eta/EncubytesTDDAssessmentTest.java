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
    @Test
    public void testExecuteCommands() {
        Spacecraft spacecraft = new Spacecraft();
        spacecraft.executeCommands(new String[]{"f", "r", "u", "b", "l"});

        assertEquals("N", spacecraft.getDirection());
    }
}
