package librarycalss;

public class PersonCalss {
    private String identityNum, name, gender, phone;

    public PersonCalss() {

    }

    public PersonCalss(String identityNum, String name, String gender, String phone) {
        this.identityNum = identityNum;
        this.gender = gender;
        this.name = name;
        this.phone = phone;
    }

    public String tostring() {
        return "\nIdentity number: " + getidentityNum() + "\nname: " + getname() + "/ngender" + gatgender() + "/nphone" + gatphone();
    }

    public String getidentityNum() {
        return identityNum;
    }

    public void setidentityNum(String identityNum) {
        this.identityNum = identityNum;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String gatgender() {
        return gender;
    }

    public void setgender(String gender) {
        this.gender = gender;
    }

    public String gatphone() {
        return phone;
    }

    public void setphone(String phone) {
        this.phone = phone;
    }


}
