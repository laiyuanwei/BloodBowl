/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package testPlayers;


import bloodbowl.model.map.DugoutCell;
import bloodbowl.model.players.Actions;
import bloodbowl.model.players.OrcTroll;
import bloodbowl.model.players.PlayerStates;
import bloodbowl.model.players.Skills;
import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.ArrayList;


/**
 * This class test OrcTroll class and its relevant methods.
 * @author Yuanwei Lai
 */
public class OrcTrolltest extends TestCase {
    ArrayList<Skills> skillsList = new ArrayList<Skills>();
    private OrcTroll troll=null;
    private DugoutCell cell=null;
    private DugoutCell newcell=null;



    /**
     *
     * @param testName
     */
    public OrcTrolltest(String testName) {
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
        //troll=new Troll(1,2,3,4,10,skillsList,PlayerType.TROLL);
        troll=new OrcTroll();
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
       Assert.assertEquals(4, troll.getMa());
    }

    /**
     * This is test set method.
     */
    public void testDecreaseMovementLeft()
    {
        troll.decreaseMovementLeft();
        Assert.assertEquals(3, troll.getMa()-1);
        //maLeft--;
    }
    /**
     * This is test set method.
     */
    public void testCanMove()
    {
        boolean expected;
        if(troll.getMa()>0)
            expected=true;
        else
            expected=false;
       Assert.assertEquals(false,troll.canMove());
    }
   /**
    * This is test set method.
    */
   public void testSetTeamID()
    {
        troll.setTeamID(5);
        Assert.assertEquals(5,troll.getTeamID());

        //teamID=id;
    }

   /**
    * This is test get method.
    */
   public void  testGetTeamID()
    {

        Assert.assertEquals(0, troll.getTeamID());
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
        troll.setActive();
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
          troll.setActive();
          Assert.assertEquals(true, cell.hasPlayer());
          Assert.assertEquals(true, newcell.hasPlayer());
          Assert.assertEquals(true, troll.getActive());
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
        troll.setActive();
        Assert.assertEquals(true, troll.getActive());
        //setChanged();
        //notifyObservers();
    }


  /**
   * This is test get method.
   */
  public void testGetActive() {
       // return isActive;
      Assert.assertEquals(false,troll.getActive());
    }


    /**
     * This is test get method.
     */
    public void testGetMa() {
        //return ma;
        Assert.assertEquals(4, troll.getMa());

    }

 
    /**
     * This is test get method.
     */
    public void testGetSt() {
        //return st;
        Assert.assertEquals(5, troll.getSt());
    }

    /**
     * This is test get method.
     */
    public void testGetAv() {
        //return av;
        Assert.assertEquals(9, troll.getAv());
    }

    /**
     *  This is test get method.
     */
    public void testHasMoved(){
        //return hasMoved;
        Assert.assertEquals(false,troll.hasMoved());
    }

    /**
     * This is test get method.
     */
    public void testGetAg() {
        Assert.assertEquals(1, troll.getAg());
    }

    /**
     *  This method is to test whether the movement
     *  finished or not.
     */
    public void testDoneActionInTurn(){
        troll.doneActionInTurn();
        Assert.assertEquals(true,troll.hasMoved());
    }

   /**
     * This method is to test whether can set method can get the injured state or not.
     */
    public void testSetInjuredState() {

        //blitzer.setIsInjured(true);
        Boolean actual;
        troll.setState(PlayerStates.INJURED);
        if(troll.getState()==PlayerStates.INJURED){
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
       troll.setState(PlayerStates.INJURED);
       Assert.assertTrue(troll.getState()==PlayerStates.INJURED);
    }

    /**
     * This method is to test whether can set method can get the injured state or not.
     */
    public void testSetKnockedOutState(){
        Boolean actual;
        troll.setState(PlayerStates.KNOCKED);
        if(troll.getState()==PlayerStates.KNOCKED){
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
      troll.setState(PlayerStates.KNOCKED);
       Assert.assertTrue(troll.getState()==PlayerStates.KNOCKED);
    }

    /**
     * This method is to test whether the coach can increase
     * MVP's point by default value(five points a time).
     */
    public void testSelectedMostValued() {
        troll.selectedMostValued();
        Assert.assertEquals(5,troll.getPoints());
    }

    /**
     * This method is to test whether the coach can increase
     * MVP's point by any points(user input).
     */
    public void testIncrementPointsBy() {
        //points += addMorePoints;
        troll.incrementPointsBy(10); // add 10 points
        Assert.assertEquals(10,troll.getPoints());
    }

    /**
     * This method is to test whether AwardPointsForAction method can return
     * right score of player or not after an action. For example, a player perform
     * a series action, the score should be sum of every action's score.
     */
    public void TestAwardPointsForAction() {

        for(int i=0;i<=10;i++){
        troll.awardPointsForAction(Actions.PASS);
        troll.awardPointsForAction(Actions.KNOCKDOWN);
        troll.awardPointsForAction(Actions.TACKLE);
        troll.awardPointsForAction(Actions.TOUCHDOWN);
        }
        Assert.assertEquals(10*(1+2+2+3),troll.getPoints());
    }

    /**
     * This method is to test the GetPoints method.
     */
    public void TestGetPoints(){
        troll.incrementPointsBy(1);
        Assert.assertEquals(1,troll.getPoints());
    }

   

}
