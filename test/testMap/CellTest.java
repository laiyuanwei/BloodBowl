/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package testMap;

import bloodbowl.model.map.DugoutCell;
import junit.framework.Assert;
import junit.framework.TestCase;


/**
 * Create test methods to the Cell class.
 * @author Yuanwei Lai
 */
public class CellTest extends TestCase {

   
     private DugoutCell dugoutcell=null;
    
    /**
     * The constructor invoked the Super class constructor with using parameter testName.
     * @param testName
     */
    public CellTest(String testName) {
        super(testName);
    }

    /**
     * This setUp() instantiate the instance of Cell class with row=1, column=2
     * before applied tested case method.
     * @throws Exception
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        dugoutcell=new DugoutCell(1,2);
    }

    /**
     * This method ends the CellTest finally.
     * @throws Exception
     */
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of getColumn method, of class Cell.
     * This method test the cell column.
     */
    public void testGetColumn() {
       Assert.assertEquals(2, dugoutcell.getColumn());
    }

    /**
     * Test of getRow method, of class Cell.
     * This method test the cell row.
     */
    public void testGetRow() {
        int expResult = 1;
        int result = dugoutcell.getRow();
        assertEquals(expResult, result);
        
    }

 
    /**
     * Test of getZone method, of class Cell.
     * This method is to test the getZone() return value.
     */
    public void testGetZone() {
        int expResult = 1;
        int result = dugoutcell.getZone();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPlayer method, of class Cell.
     * This method is to test whether the player can be set to active.
     */
    public void testSetPlayer() {
        dugoutcell.setPlayer();
        Assert.assertEquals(true, dugoutcell.hasPlayer());
    }

    /**
     * Test of resetPlayer method, of class Cell.
     * This method test whether the resetPlayer() method will 
     * reset the player as non-active player or not.
     */
    public void testResetPlayer() {
        dugoutcell.resetPlayer();
        Assert.assertEquals(false, dugoutcell.hasPlayer());
    }

    /**
     * Test of hasPlayer method, of class Cell.
     * This method test whether the hasPlayer work or not.
     */
    public void testHasPlayer() {
        boolean expResult = false;
        boolean result = dugoutcell.hasPlayer();
        assertEquals(expResult, result);
        
    }

  
}
