import java.util.ArrayList;
import java.util.List;

public class Diary {
    private String username;
    private String password;
    private boolean isLocked;
    private int idCounter;
    private List<Entry> entries = new ArrayList<>();


    public Diary(String username, String password) {
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

    private void validatePassword(String password) {
        if (!this.password.equals(password)) {
            throw new IncorrectPasswordException();
        }
    }

    public void createEntry(String title, String description) {
        idCounter++;
        Entry newEntry = new Entry(idCounter, title, description);
        entries.add(newEntry);
    }

    public Entry findEntryById(int id) {

        for (Entry entry : entries) {
            if (id == entry.getID())
                return entry;
        }
        throw new InvalidIDException();
    }

    public void deleteEntry(int ID) {
        entries.removeIf(entry -> entry.getID() == ID);
    }
}
