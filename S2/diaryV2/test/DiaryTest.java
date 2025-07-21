import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    private DiaryV2 dairy;

    @BeforeEach
    public void setUp() {
        dairy = new DiaryV2("lord_boj", "RuleDaWrld");
    }


    @Test
    public void isLockedIsFalseAtInitialState() {
        assertFalse(dairy.isLocked());
    }

    @Test
    public void isLockedIsTrueAfterDiaryHasBeenLocked() {
        dairy.lockDiary();
        assertTrue(dairy.isLocked());

    }

    @Test
    public void isLockedIsFalseAfterDiaryHasBeenUnlocked() {
        dairy.lockDiary();
        assertTrue(dairy.isLocked());
        dairy.unlockDiary("RuleDaWrld");
        assertFalse(dairy.isLocked());
    }

    @Test
    public void incorrectPasswordExceptionIsThrownWhenIncorrectPasswordIsUsedToUnlockDiary() {
        dairy.lockDiary();
        assertThrows(IncorrectPasswordException.class, () -> dairy.unlockDiary("X"));
    }

    @Test
    public void addEntryToDiary() {
        dairy.createEntry("Day One", "Money Needs To Be Made");
       assertEquals(1, dairy.getNumberOfEntries());
       dairy.createEntry("Day Two", "Money has been Made");
       assertEquals(2, dairy.getNumberOfEntries());

    }

    @Test
    public void entryCanBeRemovedFromDiary() {
        dairy.createEntry("Day One", "Money Needs To Be Made");
        assertEquals(1, dairy.getNumberOfEntries());
        dairy.removeEntry(1);
        assertEquals(0, dairy.getNumberOfEntries());

        dairy.createEntry("Day Two", "Money has been Made");
        dairy.createEntry("Day Three","Money will be made");
        dairy.removeEntry(2);
        assertEquals(1, dairy.getNumberOfEntries());
    }

    @Test
    public void entryCantBeAddedWhileIsLockedIsTrue() {
        dairy.lockDiary();
        assertTrue(dairy.isLocked());
        dairy.createEntry("Day One", "Money Needs To Be Made");
        assertEquals(0, dairy.getNumberOfEntries());
        dairy.unlockDiary("RuleDaWrld");
        dairy.createEntry("Day Two", "Money has been Made");
        assertEquals(1, dairy.getNumberOfEntries());
    }

    @Test
    public void invalidIdNumberExceptionIsThrownWhenTryingToDeleteNonexistentEntry() {
        dairy.createEntry("Day One", "Money Needs To Be Made");
        assertEquals(1, dairy.getNumberOfEntries());
        dairy.removeEntry(1);
        assertEquals(0, dairy.getNumberOfEntries());
        assertThrows(InvalidIDException.class, ()-> dairy.removeEntry(1));
    }

    @Test
    public void findEntryByIdRetrievedEnteredEntry() {
        dairy.createEntry("Day One", "Money Needs To Be Made");
        dairy.createEntry("Day Two", "Money has been Made");
        assertNotNull(dairy.findEntryById(1));
        assertThrows(InvalidIDException.class, ()-> dairy.findEntryById(3));

    }


    @Test
    public void updateEntryChangeTitleAndDescription() {
        dairy.createEntry("Day One", "Money Needs To Be Made");
        dairy.updateEntry(1, "Day Four", "Broke Again");
        assertEquals("Day Four", dairy.findEntryById(1).getTitle());
    }

    @Test
    public void whitespaceOnlyTitleAndDescriptionAreRejected() {
        assertThrows(IllegalArgumentException.class, ()-> dairy.createEntry(" ", " "));
    }





}
