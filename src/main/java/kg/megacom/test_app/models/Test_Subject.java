package kg.megacom.test_app.models;

public class Test_Subject {
    private Long id;
    private int subject_id;
    private int test_id;
    private int amount;

    public Test_Subject() {
    }

    public Test_Subject(Long id, int subject_id, int test_id, int amount) {
        this.id = id;
        this.subject_id = subject_id;
        this.test_id = test_id;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(int subject_id) {
        this.subject_id = subject_id;
    }

    public int getTest_id() {
        return test_id;
    }

    public void setTest_id(int test_id) {
        this.test_id = test_id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
