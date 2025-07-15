public class Diary {
    private String username;
    private String password;
    private boolean isLocked;

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

    public void unlockDiary() {
        isLocked = false;
    }
}
