import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Entry {
    private int id;
    private String title;
    private String description;
    private LocalDateTime dateCreated;


    public Entry(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dateCreated = LocalDateTime.now();
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

    public String getDateCreated() {
        return dateCreated.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public int getID() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
