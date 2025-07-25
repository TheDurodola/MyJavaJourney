import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EntryV2 {
    private int id;
    private String title;
    private String description;
    private LocalDateTime dateCreated;

    public EntryV2(int id, String title, String desc) {
        this.id = id;
        this.title = title;
        this.description = desc;
        this.dateCreated = LocalDateTime.now();
    }
    public int getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }



    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return "ID: " + id + "\nDate: "+ dateCreated.format(dtf) +"\nTitle: " + title + "\nDescription: " + description;
    }

}
