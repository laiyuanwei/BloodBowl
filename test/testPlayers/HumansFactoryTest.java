/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package testPlayers;

import bloodbowl.model.players.HumanBlitzer;
import bloodbowl.model.players.HumanCatcher;
import bloodbowl.model.players.HumanLineman;
import bloodbowl.model.players.HumanOgre;
import bloodbowl.model.players.HumanThrower;
import bloodbowl.model.players.HumansFactory;
import junit.framework.Assert;
import junit.framework.TestCase;

/**
 *
 * @author Yuanwei Lai
 */
public class HumansFactoryTest extends TestCase {
    private HumansFactory humanfactory=null;

    public HumansFactoryTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        humanfactory=new HumansFactory();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of createCatcher method, of class HumansFactory.
     */
    public void testCreateCatcher() {
       Assert.assertTrue(humanfactory.createCatcher() instanceof HumanCatcher);
    }

    /**
     * Test of createBlitzer method, of class HumansFactory.
     */
    public void testCreateBlitzer() {
       Assert.assertTrue(humanfactory.createBlitzer() instanceof HumanBlitzer);
    }

    /**
     * Test of createLineman method, of class HumansFactory.
     */
    public void testCreateLineman() {
       Assert.assertTrue(humanfactory.createLineman() instanceof HumanLineman);
    }

    /**
     * Test of createOgre method, of class HumansFactory.
     */
    public void testCreateOgre() {
        Assert.assertTrue(humanfactory.createOgre() instanceof HumanOgre);
    }

    /**
     * Test of createThrower method, of class HumansFactory.
     */
    public void testCreateThrower() {
        Assert.assertTrue(humanfactory.createThrower() instanceof HumanThrower);
    }

    /**
     * Test of createBlackorc method, of class HumansFactory.
     */
    public void testCreateBlackorc() {
       Assert.assertTrue(humanfactory.createBlackorc()==null);
    }

    /**
     * Test of createTroll method, of class HumansFactory.
     */
    public void testCreateTroll() {
        Assert.assertTrue(humanfactory.createTroll()==null);
    }

    /**
     * Test of createGoblin method, of class HumansFactory.
     */
    public void testCreateGoblin() {
        Assert.assertTrue(humanfactory.createGoblin()==null);
    }

}
