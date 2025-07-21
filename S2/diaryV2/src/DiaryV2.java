
import java.util.ArrayList;
import java.util.List;

public class DiaryV2 {
    private String username;
    private final String password;
    private boolean isLocked;
    private int id;
    private final List<EntryV2> entries = new ArrayList<>();


    DiaryV2(String username, String password) {

        this.username = username;
        this.password = password;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void lockDiary() {
        isLocked = true;
    }

    public void unlockDiary(String password) {
        validatePassword(password);
        isLocked = false;

    }

    public void createEntry(String title, String desc) {
        validateEntry(title, desc);
        if (!isLocked) {
            ++this.id;
            entries.add(new EntryV2(id ,title, desc));
        }

    }

    public void removeEntry(int id) {
        for(EntryV2 e: entries) {
            if(e.getId() == id) {
                entries.remove(e);
                return;
            }
        }
        throw new InvalidIDException();
    }


    public EntryV2 findEntryById(int id) {
        for(EntryV2 e: entries) {
            if(e.getId() == id) {
                return e;
            }
        }
        throw new InvalidIDException();
    }

    public void updateEntry(int id, String title, String desc) {
        for(EntryV2 e: entries) {
            if(e.getId() == id) {
                e.setTitle(title);
                e.setDescription(desc);
                return;
            }
        }
        throw new InvalidIDException();
    }







    public int getNumberOfEntries() {
        return entries.size();
    }

    private void validatePassword(String password) {
        if(!password.equals(this.password)) {
            throw new IncorrectPasswordException();
        }
    }

    private void validateEntry(String title, String desc) {
        if(title.isBlank()|| desc.isBlank()) {
            throw new IllegalArgumentException();
        }
    }

    private void validatePasswordFormat(String password) {
        if (password.isBlank()) {
            throw new IllegalArgumentException();
        }
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
