/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package testTeams;

//import bloodbowl.model.players.Blackorc;
import bloodbowl.model.players.ElvesBlitzer;
import bloodbowl.model.players.Player;
import bloodbowl.model.players.PlayerType;
import bloodbowl.model.players.Skills;
import bloodbowl.model.teams.Humans;
import bloodbowl.model.teams.TeamType;
import java.util.ArrayList;
import junit.framework.Assert;
import junit.framework.TestCase;

/**
 *
 * @author Yuanwei Lai
 */
public class HumansTest extends TestCase {
    private Humans humans=null;
    //private Blackorc blackorc=null;
    ArrayList<Skills> skillsList = new ArrayList<Skills>();
    ArrayList<Player> player = new ArrayList<Player>();
    /**
     *
     * @param testName
     */
    public HumansTest(String testName) {
        super(testName);
    }

    /**
     *
     * @throws Exception
     */
    @Override
    protected void setUp() throws Exception {
         super.setUp();
         humans=new Humans(2,"This is a Humans test");
         //blackorc=new Blackorc(1,2,3,4,"This is a test",10,skillsList);
    }

    /**
     *
     * @throws Exception
     */
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     *
     */
    public void testGetType() {
       Assert.assertEquals(TeamType.HUMAN_TYPE,humans.getType());
    }

    /**
     *
     */
    public void testGetTurns() {
        //return turns;
        Assert.assertEquals(0, humans.getTurns());
    }



    /**
     *
     */
    public void testGetLooses() {
        //return looses;
        Assert.assertEquals(0, humans.getLooses());

    }

    /**
     *
     */
    public void testScores() {
        //return scores;
        Assert.assertEquals(0,humans.getScores());
    }

    /**
     *
     */
    public void testGetWins() {
        //return wins;
        Assert.assertEquals(0, humans.getWins());
      }

    /**
     *
     */
    public void testGetID()
    {
        //return teamID;
        Assert.assertEquals(2,humans.getID());
    }

    /**
     *
     */
    public void testSetID()
    {
        humans.setID(2);
        Assert.assertEquals(2,humans.getID());
        // this.teamID=teamID;

    }

   

    /**
     *
     */
    public void  testGetTotalPlayers()
    {
            //return totalPlayers;
        Assert.assertEquals(0,humans.getTotalPlayers());

    }

    /**
     *
     */
    public void  testGetName()
    {
        //return name;
        Assert.assertEquals("This is a Humans test", humans.getName());
    }



  /*****************************Player count getters***********************/

    public void testGetMaxBlackorc() {

        Assert.assertEquals(0, humans.getMaxBlackorc());
    }


    /**
     *
     */
    public void testGetMaxBlitzer() {

        Assert.assertEquals(4, humans.getMaxBlitzer());
      }

    /**
     *
     */
    public void testGetMaxCatcher() {
        //return maxCatcher;
        Assert.assertEquals(4, humans.getMaxCatcher());
    }

    /**
     *
     */
    public void testGetMaxGoblin() {
        //return maxGoblin;
        Assert.assertEquals(0, humans.getMaxGoblin());
    }

    /**
     *
     */
    public void testGetMaxLineman() {
        //return maxLineman;
        Assert.assertEquals(16, humans.getMaxLineman());
    }

    /**
     * This class test Humans class and its relevant methods.
     */
    public void testGetMaxOgre() {
        //return maxOgre;
        Assert.assertEquals(1,humans.getMaxOgre());
        }

    /**
     * This is test get method.
     */
    public void testGetMaxThrower() {
        //return maxThrower;
        Assert.assertEquals(2, humans.getMaxThrower());
    }

    /**
     * This is test get method.
     */
    public void testGetMaxTroll() {
        Assert.assertEquals(0, humans.getMaxTroll());
    }

    /**
     * This is test get method.
     */
    public void testGetNumBlackorc() {
        //return numBlackorc;
        Assert.assertEquals(0, humans.getNumBlackorc());

    }

    /**
     * This is test get method.
     */
    public void testGetNumBlitzer() {
        //return numBlitzer;
        Assert.assertEquals(0, humans.getNumBlitzer());
    }

    /**
     * This is test get method.
     */
    public void testGetNumCatcher() {
        //return numCatcher;
        Assert.assertEquals(0,humans.getNumCatcher());
    }

    /**
     * This is test get method.
     */
    public void testGetNumGoblin() {
        //return numGoblin;
        Assert.assertEquals(0, humans.getNumGoblin());
    }

    /**
     * This is test method turnComplete.
     */
    public void testTurnComplete()
    {
        int turn=humans.getTurns()-1;
        humans.turnComplete();
        if(humans.getTurns()>0)
          {
            Assert.assertEquals(turn, humans.getTurns());
           }
        Assert.assertEquals(false,humans.getPlayerHasMadePass());
    }

   /**
    * This is test method of passMade.
    */
   public void testPassMade(){
       humans.passMade();
       Assert.assertTrue(humans.getPlayerHasMadePass());
    }

   /**
    * This is the method of test getPassHasMade method.
    */
   public void testGetPassHasMade(){
       humans.passMade();
       Assert.assertTrue(humans.getPlayerHasMadePass());
     }

    /**
     * This is the test method of IsValidPlayerAddition.
     * Since the player has only zero player, thus isValidPlayerAddision
     * return false value.
     */
    public void testIsValidPlayerAddition(){
      boolean b=humans.isValidPlayerAddition(PlayerType.BLACKORC);
      Assert.assertFalse(b);
    }

    /**
     * This is the test method of addPlayer.
     */
    public void testAddPlayer(){
     ElvesBlitzer blitzer=new ElvesBlitzer();
     humans.initializePlayers();
     humans.addPlayer(blitzer);
     Assert.assertTrue(humans.getTotalPlayers()==1);
    }
}
