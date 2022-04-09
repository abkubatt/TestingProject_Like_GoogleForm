package kg.megacom.test_app.models;

public class Answer {
    private Long id;
    private String answer;
    private boolean is_true;
    private int question_id;
    private boolean is_active;

    public Answer() {
    }

    public Answer(Long id, String answer, boolean is_true, int question_id, boolean is_active) {
        this.id = id;
        this.answer = answer;
        this.is_true = is_true;
        this.question_id = question_id;
        this.is_active = is_active;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean isIs_true() {
        return is_true;
    }

    public void setIs_true(boolean is_true) {
        this.is_true = is_true;
    }

    public int getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }
}
