package librarycalss;

public class AuthorClass extends PersonCalss {
    private String email, workplace;

    public AuthorClass() {

    }

    public AuthorClass(String identityNum, String name, String gender, String phone, String email, String workplace) {
        super(identityNum, name, gender, phone);
        this.email = email;
        this.workplace = workplace;

    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public String toString() {
        return super.toString() + "\nEmail: " + email + "\nWorkplace: " + workplace;
    }

}
