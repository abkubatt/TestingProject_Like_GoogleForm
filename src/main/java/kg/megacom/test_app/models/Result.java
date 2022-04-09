package kg.megacom.test_app.models;

import java.util.Date;

public class Result {
    private Long id;
    private int test_id;
    private String user;
    private double result;
    private Date date;

    public Result() {
    }

    public Result(Long id, int test_id, String user, double result, Date date) {
        this.id = id;
        this.test_id = test_id;
        this.user = user;
        this.result = result;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getTest_id() {
        return test_id;
    }

    public void setTest_id(int test_id) {
        this.test_id = test_id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
