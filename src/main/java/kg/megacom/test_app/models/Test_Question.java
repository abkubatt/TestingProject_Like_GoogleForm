package kg.megacom.test_app.models;

public class Test_Question {
    private Long id;
    private int question_id;
    private int test_id;

    public Test_Question() {
    }

    public Test_Question(Long id, int question_id, int test_id) {
        this.id = id;
        this.question_id = question_id;
        this.test_id = test_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    public int getTest_id() {
        return test_id;
    }

    public void setTest_id(int test_id) {
        this.test_id = test_id;
    }
}
