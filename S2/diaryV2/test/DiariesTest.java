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
        DiaryV2 expected = diaries.findDiary("lord_boj", "MySecretDiary");
        assertNotNull(expected);
        expected = diaries.findDiary("lord_boj", "MySecretDiary");
        assertEquals("lord_boj", expected.getUsername());
    }

    @Test
    public void MultipleDiariesCanBeCreatedAndCanBeRetrieved(){
        diaries.add("lord_boj", "MySecretDiary");
        diaries.add("lookingfor_boj", "Nomad$");
        assertEquals("lookingfor_boj", diaries.findDiary("lookingfor_boj", "Nomad$").getUsername());
        assertEquals("lord_boj", diaries.findDiary("lord_boj", "MySecretDiary").getUsername());
        diaries.add("s","s");
        assertEquals("s", diaries.findDiary("s", "s").getUsername());
    }

    @Test
    public void addTwoDiaries_DeleteOne(){
        diaries.add("lookingfor_boj", "Nomad");
        diaries.add("lord_boj","$");
        diaries.deleteDiary("lord_boj","$");
        assertThrows(NoSuchDiaryException.class, () -> diaries.findDiary("lord_boj", "MySecretDiary"));
        assertNotNull(diaries.findDiary("lookingfor_boj", "Nomad"));
    }

    @Test
    public void createEntryInADiary(){
        diaries.add("lord_boj", "MySecretDiary");
        diaries.createEntry("lord_boj", "MySecretDiary", "Bread on my mind", "ddd" );
        assertEquals("Bread on my mind",diaries.findDiary("lord_boj", "MySecretDiary").findEntryById(1).getTitle());
        diaries.createEntry("lord_boj", "MySecretDiary", "bumBum", "bumbum");
        assertEquals("bumbum", diaries.findDiary("lord_boj", "MySecretDiary").findEntryById(2).getDescription());
    }

    @Test
    public void exceptionIsThrownWhenAttemptingToAccessADiaryThatDoesntExist(){
        assertThrows(NoSuchDiaryException.class, () -> diaries.findDiary("lord_boj", "MySecretDiary"));
    }

    @Test
    public void exceptionIsThrownWhenAttemptingToAccessDiaryWithIncorrectPassword(){
        diaries.add("lord_boj", "MySecretDiary");
        assertThrows(IncorrectPasswordException.class, () -> diaries.findDiary("lord_boj", "$"));
    }

    @Test
    public void updateAnEntry(){
        diaries.add("lord_boj", "MySecretDiary");
        diaries.findDiary("lord_boj", "MySecretDiary").createEntry("Oboi", "Life hard ohh");
        diaries.updateEntry("lord_boj", "MySecretDiary", 1, "My Daily Struggle", "Life has been hard on me");
        assertEquals("My Daily Struggle", diaries.findDiary("lord_boj", "MySecretDiary").findEntryById(1).getTitle());
    }

    @Test
    public void updateMultipleEntry(){
        diaries.add("lord_boj", "MySecretDiary");
        diaries.findDiary("lord_boj", "MySecretDiary").createEntry("Oboi", "Life hard ohh");
        diaries.findDiary("lord_boj", "MySecretDiary").createEntry("It is well", "Them bill me 10k today");
        diaries.updateEntry("lord_boj", "MySecretDiary",1, "My Daily Struggle", "Life has been hard on me");
        diaries.updateEntry("lord_boj", "MySecretDiary", 2, "Unexpected billing", "The bill hurt my budget");
        assertEquals("My Daily Struggle", diaries.findDiary("lord_boj", "MySecretDiary").findEntryById(1).getTitle());
        assertEquals("Unexpected billing", diaries.findDiary("lord_boj", "MySecretDiary").findEntryById(2).getTitle());
    }

    @Test
    public void deleteEntry(){
        diaries.add("lord_boj", "MySecretDiary");
        diaries.createEntry("lord_boj", "MySecretDiary","It is well", "Them bill me 10k today");
        diaries.deleteEntry("lord_boj", "MySecretDiary",1);
        assertThrows(InvalidIDException.class, () -> diaries.findDiary("lord_boj", "MySecretDiary").findEntryById(1));
    }

    @Test
    public void entryCantBeCreatedWhileDiaryIsLocked(){
        diaries.add("lord_boj", "MySecretDiary");
        diaries.lockDiary("lord_boj");
        diaries.createEntry("lord_boj", "MySecretDiary","It is well", "Them bill me 10k today");
        assertThrows(InvalidIDException.class, () -> diaries.findDiary("lord_boj", "MySecretDiary").findEntryById(1));
    }

    @Test
    public void entryCanBeCreatedAfterDiaryIsUnlocked(){
        diaries.add("lord_boj", "MySecretDiary");
        diaries.lockDiary("lord_boj");
        diaries.createEntry("lord_boj", "MySecretDiary","It is well", "Them bill me 10k today");
        assertThrows(InvalidIDException.class, () -> diaries.findDiary("lord_boj", "MySecretDiary").findEntryById(1));
        diaries.unlockDiary("lord_boj", "MySecretDiary");
    }

    @Test
    public void getEntryPrintOut(){
        diaries.add("lord_boj", "MySecretDiary");
        diaries.createEntry("lord_boj", "MySecretDiary", "It is well", "Them bill me 10k today");
        assertEquals("ID: " + 1 +
                            "\nDate: "+ "2025-07-25 06:29"
                            +"\nTitle: " + "It is well" +
                            "\nDescription: " + "Them bill me 10k today",diaries.printOutEntry("lord_boj", "MySecretDiary", 1));
    }








}
