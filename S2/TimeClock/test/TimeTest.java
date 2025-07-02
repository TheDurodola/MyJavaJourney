import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TimeTest {

    @Test
    public void testThatObjectCanBeCreatedWithTheRightInformation() {
        Time rolex = new Time(23,59,59);
    }

    @Test
    public void testThatObjectThrowsExceptions_ifTheHoursSetAreOutOfTheRange() {
        assertThrows(IllegalArgumentException.class, () -> {Time rolex = new Time(25,59,59);});
    }

    @Test
    public void testThatObjectThrowsExceptions_ifTheMinutesSetAreOutOfTheRange() {
        assertThrows(IllegalArgumentException.class, () -> {Time rolex = new Time(23,61,59);});
    }

    @Test
    public void testThatObjectThrowsExceptions_ifTheSecondsSetAreOutOfTheRange() {
        assertThrows(IllegalArgumentException.class, () -> {Time rolex = new Time(23,59,75);});
    }

    @Test
    public void testThatObject_CanBeCreatedWith_ZeroArguments() {
        Time rolex = new Time();
    }

    @Test
    public void testThatObject_CanBeCreatedWith_OneArgument() {
        Time rolex = new Time(1);
    }
    @Test
    public void testThatObject_CanBeCreatedWith_TwoArguments() {
        Time rolex = new Time(23,59);
    }
}
