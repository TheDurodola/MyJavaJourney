import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {

    @Test
    public void testAirConditionerCanBeTurnedOn(){
        AirConditioner hisense = new AirConditioner();
        assertFalse(hisense.getPowerStatus());
        hisense.turnOn();
        assertTrue(hisense.getPowerStatus());
    }

    @Test
    public void testAirConditionerCanBeTurnedOff(){
        AirConditioner hisense = new AirConditioner();
        hisense.turnOn();
        assertTrue(hisense.getPowerStatus());
        hisense.turnOff();
        assertFalse(hisense.getPowerStatus());
    }

    @Test
    public void testAirConditionerThatIncreaseTemperatureWorks(){
        AirConditioner hisense = new AirConditioner();
        assertFalse(hisense.getPowerStatus());
        hisense.turnOn();
        assertTrue(hisense.getPowerStatus());
        assertEquals(16, hisense.getTemp());
        hisense.increaseTemp();
        assertEquals(17, hisense.getTemp());
    }

    @Test
    public void testAirConditionerThatIncreaseTemperatureWorksIfTheUserIncreaseTheTempByTwoClicks(){
        AirConditioner hisense = new AirConditioner();
        assertFalse(hisense.getPowerStatus());
        hisense.turnOn();
        assertTrue(hisense.getPowerStatus());
        assertEquals(16, hisense.getTemp());
        hisense.increaseTemp();
        assertEquals(17, hisense.getTemp());
        hisense.increaseTemp();
        assertEquals(18, hisense.getTemp());
    }

    @Test
    public void testTemperatureCanBeDecreased(){
        AirConditioner hisense = new AirConditioner();
        hisense.turnOn();
        assertTrue(hisense.getPowerStatus());
        hisense.increaseTemp();
        hisense.increaseTemp();
        assertEquals(18, hisense.getTemp());
        hisense.decreaseTemp();
        assertEquals(17, hisense.getTemp());
    }

    @Test
    public void testTemperatureCanBeDecreasedByTwoClicks(){
        AirConditioner hisense = new AirConditioner();
        hisense.turnOn();
        assertTrue(hisense.getPowerStatus());
        hisense.increaseTemp();
        hisense.increaseTemp();
        assertEquals(18, hisense.getTemp());
        hisense.decreaseTemp();
        assertEquals(17, hisense.getTemp());
        hisense.decreaseTemp();
        assertEquals(16, hisense.getTemp());
    }

    @Test
    public void testThatTemperatureCannotBeIncreasedPast30Degrees(){
        AirConditioner hisense = new AirConditioner();
        hisense.turnOn();
        assertTrue(hisense.getPowerStatus());
        for (int i = 0; i < 14; i++) {
            hisense.increaseTemp();
        }
        assertEquals(30, hisense.getTemp());
        hisense.increaseTemp();
        assertEquals(30, hisense.getTemp());
    }

    @Test
    public void testThatTemperatureCannotBeDecreasedBelow16Degrees(){
        AirConditioner hisense = new AirConditioner();
        hisense.turnOn();
        assertEquals(16, hisense.getTemp());
        hisense.decreaseTemp();
        assertEquals(16, hisense.getTemp());
    }


    @Test
    public void testThatTemperatureCannotBeIncreasedOrDecreasedWhenACIsTurnedOff(){
        AirConditioner hisense = new AirConditioner();
        assertFalse(hisense.getPowerStatus());
        hisense.decreaseTemp();
        assertEquals(0, hisense.getTemp());
        hisense.increaseTemp();
        assertEquals(0, hisense.getTemp());

    }



}
