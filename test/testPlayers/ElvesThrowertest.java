/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package testPlayers;


import bloodbowl.model.map.DugoutCell;
import bloodbowl.model.players.Actions;
import bloodbowl.model.players.ElvesThrower;
import bloodbowl.model.players.PlayerStates;
import bloodbowl.model.players.Skills;
import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.ArrayList;


/**
 * This class test ElvesThrower class and its relevant methods.
 * @author Yuanwei Lai
 */
public class ElvesThrowertest extends TestCase {
    ArrayList<Skills> skillsList = new ArrayList<Skills>();
    private ElvesThrower thrower=null;
    private DugoutCell cell=null;
    private DugoutCell newcell=null;



    /**
     *
     * @param testName
     */
    public ElvesThrowertest(String testName) {
        super(testName);
    }

    /**
     *
     * @throws Exception
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        thrower= new ElvesThrower();
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
     *  This is test set method.
     */
    public void testGetMaLeft(){
       Assert.assertEquals(6, thrower.getMa());
    }

    /**
     * This is test set method.
     */
    public void testDecreaseMovementLeft()
    {
        thrower.decreaseMovementLeft();
        Assert.assertEquals(5, thrower.getMa()-1);
        
    }
    /**
     * This is test set method.
     */
    public void testCanMove()
    {
        boolean expected;
        if(thrower.getMa()>0)
            expected=true;
        else
            expected=false;
       Assert.assertEquals(false,thrower.canMove());
    }
   /**
    * This is test set method.
    */
   public void testSetTeamID()
    {
        thrower.setTeamID(5);
        Assert.assertEquals(5,thrower.getTeamID());

        
    }

    /**
     * This is test get method.
     */
    public void  testGetTeamID()
    {

        Assert.assertEquals(0, thrower.getTeamID());
        
    }
    /**
     * This is test set method.
     */
    public void testSetLocation()  //Method for relocation during gameplay
    {
        cell.resetPlayer();
       
        cell.setPlayer();
        newcell.setPlayer();
        thrower.setActive();
        
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
          thrower.setActive();
          Assert.assertEquals(true, cell.hasPlayer());
          Assert.assertEquals(true, newcell.hasPlayer());
          Assert.assertEquals(true, thrower.getActive());
     }
    /**
     * This is test set method.
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
        
        thrower.setActive();
        Assert.assertEquals(true, thrower.getActive());
        
    }


  /**
   * This is test get method.
   */
  public void testGetActive() {
       
      Assert.assertEquals(false,thrower.getActive());
    }



    /**
     * This is test get method.
     */
    public void testGetMa() {
        
        Assert.assertEquals(6, thrower.getMa());

    }


    /**
     * This is test get method.
     */
    public void testGetSt() {
       
        Assert.assertEquals(3, thrower.getSt());
    }

    /**
     * This is test get method.
     */
    public void testGetAv() {
       
        Assert.assertEquals(7, thrower.getAv());
    }

    /**
     * This is test get method.
     */
    public void testHasMoved(){
       
        Assert.assertEquals(false,thrower.hasMoved());
    }

    /**
     * This is test get method.
     */
    public void testGetAg() {
        Assert.assertEquals(4, thrower.getAg());
    }

     /**
      *  This method is to test whether the movement
      *  finished or not.
      */
    public void testDoneActionInTurn(){
        thrower.doneActionInTurn();
        Assert.assertEquals(true,thrower.hasMoved());
    }

 /**
     * This method is to test whether can set method can get the injured state or not.
     */
    public void testSetInjuredState() {

        //blitzer.setIsInjured(true);
        Boolean actual;
        thrower.setState(PlayerStates.INJURED);
        if(thrower.getState()==PlayerStates.INJURED){
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
       thrower.setState(PlayerStates.INJURED);
       Assert.assertTrue(thrower.getState()==PlayerStates.INJURED);
    }

    /**
     * This method is to test whether can set method can get the injured state or not.
     */
    public void testSetKnockedOutState(){
        Boolean actual;
        thrower.setState(PlayerStates.KNOCKED);
        if(thrower.getState()==PlayerStates.KNOCKED){
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
      thrower.setState(PlayerStates.KNOCKED);
       Assert.assertTrue(thrower.getState()==PlayerStates.KNOCKED);
    }

    /**
     * This method is to test whether the coach can increase
     * MVP's point by default value(five points a time).
     */
    public void testSelectedMostValued() {
        thrower.selectedMostValued();
        Assert.assertEquals(5,thrower.getPoints());
    }

    /**
     * This method is to test whether the coach can increase
     * MVP's point by any points(user input).
     */
    public void testIncrementPointsBy() {
        
        thrower.incrementPointsBy(10); // add 10 points
        Assert.assertEquals(10,thrower.getPoints());
    }

    /**
     * This method is to test whether AwardPointsForAction method can return
     * right score of player or not after an action. For example, a player perform
     * a series action, the score should be sum of every action's score.
     */
    public void TestAwardPointsForAction() {

        for(int i=0;i<=10;i++){
        thrower.awardPointsForAction(Actions.PASS);
        thrower.awardPointsForAction(Actions.KNOCKDOWN);
        thrower.awardPointsForAction(Actions.TACKLE);
        thrower.awardPointsForAction(Actions.TOUCHDOWN);
        }
        Assert.assertEquals(10*(1+2+2+3),thrower.getPoints());
    }

    /**
     * This method is to test the GetPoints method.
     */
    public void TestGetPoints(){
        thrower.incrementPointsBy(1);
        Assert.assertEquals(1,thrower.getPoints());
    }


}
