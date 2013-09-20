/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bloodbowl.model.objects;


import bloodbowl.model.map.PitchGrid;
import bloodbowl.model.players.HumanLineman;
import bloodbowl.model.players.Player;
import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * This test cases is to provide tests on the Ball class
 * @author Yuanwei Lai
 */
public class BallTest extends TestCase {

    private HumanLineman lineman=null;
    private PitchGrid pitch=null;
    private Ball ball=null;
    
    public BallTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        lineman=new HumanLineman();
        pitch=new PitchGrid();
        ball=new Ball(pitch);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of setLocation method, of class Ball.
     */
    public void testSetLocation() {
        ball.setLocation(1, 2);
        Assert.assertTrue(ball.getLocation().getRow()==1&&ball.getLocation().getColumn()==2);
    }

    /**
     * Test of getLocation method, of class Ball.
     */
    public void testGetLocation() {
       ball.setLocation(5, 6);
       Assert.assertEquals(5, ball.getLocation().getRow());
       Assert.assertEquals(6, ball.getLocation().getColumn());
       
    }

    /**
     * Test of resetPossessor method, of class Ball.
     */
    public void testResetPossessor() {
      ball.resetPossessor();
      Assert.assertNull(ball.getPossessor());
    }

    /**
     * Test of getPossessor method, of class Ball.
     */
    public void testGetPossessor() {
      Assert.assertFalse(ball.getPossessor() instanceof Player);
    }

    /**
     * Test of moveUpBy method, of class Ball.
     */
    public void testMoveUpBy() {
      ball.setLocation(5, 5);
      ball.moveUpBy(2);
      Assert.assertEquals(5,ball.getLocation().getColumn());
      Assert.assertEquals(3, ball.getLocation().getRow());
    }

    /**
     * Test of moveDownBy method, of class Ball.
     */
    public void testMoveDownBy() {
      ball.setLocation(5, 5);
      ball.moveDownBy(2);
      Assert.assertEquals(5,ball.getLocation().getColumn());
      Assert.assertEquals(7, ball.getLocation().getRow());
    }

    /**
     * Test of moveLeftBy method, of class Ball.
     */
    public void testMoveLeftBy() {
      ball.setLocation(5, 5);
      ball.moveLeftBy(2);
      Assert.assertEquals(3,ball.getLocation().getColumn());
      Assert.assertEquals(5, ball.getLocation().getRow());
    }

    /**
     * Test of moveRightBy method, of class Ball.
     */
    public void testMoveRightBy() {
      ball.setLocation(5, 5);
      ball.moveRightBy(2);
      Assert.assertEquals(7,ball.getLocation().getColumn());
      Assert.assertEquals(5, ball.getLocation().getRow());
    }

    /**
     * Test of moveTopRightBy method, of class Ball.
     */
    public void testMoveTopRightBy() {
      ball.setLocation(5, 5);
      ball.moveTopRightBy(2);
      Assert.assertEquals(7,ball.getLocation().getColumn());
      Assert.assertEquals(3, ball.getLocation().getRow());
    }

    /**
     * Test of moveTopLeftBy method, of class Ball.
     */
    public void testMoveTopLeftBy() {
      ball.setLocation(5, 5);
      ball.moveTopLeftBy(2);
      Assert.assertEquals(3,ball.getLocation().getColumn());
      Assert.assertEquals(3, ball.getLocation().getRow());
    }

    /**
     * Test of moveBottomLeftBy method, of class Ball.
     */
    public void testMoveBottomLeftBy() {
      ball.setLocation(5, 5);
      ball.moveBottomLeftBy(2);
      Assert.assertEquals(3,ball.getLocation().getColumn());
      Assert.assertEquals(7, ball.getLocation().getRow());
    }

    /**
     * Test of moveBottomRightBy method, of class Ball.
     */
    public void testMoveBottomRightBy() {
      ball.setLocation(5, 5);
      ball.moveBottomRightBy(2);
      Assert.assertEquals(7,ball.getLocation().getColumn());
      Assert.assertEquals(7,ball.getLocation().getRow());
    }

    /**
     * Test of scatterToAdjacentCell method, of class Ball.
     */
    public void testScatterToAdjacentCell() {
     ball.setLocation(1,1);
     ball.scatterToAdjacentCell();
     Assert.assertTrue(ball.getLocation().getColumn()!=1||ball.getLocation().getRow()!=1);
    }

}
