import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class DiariesTest {
    private Diaries diaries;


    @BeforeEach
    public void beforeEach() {
        diaries = new Diaries();
    }



    @Test
    public void aDiaryCanBeCreated() {
        diaries.add("lord_boj", "MySecretDiary");
        DiaryV2 expected = diaries.findDiary("lord_boj");
        assertNotNull(expected);
        expected = diaries.findDiary("lord_boj");
        assertEquals("lord_boj", expected.getUsername());
    }


    @Test
    public void MultipleDiariesCanBeCreatedAndCanBeRetrieved(){
        diaries.add("lord_boj", "MySecretDiary");
        diaries.add("lookingfor_boj", "Nomad$");
        assertEquals("lookingfor_boj", diaries.findDiary("lookingfor_boj").getUsername());
        assertEquals("lord_boj", diaries.findDiary("lord_boj").getUsername());
        diaries.add("s","s");
        assertEquals("s", diaries.findDiary("s").getUsername());
    }

    public void addTwoDiaries_DeleteOne(){
        diaries.add("lookingfor_boj", "Nomad");
        diaries.add("lord_boj","$");
        diaries.delete("lord_boj","$");
        assertNull(diaries.findDiary("lord_boj"));
        assertNotNull(diaries.findDiary("lookingfor_boj"));
    }


}
