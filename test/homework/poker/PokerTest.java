package homework.poker;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by thatchai on 12/22/15.
 */
public class PokerTest {
    private Poker poker;


    //    private String[] suitOfCard = new String[]{"SPADES", "HEARTS", "CLUBS", "DIAMONDS"};
//    private String[] suitsOfCard = new String[]{"S", "H", "C", "D"};

    @Test
    public void when1pair_ThenReturn_Onepair() {
        poke("One pair", new String[]{"9H","9D","10C","JC","KC"});
    }

    @Test
     public void when2pair_ThenReturn_Twopair() {
        poke("Two pair", new String[]{"9H","9D","10C","10D","KC"});
    }

    @Test
    public void when3_ThenReturn_ThreeOfAKind() {
        poke("Three of a kind", new String[]{"9H","10S","10C","10D","KC"});
    }

    @Test
    public void when4_ThenReturn_FourOfAKind() {
        poke("Four of a kind", new String[]{"10H","10S","10C","10D","KC"});
    }

    @Test
    public void when3and1pair_ThenReturn_FullHouse() {
        poke("Full House", new String[]{"10H","KD","10S","10C","KC"});
    }

    @Test
    public void whenFlush_ThenReturn_Flush() {
        poke(" Flush", new String[]{"AH","JH","QH","KH","9H"});
    }

    @Test
    public void whenStraight_ThenReturn_Straight() {
        poke("Straight ", new String[]{"10H","JH","QH","KS","9H"});
    }

    @Test
    public void whenStraightFluash_ThenReturn_StraightFlush() {
        poke("Straight Flush", new String[]{"10H","JH","QH","KH","9H"});
    }

    @Test
    public void whenRoyalStraightFluash_ThenReturn_RoyalStraightFlush() {
        poke("Royal Straight Flush", new String[]{"AH","JH","QH","KH","10H"});
    }

    @Test
    public void whenHighCardAS_ThenReturn_HighCardAS() {
        poke("High Card AS", new String[]{"AS","9H","10H","JH","QH"});
    }

    private void poke(String roman, String[] arr){
        poker = new Poker();
        Assert.assertEquals(roman, poker.poke(arr));
    }
}
