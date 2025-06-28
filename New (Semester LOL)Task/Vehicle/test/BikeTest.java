import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    @Test
    public void testThatBikeIsOffInitially() {
        Bike yamaha = new Bike();
        assertFalse(yamaha.isOn());
    }

    @Test
    public void testThatBikeTurnsOn(){
        Bike yamaha = new Bike();
        assertFalse(yamaha.isOn());
        yamaha.useSwitch();
        assertTrue(yamaha.isOn());
    }

    @Test
    public void testThatBikeTurnsOff() {
        Bike yamaha = new Bike();
        assertFalse(yamaha.isOn());
        yamaha.useSwitch();
        assertTrue(yamaha.isOn());
        yamaha.useSwitch();
        assertFalse(yamaha.isOn());
    }

    @Test
    public void testThatBikeCanAccelerate(){
        Bike yamaha = new Bike();
        yamaha.useSwitch();
        assertTrue(yamaha.isOn());
        yamaha.accelerate();
        assertEquals(1, yamaha.getSpeed());
    }

    @Test
    public void testThatIfBikeOff_CannotAccelerate(){
        Bike yamaha = new Bike();
        assertFalse(yamaha.isOn());
        yamaha.accelerate();
        assertEquals(0, yamaha.getSpeed());
    }

    @Test
    public void testThatBike_ifIAccelerateTwice_Speed_Would_have_increased_by_2(){
        Bike yamaha = new Bike();
        yamaha.useSwitch();
        assertTrue(yamaha.isOn());
        yamaha.accelerate();
        assertEquals(1, yamaha.getSpeed());
        yamaha.accelerate();
        assertEquals(2, yamaha.getSpeed());

    }

    @Test
    public void test_ThatBikeAccelerateBy2_InGearTwo(){
            Bike yamaha = new Bike();
            yamaha.useSwitch();
            for(int index = 0; index < 21; index++){
                yamaha.accelerate();
            }
            assertEquals(21, yamaha.getSpeed());
            yamaha.accelerate();
            assertEquals(23, yamaha.getSpeed());
    }

    @Test
    public void test_ThatBikeAccelerateBy3_InGearThree(){
        Bike yamaha = new Bike();
        yamaha.useSwitch();
        for(int index = 0; index < 26; index++){
            yamaha.accelerate();
        }
        assertEquals(31, yamaha.getSpeed());
        yamaha.accelerate();
        assertEquals(34, yamaha.getSpeed());
    }

    @Test
    public void test_ThatBikeAccelerateBy4_InGearFour(){
        Bike yamaha = new Bike();
        yamaha.useSwitch();
        for(int index = 0; index < 30; index++){
            yamaha.accelerate();
        }
        assertEquals(43, yamaha.getSpeed());
        yamaha.accelerate();
        assertEquals(47, yamaha.getSpeed());
    }

    @Test
    public void test_ThatBikeDecelerateBy1_InGearOne(){
        Bike yamaha = new Bike();
        yamaha.useSwitch();
        for(int index = 0; index < 3; index++){yamaha.accelerate();}
        assertEquals(3, yamaha.getSpeed());
        yamaha.decelerate();
        assertEquals(2, yamaha.getSpeed());
    }
    @Test
    public void test_ThatBikeCannotDecelerateIntoNegativeFigures(){
        Bike yamaha = new Bike();
        yamaha.useSwitch();
        yamaha.decelerate();
        assertEquals(0, yamaha.getSpeed());
    }

    @Test
    public void test_ThatBikeDecelerateBy2_InGearTwo(){
        Bike yamaha = new Bike();
        yamaha.useSwitch();
        for(int index = 0; index < 23; index++){yamaha.accelerate();}
        assertEquals(25, yamaha.getSpeed());
        yamaha.decelerate();
        assertEquals(23, yamaha.getSpeed());
    }
    
    @Test
    public void test_ThatBikeDecelerateBy3_InGearThree(){
        Bike yamaha = new Bike();
        yamaha.useSwitch();
        for(int index = 0; index < 27; index++){yamaha.accelerate();}
        assertEquals(34, yamaha.getSpeed());
        yamaha.decelerate();
        assertEquals(31, yamaha.getSpeed());
    }

    @Test
    public void test_ThatBikeDecelerateBy4_InGearFour(){
        Bike yamaha = new Bike();
        yamaha.useSwitch();
        for(int index = 0; index < 31; index++){yamaha.accelerate();}
        assertEquals(47, yamaha.getSpeed());
        yamaha.decelerate();
        assertEquals(43, yamaha.getSpeed());
    }


}

