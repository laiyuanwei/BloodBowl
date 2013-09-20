package testManagers;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import bloodbowl.model.managers.TeamManager;
import bloodbowl.model.players.PlayerType;
import bloodbowl.model.teams.Team;
import bloodbowl.model.teams.TeamType;
import java.util.ArrayList;
import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Create test methods to the TeamManager class.
 * @author Yuanwei Lai
 */
public class TeamManagerTest extends TestCase {

    private TeamManager teamManager=null;
    Team teamA, teamB,teamX;
    ArrayList<String> teamNames=new ArrayList();
    
    /**
     * The constructor invoked the Super class constructor with using parameter testName.
     * 
     * @param testName
     */
    public TeamManagerTest(String testName) {
        super(testName);
    }

    /**
     * This method initiate an instance of TeamManager class which provide to future testing
     * on the methods within TeamManager class
     * 
     * @throws Exception
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        teamManager= new TeamManager();
    }

    /**
     * This method stop the testing process.
     * @throws Exception
     */
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of createTeam method, of class TeamManager.
     * This tested method try to create a team instance with teamType(Humans),
     * teamName(Greeks Gods),teamId(1). And compare the created value whether is equal to
     * the expect value by using assertEquals() methods.
     *
     */
    public void testCreateTeam() {
        teamManager.createTeam(1, TeamType.HUMAN_TYPE, "Greek Gods"); // 1 stands for team A
        teamA = teamManager.getTeam();

        Assert.assertEquals(1, teamA.getID());
        Assert.assertEquals(TeamType.HUMAN_TYPE, teamA.getType());
        Assert.assertEquals("Greek Gods",teamManager.getTeam().getName() );
       }

    /**
     * Test of createPlayer method, of class TeamManager.
     * This method first create the team then create the players within the
     * teams. In order to check the whether the Created Player worked or not
     * We evaluate it the total number of player created instead of check the detail
     * of each player's statistic.
     */
    public void testCreatePlayer() {
        teamManager.createTeam(2, TeamType.ORC_TYPE, "Just a test"); //2 stands for team B
        teamManager.createPlayer(PlayerType.LINEMAN);
        teamManager.createPlayer(PlayerType.LINEMAN);
        teamManager.createPlayer(PlayerType.LINEMAN);
        teamManager.createPlayer(PlayerType.LINEMAN);
        teamManager.createPlayer(PlayerType.BLITZER);
        teamB = teamManager.getTeam();
        Assert.assertEquals(4, teamB.getNumLineman());
       // Assert.assertEquals(16, teamB.getMaxLineman());
        Assert.assertEquals(5, teamB.getTotalPlayers());
        Assert.assertEquals(1, teamB.getNumBlitzer());
    }

    /**
     * Test of setTeam method, of class TeamManager.
     * This method is trying to test the setTeam() method which evaluate the
     * expected team's name.
     */
    public void testSetTeam() {

        teamManager.createTeam(2, TeamType.ORC_TYPE, "Just a test"); //2 stands for team B
        teamB = teamManager.getTeam();

        teamManager.setTeam(teamB);
        Assert.assertEquals("Just a test",teamManager.getTeam().getName());

        
    }

    /**
     * Test of getTeam method, of class TeamManager.
     * This method is to test the the getTeam(() method by examine the team name.
     */
    public void testGetTeam() {
       teamManager.createTeam(3, TeamType.ELF_TYPE, "Concordia");
       teamX=teamManager.getTeam();
       Assert.assertEquals("Concordia",teamX.getName());
    }

}
