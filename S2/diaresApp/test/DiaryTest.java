import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
    public void isLockedIsFalseAfterUnlockedDiaryIsUsedOnALockedDiary(){
        diary.lockDiary();
        assertTrue(diary.isLocked());
        diary.unlockDiary();
        assertFalse(diary.isLocked());

    }

}
