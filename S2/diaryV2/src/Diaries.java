import java.util.ArrayList;
import java.util.List;

public class Diaries {
    private List<DiaryV2> diaryV2 = new ArrayList<>();


    public void add(String username, String password) {
        diaryV2.add(new DiaryV2(username, password));
    }

    public DiaryV2 findDiary(String username) {
        for (DiaryV2 diaryV2 : diaryV2) {
            if (username.equals(diaryV2.getUsername())) {
                return diaryV2;
            }
        }
        return null;
    }

    public void delete(String username, String password) {
        for (DiaryV2 diary : diaryV2) {
            if (username.equals(diary.getUsername())) {
                if (password.equals(diary.getPassword())){
                    diaryV2.remove(diary);
                }
            }
        }
    }
}
