package kg.megacom.test_app.models;

public class Subject {
    private Long id;
    private String title;
    private String description;
    private boolean is_active;
    private int language_id;

    public Subject() {
    }

    public Subject(Long id, String title, String description, boolean is_active, int language_id) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.is_active = is_active;
        this.language_id = language_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

    public int getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(int language_id) {
        this.language_id = language_id;
    }
}
