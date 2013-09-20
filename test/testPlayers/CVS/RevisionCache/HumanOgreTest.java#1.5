/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package testPlayers;


import bloodbowl.model.map.DugoutCell;
import bloodbowl.model.players.Actions;
import bloodbowl.model.players.HumanOgre;
import bloodbowl.model.players.PlayerStates;
import bloodbowl.model.players.Skills;
import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.ArrayList;


/**
 * This class test HumanOgre class and its relevant methods.
 * @author Yuanwei Lai
 */
public class HumanOgreTest extends TestCase {
    ArrayList<Skills> skillsList = new ArrayList<Skills>();
    private HumanOgre ogre=null;
    private DugoutCell cell=null;
    private DugoutCell newcell=null;



    /**
     *
     * @param testName
     */
    public HumanOgreTest(String testName) {
        super(testName);
    }

    /**
     *
     * @throws Exception
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
       
        ogre=new HumanOgre();
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
       Assert.assertEquals(5, ogre.getMa());
    }

    /**
     * This is test set method.
     */
    public void testDecreaseMovementLeft()
    {
        ogre.decreaseMovementLeft();
        Assert.assertEquals(4, ogre.getMa()-1);
        //maLeft--;
    }
    /**
     * This is test get method.
     */
    public void testCanMove()
    {
        boolean expected;
        if(ogre.getMa()>0)
            expected=true;
        else
            expected=false;
       Assert.assertEquals(false,ogre.canMove());
    }
    /**
     * This is test set method.
     */
    public void testSetTeamID()
    {
        ogre.setTeamID(5);
        Assert.assertEquals(5,ogre.getTeamID());

        //teamID=id;
    }

    /**
     * This is test get method.
     */
    public void  testGetTeamID()
    {

        Assert.assertEquals(0, ogre.getTeamID());
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
        ogre.setActive();
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
          ogre.setActive();
          Assert.assertEquals(true, cell.hasPlayer());
          Assert.assertEquals(true, newcell.hasPlayer());
          Assert.assertEquals(true, ogre.getActive());
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
        
        ogre.setActive();
        Assert.assertEquals(true, ogre.getActive());
        
    }


    /**
     * This is test get method.
     */
    public void testGetActive() {
       // return isActive;
      Assert.assertEquals(false,ogre.getActive());
    }



    /**
     * This is test get method.
     */
    public void testGetMa() {
        //return ma;
        Assert.assertEquals(5, ogre.getMa());

    }


    /**
     * This is test get method.
     */
    public void testGetSt() {
        //return st;
        Assert.assertEquals(5, ogre.getSt());
    }

    /**
     * This is test get method.
     */
    public void testGetAv() {
        //return av;
        Assert.assertEquals(9, ogre.getAv());
    }

    /**
     * This is test get method.
     */
    public void testHasMoved(){
        //return hasMoved;
        Assert.assertEquals(false,ogre.hasMoved());
    }

    /**
     * This is test get method.
     */
    public void testGetAg() {
        Assert.assertEquals(2, ogre.getAg());
    }

    /**
     * This method is to test whether can set method can get the injured state or not.
     */
    public void testSetInjuredState() {

        //blitzer.setIsInjured(true);
        Boolean actual;
        ogre.setState(PlayerStates.INJURED);
        if(ogre.getState()==PlayerStates.INJURED){
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
       ogre.setState(PlayerStates.INJURED);
       Assert.assertTrue(ogre.getState()==PlayerStates.INJURED);
    }

    /**
     * This method is to test whether can set method can get the injured state or not.
     */
    public void testSetKnockedOutState(){
        Boolean actual;
        ogre.setState(PlayerStates.KNOCKED);
        if(ogre.getState()==PlayerStates.KNOCKED){
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
      ogre.setState(PlayerStates.KNOCKED);
       Assert.assertTrue(ogre.getState()==PlayerStates.KNOCKED);
    }

    /**
     * This method is to test whether the movement
     *  finished or not.
     */
    public void testDoneActionInTurn(){
        ogre.doneActionInTurn();
        Assert.assertEquals(true,ogre.hasMoved());
    }

  

    /**
     * This method is to test whether the coach can increase
     * MVP's point by default value(five points a time).
     */
    public void testSelectedMostValued() {
        ogre.selectedMostValued();
        Assert.assertEquals(5,ogre.getPoints());
    }

    /**
     * This method is to test whether the coach can increase
     * MVP's point by any points(user input).
     */
    public void testIncrementPointsBy() {
        //points += addMorePoints;
        ogre.incrementPointsBy(10); // add 10 points
        Assert.assertEquals(10,ogre.getPoints());
    }

    /**
     * This method is to test whether AwardPointsForAction method can return
     * right score of player or not after an action. For example, a player perform
     * a series action, the score should be sum of every action's score.
     */
    public void TestAwardPointsForAction() {

        for(int i=0;i<=10;i++){
        ogre.awardPointsForAction(Actions.PASS);
        ogre.awardPointsForAction(Actions.KNOCKDOWN);
        ogre.awardPointsForAction(Actions.TACKLE);
        ogre.awardPointsForAction(Actions.TOUCHDOWN);
        }
        Assert.assertEquals(10*(1+2+2+3),ogre.getPoints());
    }

    /**
     * This method is to test the GetPoints method.
     */
    public void TestGetPoints(){
        ogre.incrementPointsBy(1);
        Assert.assertEquals(1,ogre.getPoints());
    }




}
