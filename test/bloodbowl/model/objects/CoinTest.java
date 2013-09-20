/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bloodbowl.model.objects;

import junit.framework.TestCase;
import junit.framework.Assert;

/**
 *
 * @author san_mirz
 */
public class CoinTest extends TestCase {
    public CoinTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    
    /**
     * Test of toss method, of class Coin.
     */
    public void testToss() {
        System.out.println("toss");
        Assert.assertTrue(Coin.toss<2);
        }
}
