/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package testPlayers;


import bloodbowl.model.map.DugoutCell;
import bloodbowl.model.players.Actions;
import bloodbowl.model.players.HumanCatcher;
import bloodbowl.model.players.PlayerStates;
import bloodbowl.model.players.Skills;
import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.ArrayList;


/**
 * This class test HumanCatcher class and its relevant methods.
 * @author Yuanwei Lai
 */
public class HumanCatcherTest extends TestCase {
    ArrayList<Skills> skillsList = new ArrayList<Skills>();
    private HumanCatcher catcher=null;
    private DugoutCell cell=null;
    private DugoutCell newcell=null;



    /**
     *
     * @param testName
     */
    public HumanCatcherTest(String testName) {
        super(testName);
    }

    /**
     *
     * @throws Exception
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
         catcher=new HumanCatcher();
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
       Assert.assertEquals(8, catcher.getMa());
    }

    /**
     * This is test get method.
     */
    public void testDecreaseMovementLeft()
    {
        catcher.decreaseMovementLeft();
        Assert.assertEquals(7, catcher.getMa()-1);
        //maLeft--;
    }
    /**
     * This is test set method.
     */
    public void testCanMove()
    {
        boolean expected;
        if(catcher.getMa()>0)
            expected=true;
        else
            expected=false;
       Assert.assertEquals(false,catcher.canMove());
    }
    /**
     * This is test set method.
     */
    public void testSetTeamID()
    {
        catcher.setTeamID(5);
        Assert.assertEquals(5,catcher.getTeamID());

        //teamID=id;
    }

    /**
     * This is test get method.
     */
    public void  testGetTeamID()
    {

        Assert.assertEquals(0, catcher.getTeamID());
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
        catcher.setActive();
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
          catcher.setActive();
          Assert.assertEquals(true, cell.hasPlayer());
          Assert.assertEquals(true, newcell.hasPlayer());
          Assert.assertEquals(true, catcher.getActive());
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
        catcher.setActive();
        Assert.assertEquals(true, catcher.getActive());
        //setChanged();
        //notifyObservers();
    }


    /**
     * This is test get method.
     */
    public void testGetActive() {
       // return isActive;
      Assert.assertEquals(false,catcher.getActive());
    }



    /**
     * This is test get method.
     */
    public void testGetMa() {
        //return ma;
        Assert.assertEquals(8, catcher.getMa());

    }


    /**
     * This is test get method.
     */
    public void testGetSt() {
        //return st;
        Assert.assertEquals(2, catcher.getSt());
    }

    /**
     * This is test get method.
     */
    public void testGetAv() {
        //return av;
        Assert.assertEquals(7, catcher.getAv());
    }

    /**
     * This is test hasMoved() method.
     */
    public void testHasMoved(){
        //return hasMoved;
        Assert.assertEquals(false,catcher.hasMoved());
    }

    /**
     * This is test get method.
     */
    public void testGetAg() {
        Assert.assertEquals(3, catcher.getAg());
    }

     /**
      * This method is to test whether the movement
      * finished or not.
      */
    public void testDoneActionInTurn(){
        catcher.doneActionInTurn();
        Assert.assertEquals(true,catcher.hasMoved());
    }

    /**
     * This method is to test whether can set method can get the injured state or not.
     */
    public void testSetInjuredState() {

        //blitzer.setIsInjured(true);
        Boolean actual;
        catcher.setState(PlayerStates.INJURED);
        if(catcher.getState()==PlayerStates.INJURED){
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
       catcher.setState(PlayerStates.INJURED);
       Assert.assertTrue(catcher.getState()==PlayerStates.INJURED);
    }

    /**
     * This method is to test whether can set method can get the injured state or not.
     */
    public void testSetKnockedOutState(){
        Boolean actual;
        catcher.setState(PlayerStates.KNOCKED);
        if(catcher.getState()==PlayerStates.KNOCKED){
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
      catcher.setState(PlayerStates.KNOCKED);
       Assert.assertTrue(catcher.getState()==PlayerStates.KNOCKED);
    }

    /**
     * This method is to test whether the coach can increase
     * MVP's point by default value(five points a time).
     */
    public void testSelectedMostValued() {
        catcher.selectedMostValued();
        Assert.assertEquals(5,catcher.getPoints());
    }

    /**
     * This method is to test whether the coach can increase
     * MVP's point by any points(user input).
     */
    public void testIncrementPointsBy() {
        //points += addMorePoints;
        catcher.incrementPointsBy(10); // add 10 points
        Assert.assertEquals(10,catcher.getPoints());
    }

    /**
     * This method is to test whether AwardPointsForAction method can return
     * right score of player or not after an action. For example, a player perform
     * a series action, the score should be sum of every action's score.
     */
    public void TestAwardPointsForAction() {

        for(int i=0;i<=10;i++){
        catcher.awardPointsForAction(Actions.PASS);
        catcher.awardPointsForAction(Actions.KNOCKDOWN);
        catcher.awardPointsForAction(Actions.TACKLE);
        catcher.awardPointsForAction(Actions.TOUCHDOWN);
        }
        Assert.assertEquals(10*(1+2+2+3),catcher.getPoints());
    }

    /**
     * This method is to test the GetPoints method.
     */
    public void TestGetPoints(){
        catcher.incrementPointsBy(1);
        Assert.assertEquals(1,catcher.getPoints());
    }
}
