import java.util.ArrayList;
import java.util.List;

public class Diaries {
    private List<DiaryV2> diaryV2 = new ArrayList<>();


    public void add(String username, String password) {
        diaryV2.add(new DiaryV2(username, password));
    }

    public DiaryV2 findDiary(String username, String password) {
        for (DiaryV2 diaryV2 : diaryV2) {
            if (username.equals(diaryV2.getUsername())) {
                if (password.equals(diaryV2.getPassword())) {
                    return diaryV2;
                }
                throw new IncorrectPasswordException();
            }
        }
        throw new NoSuchDiaryException();
    }

    public void deleteDiary(String username, String password) {
        diaryV2.removeIf( diary -> username.equals(diary.getUsername()) && password.equals(diary.getPassword()));
    }

    public void createEntry(String username, String password, String title, String description) {
        for(DiaryV2 diary : diaryV2) {
            if(diary.getUsername().equals(username)) {
                if(password.equals(diary.getPassword())) {
                    diary.createEntry(title, description);
                }
            }
        }

    }

    public void updateEntry(String username, String password, int entryId, String title, String description) {
        for (DiaryV2 diaryV2 : diaryV2) {
            if (username.equals(diaryV2.getUsername())) {
                if (password.equals(diaryV2.getPassword())) {
                    diaryV2.updateEntry(entryId, title, description);                }
            }

        }
    }

    public void deleteEntry(String username, String password, int entryId) {
        for (DiaryV2 diaryV2 : diaryV2) {
            if (username.equals(diaryV2.getUsername())) {
                if (password.equals(diaryV2.getPassword())) {
                    diaryV2.removeEntry(entryId);
                }
            }
        }
    }

    public void lockDiary(String username) {
        for(DiaryV2 diaryV2 : diaryV2) {
            if(username.equals(diaryV2.getUsername())) {
                    diaryV2.lockDiary();

            }
        }
    }

    public void unlockDiary(String username, String password) {
        for(DiaryV2 diaryV2 : diaryV2) {
            if(username.equals(diaryV2.getUsername())) {
                if(password.equals(diaryV2.getPassword())) {
                    diaryV2.unlockDiary(password);
                }
            }
        }
    }

    public String printOutEntry(String username, String password, int entryId) {
        for(DiaryV2 diaryV2 : diaryV2) {
            if(username.equals(diaryV2.getUsername())) {
                if(password.equals(diaryV2.getPassword())) {
                    return diaryV2.printEntry(entryId);
                }
            }
        }
        throw new InvalidIDException();
    }
}
