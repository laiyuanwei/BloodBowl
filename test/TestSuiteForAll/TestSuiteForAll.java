/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TestSuiteForAll;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * This is an test suite which combine all the test cases of all packages and
 * no need to run test cases one by one
 * @author Yuanwei Lai
 */
public class TestSuiteForAll extends TestCase {
    
    public TestSuiteForAll(String testName) {
        super(testName);
    }
       //main consloe to control the automation of running all testing cases.
    public static Test suite() {
        TestSuite suite = new TestSuite("Tests on all the test packages");
       // add the location of each test cases into the runner.
        suite.addTestSuite(testManagers.ActionManagerTest.class);
        suite.addTestSuite(testManagers.TeamManagerTest.class);
        suite.addTestSuite(bloodbowl.model.objects.CoinTest.class);
        suite.addTestSuite(bloodbowl.model.objects.BallTest.class);
        suite.addTestSuite(testTeams.ElvesTest.class);
        suite.addTestSuite(testTeams.HumansTest.class);
        suite.addTestSuite(testTeams.OrcsTest.class);
        suite.addTestSuite(testMap.CellTest.class);
        suite.addTestSuite(testMap.DugoutCellTest.class);
        suite.addTestSuite(testMap.DugoutGridTest.class);
        suite.addTestSuite(testMap.PitchCellTest.class);
        suite.addTestSuite(testMap.PitchGridTest.class);
        suite.addTestSuite(testPlayers.ElvesBlitzerTest.class);
        suite.addTestSuite(testPlayers.ElvesCatcherTest.class);
        suite.addTestSuite(testPlayers.ElvesFactoryTest.class);
        suite.addTestSuite(testPlayers.ElvesLinemannTest.class);
        suite.addTestSuite(testPlayers.ElvesThrowertest.class);
        suite.addTestSuite(testPlayers.HumanBlitzerTest.class);
        suite.addTestSuite(testPlayers.HumanCatcherTest.class);
        suite.addTestSuite(testPlayers.HumanLinemannTest.class);
        suite.addTestSuite(testPlayers.HumanOgreTest.class);
        suite.addTestSuite(testPlayers.HumanThrowertest.class);
        suite.addTestSuite(testPlayers.HumansFactoryTest.class);
        suite.addTestSuite(testPlayers.OrcBlackorcTest.class);
        suite.addTestSuite(testPlayers.OrcBlitzerTest.class);
        suite.addTestSuite(testPlayers.OrcGoblinTest.class);
        suite.addTestSuite(testPlayers.OrcLinemannTest.class);
        suite.addTestSuite(testPlayers.OrcThrowertest.class);
        suite.addTestSuite(testPlayers.OrcTrolltest.class);
        suite.addTestSuite(testPlayers.OrcsFactoryTest.class);


        return suite;
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

}