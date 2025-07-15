import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    Diary diary;

    @BeforeEach
    public void setUp(){
        diary = new Diary("boluwatife", "Money$12");
    }



    @Test
    public void isLockedIsFalseWhenDiaryIsFirstInstantiated(){

        assertFalse(diary.isLocked());
    }

    @Test
    public void isLockedIsTrueWhenLockDiaryIsUsed(){
        diary.lockDiary();
        assertTrue(diary.isLocked());
    }

    @Test
    public void isLockedIsFalseAfterUnlockedDiaryWithTheCorrectPasswordIsUsedOnALockedDiary(){
        diary.lockDiary();
        assertTrue(diary.isLocked());
        diary.unlockDiary("Money$12");
        assertFalse(diary.isLocked());

    }

    @Test
    public void isLockedIsTrueAfterUnlockedDiaryWithAnIncorrectPasswordIsUsedOnALockedDiary(){
        diary.lockDiary();
        assertTrue(diary.isLocked());
        assertThrows(IncorrectPasswordException.class, () -> diary.unlockDiary("Dollar"));
    }

    @Test
    public void entryCanBeAddedToDiary(){
        assertThrows(InvalidIDException.class, ()-> diary.findEntryById(1));
        diary.createEntry("Day One", "Get Food");
        assertDoesNotThrow(()-> diary.findEntryById(1));
    }

    @Test
    public void createEntryAndEntryDetailsCanBeRetrieveViaID(){
        diary.createEntry("Day One", "Get Food");
        assertEquals("Day One", diary.findEntryById(1).getTitle());
        assertEquals("Get Food", diary.findEntryById(1).getDescription());
        assertEquals(1, diary.findEntryById(1).getID());
        assertEquals("15/07/2025", diary.findEntryById(1).getDateCreated());

        diary.createEntry("Day Two", "Get Food");
    }

    @Test
    public void entryCanBeDeletedFromDiary(){
        diary.createEntry("Day One", "Get Food");
        assertEquals("Get Food", diary.findEntryById(1).getDescription());
        diary.deleteEntry(1);
        assertThrows(InvalidIDException.class,()-> diary.findEntryById(1));
    }

}
