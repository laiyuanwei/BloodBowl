/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bloodbowl.model.players;

/**
 *
 * @author Rishinder
 */
public class OrcThrower extends Player
{
    public OrcThrower()
    {
        ma=5;
        st=3;
        ag=3;
        av=8;
        skillsList.add(Skills.SUREHANDS);
        skillsList.add(Skills.PASS);
        type=PlayerType.THROWER;
    }
}
