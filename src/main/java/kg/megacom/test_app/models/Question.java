package kg.megacom.test_app.models;

import java.io.File;

public class Question {
    private Long id;
    private String question;
    private int subject_id;
    private boolean is_active;
    private File file;
    private int score;

    public Question() {
    }

    public Question(Long id, String question, int subject_id, boolean is_active, File file, int score) {
        this.id = id;
        this.question = question;
        this.subject_id = subject_id;
        this.is_active = is_active;
        this.file = file;
        this.score = score;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(int subject_id) {
        this.subject_id = subject_id;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
