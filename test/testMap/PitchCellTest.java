/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package testMap;

import bloodbowl.model.map.PitchCell;
import junit.framework.Assert;
import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

/**
 * This class is try to test the method in the PitchCell.
 * @author Yuanwei Lai
 */
public class PitchCellTest extends TestCase {

    private PitchCell pitchcell=null;
    
    /**
     * The constructor invoked the Super class constructor with using parameter testName.
     * @param testName
     */
    public PitchCellTest(String testName) {
        super(testName);
    }

    /**
     * This method instantiate the instance PitchCell.
     * @throws Exception
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        pitchcell=new PitchCell(5,6);
    }

    /**
     * This method ends the test class.
     * @throws Exception
     */
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of setBall method, of class PitchCell.
     * This method test the set method of ball, which will set the ball status as
     * active.
     */
    public void testSetBall() {
        pitchcell.setBall();
        Assert.assertEquals(true,pitchcell.hasBall());
    }

    /**
     * Test of resetBall method, of class PitchCell.
     * This method is test the reset method of ball.
     */
    public void testResetBall() {
        pitchcell.resetBall();
        Assert.assertEquals(false, pitchcell.hasBall());
    }
 /**
     * Test of printStatus method, of class Cell.
     * This method test whether the output information is met the require
     * or not by using the input/output streams to capture the screen output then
     * compare the capture one to the expected one.
     */
    public final void testPrintStatus() {
      //prepare to capture the output
      PrintStream originalOutput=System.out;
      OutputStream os=new ByteArrayOutputStream();
      PrintStream ps=new PrintStream(os);
      System.setOut(ps);

      //perform tests
      pitchcell.printStatus();
      Assert.assertEquals("@ ",os.toString());

      //restore normal operation
      System.setOut(originalOutput);


    }

}
