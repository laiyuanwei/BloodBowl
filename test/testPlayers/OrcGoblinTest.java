/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package testPlayers;

import bloodbowl.model.map.DugoutCell;
import bloodbowl.model.players.Actions;
import bloodbowl.model.players.OrcGoblin;
import bloodbowl.model.players.PlayerStates;
import bloodbowl.model.players.Skills;
import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.ArrayList;


/**
 * This class test OrcGoblin class and its relevant methods.
 * @author Yuanwei Lai
 */
public class OrcGoblinTest extends TestCase {
    ArrayList<Skills> skillsList = new ArrayList<Skills>();
    private OrcGoblin goblin=null;
    private  DugoutCell cell=null;
    private  DugoutCell newcell=null;
    


    /**
     *
     * @param testName
     */
    public OrcGoblinTest(String testName) {
        super(testName);
    }

    /**
     *
     * @throws Exception
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
       // skill=Skills.PASS;
       // goblin=new Goblin(1,2,3,4,10,skillsList,PlayerType.GOBLIN);
         goblin=new OrcGoblin();
        cell=new DugoutCell(1,2);
        newcell=new  DugoutCell(1,2);
       // location=new Cell(1,2);
       // clickedCell=new Cell(3,4);
    }

    /**
     *
     * @throws Exception
     */
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    // TODO add test methods here. The name must begin with 'test'. For example:
    // public void testHello() {}

   

    /**
     * This is test get method.
     */
    public void testGetMaLeft(){
       Assert.assertEquals(6, goblin.getMa());
    }

    /**
     * This is test get method.
     */
    public void testDecreaseMovementLeft()
    {
        goblin.decreaseMovementLeft();
        Assert.assertEquals(5, goblin.getMa()-1);
        //maLeft--;
    }
    /**
     * This is test get method.
     */
    public void testCanMove()
    {
        boolean expected;
        if(goblin.getMa()>0)
            expected=true;
        else
            expected=false;
       Assert.assertEquals(false,goblin.canMove());
    }
   /**
    * This is test set method.
    */
   public void testSetTeamID()
    {
        goblin.setTeamID(5);
        Assert.assertEquals(5,goblin.getTeamID());

        //teamID=id;
    }

   /**
    * This is test get method.
    */
   public void  testGetTeamID()
    {

        Assert.assertEquals(0, goblin.getTeamID());
        //return teamID;
    }
    /**
     * This is test set method.
     */
    public void testSetLocation()  //Method for relocation during gameplay
    {
        cell.resetPlayer();
        //cell = (PitchCell) newcell;
        cell.setPlayer();
        newcell.setPlayer();
        goblin.setActive();
        //goblin.setChanged();
        Assert.assertEquals(true, cell.hasPlayer());
        Assert.assertEquals(true,newcell.hasPlayer());


    }

    /**
     * This is test set method.
     */
    public void testSetUpOnLocation() //Method for setting location at game start
    {
          newcell.setPlayer();
          cell=newcell;
          goblin.setActive();
          Assert.assertEquals(true, cell.hasPlayer());
          Assert.assertEquals(true, newcell.hasPlayer());
          Assert.assertEquals(true, goblin.getActive());
     }
    /**
     * This is test get method.
     */
    public void testGetLocation()
    {

        Assert.assertEquals(1,cell.getRow());
        Assert.assertEquals(2,cell.getColumn());
        Assert.assertEquals(1,cell.getZone());
        Assert.assertEquals(false,cell.hasPlayer());

        }


    /**
     * This is test set method.
     */
    public void testSetActive() {
        //this.isActive = true;
        goblin.setActive();
        Assert.assertEquals(true, goblin.getActive());
        //setChanged();
        //notifyObservers();
    }


  /**
   * This is test get method.
   */
  public void testGetActive() {
       // return isActive;
      Assert.assertEquals(false,goblin.getActive());
    }



  /**
   * This is test set method.
   */
  public void testGetMa() {
        //return ma;
        Assert.assertEquals(6, goblin.getMa());

    }

   
    /**
     * This is test get method.
     */
    public void testGetSt() {
        //return st;
        Assert.assertEquals(2, goblin.getSt());
    }

    /**
     * This is test get method.
     */
    public void testGetAv() {
        //return av;
        Assert.assertEquals(7, goblin.getAv());
    }

    /**
     * This is test get method.
     */
    public void testHasMoved(){
        //return hasMoved;
        Assert.assertEquals(false,goblin.hasMoved());
    }

    /**
     * This is test get method.
     */
    public void testGetAg() {
        Assert.assertEquals(3, goblin.getAg());
    }

    /**
     * This method is to test whether the movement
     *  finished or not.
     */
    public void testDoneActionInTurn(){
        goblin.doneActionInTurn();
        Assert.assertEquals(true,goblin.hasMoved());
    }

    /**
     * This method is to test whether can set method can get the injured state or not.
     */
    public void testSetInjuredState() {

        //blitzer.setIsInjured(true);
        Boolean actual;
        goblin.setState(PlayerStates.INJURED);
        if(goblin.getState()==PlayerStates.INJURED){
         actual=true;
        }
        else
         actual=false;
        Assert.assertTrue(actual);
    }

    /**
     * This method is to test the get method of injured state.
     */
    public void testGetInjuredState(){
       goblin.setState(PlayerStates.INJURED);
       Assert.assertTrue(goblin.getState()==PlayerStates.INJURED);
    }

    /**
     * This method is to test whether can set method can get the injured state or not.
     */
    public void testSetKnockedOutState(){
        Boolean actual;
        goblin.setState(PlayerStates.KNOCKED);
        if(goblin.getState()==PlayerStates.KNOCKED){
         actual=true;
        }
        else
         actual=false;
        Assert.assertTrue(actual);
    }

    /**
     * This method is to test the get method of knocked out state.
     */
    public void testGetKnockedOutState(){
      goblin.setState(PlayerStates.KNOCKED);
       Assert.assertTrue(goblin.getState()==PlayerStates.KNOCKED);
    }

    /**
     * This method is to test whether the coach can increase
     * MVP's point by default value(five points a time).
     */
    public void testSelectedMostValued() {
        goblin.selectedMostValued();
        Assert.assertEquals(5,goblin.getPoints());
    }

    /**
     * This method is to test whether the coach can increase
     * MVP's point by any points(user input).
     */
    public void testIncrementPointsBy() {
        //points += addMorePoints;
        goblin.incrementPointsBy(10); // add 10 points
        Assert.assertEquals(10,goblin.getPoints());
    }

    /**
     * This method is to test whether AwardPointsForAction method can return
     * right score of player or not after an action. For example, a player perform
     * a series action, the score should be sum of every action's score.
     */
    public void TestAwardPointsForAction() {

        for(int i=0;i<=10;i++){
        goblin.awardPointsForAction(Actions.PASS);
        goblin.awardPointsForAction(Actions.KNOCKDOWN);
        goblin.awardPointsForAction(Actions.TACKLE);
        goblin.awardPointsForAction(Actions.TOUCHDOWN);
        }
        Assert.assertEquals(10*(1+2+2+3),goblin.getPoints());
    }

    /**
     * This method is to test the GetPoints method.
     */
    public void TestGetPoints(){
        goblin.incrementPointsBy(1);
        Assert.assertEquals(1,goblin.getPoints());
    }




}
