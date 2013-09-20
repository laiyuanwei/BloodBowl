/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package testMap;

import bloodbowl.model.map.DugoutCell;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * This class is to test the dugout and its relevant function methods.
 * @author Yuanwei Lai
 */
public class DugoutCellTest extends TestCase {
    private DugoutCell dugoutcell=null;

    /**
     * The constructor invoked the Super class constructor with using parameter testName.
     * @param testName
     */
    public DugoutCellTest(String testName) {
        super(testName);
    }

    /**
     * This method instantiate the instance of DugoutCell() with location (1,2).
     * @throws Exception
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        dugoutcell= new DugoutCell(2,3);
    }

    /**
     * This method ends the test cases class.
     * @throws Exception
     */
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of setZone method, of class DugoutCell.
     * This method is test whether the zone type can be set or not.
     */
    public void testSetZone() {
       
        int zoneType = 0;
       
        dugoutcell.setZone(zoneType);
        Assert.assertEquals(0,dugoutcell.getZone());
        
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
      dugoutcell.printStatus();
      Assert.assertEquals("O ",os.toString());

      //restore normal operation
      System.setOut(originalOutput);


    }


}
