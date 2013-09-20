/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package testPlayers;


import bloodbowl.model.map.DugoutCell;
import bloodbowl.model.players.Actions;
import bloodbowl.model.players.HumanBlitzer;
import bloodbowl.model.players.PlayerStates;
import bloodbowl.model.players.Skills;
import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.ArrayList;


/**
 * This class test HumanBlitzer class and its relevant methods.
 * @author Yuanwei Lai
 */
public class HumanBlitzerTest extends TestCase {
    ArrayList<Skills> skillsList = new ArrayList<Skills>();
    private HumanBlitzer blitzer=null;
    private DugoutCell dCell=null;
    private DugoutCell newDCell=null;

    /**
     * The constructor invoked the Super class constructor with using parameter testName.
     * @param testName
     */
    public HumanBlitzerTest(String testName) {
        super(testName);
    }

    /**
     * This method instantiate the instance that needed in the test cases for the
     * following test method purpose.
     * @throws Exception
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
       
        blitzer=new HumanBlitzer();
        dCell= new DugoutCell(1,2);
        newDCell= new DugoutCell(1,2);
   

    }

    /**
     * ThiS method is to end the test process.
     * @throws Exception
     */
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

   
   

   

    /**
     * This method test the  MA value.
     */
    public void testGetMaLeft(){
       Assert.assertEquals(7, blitzer.getMa());
    }



    /**
     * This method test the decrease move method, and examine the maLeft value.
     */
    public void testDecreaseMovementLeft()
    {
        blitzer.decreaseMovementLeft();
        Assert.assertEquals(6, blitzer.getMa()-1);
       
    }
    /**
     * This method test the whether player can moved or not.
     */
    public void testCanMove()
    {
        boolean expected;
        if(blitzer.getMa()>0)
            expected=true;
        else
            expected=false;
       Assert.assertEquals(false,blitzer.canMove());
    }
   /**
    * This method test the set team id method.
    */
   public void testSetTeamID()
    {
        blitzer.setTeamID(5);
        Assert.assertEquals(5,blitzer.getTeamID());

    }

    /**
     * This method test the get team id method.
     */
    public void  testGetTeamID()
    {

        Assert.assertEquals(0, blitzer.getTeamID());
       
    }
    /**
     * This method test the set location method.
     */
    public void testSetLocation()  //Method for relocation during gameplay
    {
       
        dCell.resetPlayer();
        dCell.setPlayer();
        newDCell.setPlayer();
        blitzer.setActive();
        Assert.assertEquals(true, dCell.hasPlayer());
        Assert.assertEquals(true,newDCell.hasPlayer());
        


    }

    /**
     * This method test the setup on location method.
     */
    public void testSetUpOnLocation() //Method for setting location at game start
    {
         
          dCell.setPlayer();
          newDCell=dCell;
          blitzer.setActive();
          Assert.assertEquals(true, dCell.hasPlayer());
          Assert.assertEquals(true, newDCell.hasPlayer());
          Assert.assertEquals(true, blitzer.getActive());
     }
   
   
    /**
     * This method test the get location method.
     */
    public void testGetLocation()
    {

        Assert.assertEquals(1,dCell.getRow());
        Assert.assertEquals(2,dCell.getColumn());
        Assert.assertEquals(1,dCell.getZone());
        Assert.assertEquals(false,dCell.hasPlayer());

        }

 
    /**
     * This method test whether the statue can be set or not.
     */
    public void testSetActive() {
      
        blitzer.setActive();
        Assert.assertEquals(true, blitzer.getActive());
  
    }


    /**
     *
     */
    public void testGetActive() {
      
      blitzer.setActive();
      Assert.assertEquals(true,blitzer.getActive());
    }


    /**
     * This method is test whether the get status method can work or not.
     */
    public void testGetMa() {
       
        Assert.assertEquals(7, blitzer.getMa());

    }

    /**
     * This method is test whether the get method of ST is work or not.
     */
    public void testGetSt() {
        
        Assert.assertEquals(3, blitzer.getSt());
    }

    /**
     * This method is test whether the AV is work or not.
     */
    public void testGetAv() {
        
        Assert.assertEquals(8, blitzer.getAv());
    }

    /**
     * This method is test whether the hasMoved() is work or not.
     */
    public void testHasMoved(){
       
        blitzer.resetPlayer();
        Assert.assertEquals(false,blitzer.hasMoved());
    }

    /**
     * This method is test whether the AG is work or not.
     */
    public void testGetAg() {
        Assert.assertEquals(3, blitzer.getAg());
    }

    /**
     * This method is to test whether the movement
     *  finished or not.
     */
    public void testDoneActionInTurn(){
        blitzer.doneActionInTurn();
        Assert.assertEquals(true,blitzer.hasMoved());
    }

    /**
     * This method is to test whether can set method can get the injured state or not.
     */
    public void testSetInjuredState() {

        //blitzer.setIsInjured(true);
        Boolean actual;
        blitzer.setState(PlayerStates.INJURED);
        if(blitzer.getState()==PlayerStates.INJURED){
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
       blitzer.setState(PlayerStates.INJURED);
       Assert.assertTrue(blitzer.getState()==PlayerStates.INJURED);
    }

    /**
     * This method is to test whether can set method can get the injured state or not.
     */
    public void testSetKnockedOutState(){
        Boolean actual;
        blitzer.setState(PlayerStates.KNOCKED);
        if(blitzer.getState()==PlayerStates.KNOCKED){
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
      blitzer.setState(PlayerStates.KNOCKED);
       Assert.assertTrue(blitzer.getState()==PlayerStates.KNOCKED);
    }

    /**
     * This method is to test whether the coach can increase
     * MVP's point by default value(five points a time).
     */
    public void testSelectedMostValued() {
        blitzer.selectedMostValued();
        Assert.assertEquals(5,blitzer.getPoints());
    }

    /**
     * This method is to test whether the coach can increase
     * MVP's point by any points(user input).
     */
    public void testIncrementPointsBy() {
        
        blitzer.incrementPointsBy(10); // add 10 points
        Assert.assertEquals(10,blitzer.getPoints());
    }

    /**
     * This method is to test whether AwardPointsForAction method can return
     * right score of player or not after an action. For example, a player perform
     * a series action, the score should be sum of every action's score.
     */
    public void TestAwardPointsForAction() {

        for(int i=0;i<=10;i++){
        blitzer.awardPointsForAction(Actions.PASS);
        blitzer.awardPointsForAction(Actions.KNOCKDOWN);
        blitzer.awardPointsForAction(Actions.TACKLE);
        blitzer.awardPointsForAction(Actions.TOUCHDOWN);
        }
        Assert.assertEquals(10*(1+2+2+3),blitzer.getPoints());
    }

    /**
     * This method is to test the GetPoints method.
     */
    public void TestGetPoints(){
        blitzer.incrementPointsBy(1);
        Assert.assertEquals(1,blitzer.getPoints());
    }
}
