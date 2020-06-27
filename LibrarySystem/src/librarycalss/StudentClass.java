package librarycalss;

public class StudentClass extends PersonCalss {
    private String id, major;
    private double Budget;

    public StudentClass() {

    }

    public StudentClass(String identityNum, String name, String gender, String phone, String id, String major, double Budget) {
        super(identityNum, name, gender, phone);
        this.id = id;
        this.major = major;
        this.Budget = Budget;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getmajor() {
        return major;
    }

    public void setmajor(String major) {
        this.major = major;
    }

    public double getBudget() {
        return Budget;
    }

    public void setBudget(double Budget) {
        this.Budget = Budget;
    }

    public String tostring() {
        return super.tostring() + "\nid: " + id + "\nmajor" + major + "/nBudget" + Budget;
    }

}
