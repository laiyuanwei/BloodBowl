/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package testPlayers;


import bloodbowl.model.map.DugoutCell;
import bloodbowl.model.players.Actions;
import bloodbowl.model.players.OrcLineman;
import bloodbowl.model.players.PlayerStates;
import bloodbowl.model.players.Skills;
import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.ArrayList;


/**
 * This class test ElvesLineman class and its relevant methods.
 * @author Yuanwei Lai
 */
public class OrcLinemannTest extends TestCase {
    ArrayList<Skills> skillsList = new ArrayList<Skills>();
    private OrcLineman lineman=null;
    private DugoutCell cell=null;
    private DugoutCell newcell=null;



    /**
     *
     * @param testName
     */
    public OrcLinemannTest(String testName) {
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
       // lineman=new Lineman(1,2,3,4,10,skillsList,PlayerType.LINEMAN);
        lineman=new OrcLineman();
        cell=new DugoutCell(1,2);
        newcell=new  DugoutCell(1,2);

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
       Assert.assertEquals(5, lineman.getMa());
    }

    /**
     * This is test set method.
     */
    public void testDecreaseMovementLeft()
    {
        lineman.decreaseMovementLeft();
        Assert.assertEquals(4, lineman.getMa()-1);
        //maLeft--;
    }
    /**
     * This is test set method.
     */
    public void testCanMove()
    {
        boolean expected;
        if(lineman.getMa()>0)
            expected=true;
        else
            expected=false;
       Assert.assertEquals(false,lineman.canMove());
    }
   /**
    *  This is test set method.
    */
   public void testSetTeamID()
    {
        lineman.setTeamID(5);
        Assert.assertEquals(5,lineman.getTeamID());

        //teamID=id;
    }

    /**
     * This is test get method.
     */
    public void  testGetTeamID()
    {

        Assert.assertEquals(0, lineman.getTeamID());
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
        lineman.setActive();
        //blackorc.setChanged();
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
          lineman.setActive();
          Assert.assertEquals(true, cell.hasPlayer());
          Assert.assertEquals(true, newcell.hasPlayer());
          Assert.assertEquals(true, lineman.getActive());
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
        lineman.setActive();
        Assert.assertEquals(true, lineman.getActive());
        //setChanged();
        //notifyObservers();
    }


  /**
   * This is test get method.
   */
  public void testGetActive() {
       // return isActive;
      Assert.assertEquals(false,lineman.getActive());
    }



    /**
     * This is test get method.
     */
    public void testGetMa() {
        //return ma;
        Assert.assertEquals(5, lineman.getMa());

    }


    /**
     * This is test get method.
     */
    public void testGetSt() {
        //return st;
        Assert.assertEquals(3, lineman.getSt());
    }

    /**
     * This is test get method.
     */
    public void testGetAv() {
        //return av;
        Assert.assertEquals(9, lineman.getAv());
    }

    /**
     * This is test get method.
     */
    public void testHasMoved(){
        //return hasMoved;
        Assert.assertEquals(false,lineman.hasMoved());
    }

    /**
     * This is test get method.
     */
    public void testGetAg() {
        Assert.assertEquals(3, lineman.getAg());
    }

    /**
     *  This method is to test whether the movement
     *  finished or not.
     */
    public void testDoneActionInTurn(){
        lineman.doneActionInTurn();
        Assert.assertEquals(true,lineman.hasMoved());
    }

   /**
     * This method is to test whether can set method can get the injured state or not.
     */
    public void testSetInjuredState() {

        //blitzer.setIsInjured(true);
        Boolean actual;
        lineman.setState(PlayerStates.INJURED);
        if(lineman.getState()==PlayerStates.INJURED){
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
       lineman.setState(PlayerStates.INJURED);
       Assert.assertTrue(lineman.getState()==PlayerStates.INJURED);
    }

    /**
     * This method is to test whether can set method can get the injured state or not.
     */
    public void testSetKnockedOutState(){
        Boolean actual;
        lineman.setState(PlayerStates.KNOCKED);
        if(lineman.getState()==PlayerStates.KNOCKED){
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
      lineman.setState(PlayerStates.KNOCKED);
       Assert.assertTrue(lineman.getState()==PlayerStates.KNOCKED);
    }

    /**
     * This method is to test whether the coach can increase
     * MVP's point by default value(five points a time).
     */
    public void testSelectedMostValued() {
        lineman.selectedMostValued();
        Assert.assertEquals(5,lineman.getPoints());
    }

    /**
     * This method is to test whether the coach can increase
     * MVP's point by any points(user input).
     */
    public void testIncrementPointsBy() {
        //points += addMorePoints;
        lineman.incrementPointsBy(10); // add 10 points
        Assert.assertEquals(10,lineman.getPoints());
    }

    /**
     * This method is to test whether AwardPointsForAction method can return
     * right score of player or not after an action. For example, a player perform
     * a series action, the score should be sum of every action's score.
     */
    public void TestAwardPointsForAction() {

        for(int i=0;i<=10;i++){
        lineman.awardPointsForAction(Actions.PASS);
        lineman.awardPointsForAction(Actions.KNOCKDOWN);
        lineman.awardPointsForAction(Actions.TACKLE);
        lineman.awardPointsForAction(Actions.TOUCHDOWN);
        }
        Assert.assertEquals(10*(1+2+2+3),lineman.getPoints());
    }

    /**
     * This method is to test the GetPoints method.
     */
    public void TestGetPoints(){
        lineman.incrementPointsBy(1);
        Assert.assertEquals(1,lineman.getPoints());
    }
}
