package librarycalss;

public class BookClass {
    private String iSBN, name, category, publisher, editionYear, bname;
    private AuthorClass auther;
    private int numofCopies;
    private double price;
    private StudentClass[] students;

    public BookClass() {

    }

    public BookClass(AuthorClass auther, int numofCopies, double price) {
        this.auther = auther;
        this.numofCopies = numofCopies;
        this.price = price;
        students = new StudentClass[numofCopies];
    }

    public BookClass(String iSBN, String bname, String category, String publisher, String editionYear, String name) {
        this.iSBN = iSBN;
        this.bname = bname;
        this.category = category;
        this.publisher = publisher;
        this.editionYear = editionYear;
        this.name = name;
    }

    public String search(String n, String cat) {
        if (getName().equalsIgnoreCase(n) || getcategory().equalsIgnoreCase(cat)) {
            String stdInfo = "======\n";
            if (numofCopies == students.length) {
                stdInfo = "\nther is no student who purchased this book\n";


            } else {

                for (int i = 0; i < (students.length - numofCopies); i++) {
                    stdInfo += students[i];
                }
            }
            return "\nBook name: " + getName() + "\niSBN: " + getiSBN() + "\ncategory: " + getcategory() + "\npublisher: " + getpublisher() +
                    "\neditionYear" + geteditionYear() + "\nauther" + getauther() + "\nnumofCopies" + getnumofCopies() + "\nprice" + getprice() + stdInfo;
        }

        return "book not found";
    }

    public String tostring() {
        String stdInfo = "========================/n";
        if (numofCopies == students.length) {
            stdInfo = "\nther is no student who purchased this book\n";
        } else {
            stdInfo += "............students bought the book............";
            for (int i = 0; i < (students.length - numofCopies); i++) {
                stdInfo += students[i];
            }
        }
        return "\nBook name: " + getName() + "\niSBN: " + getiSBN() + "\ncategory: " + getcategory() + "\npublisher: " + getpublisher() +
                "\neditionYear" + geteditionYear() + "\nauther" + getauther() + "\nnumofCopies" + getnumofCopies() + "\nprice" + getprice() + stdInfo;

    }

    public void addstudent(StudentClass std) {
        if (std.getBudget() >= getprice()) {
            if (getnumofCopies() > 0) {
                getstudents()[students.length - getnumofCopies()] = std;
                std.setBudget(std.getBudget() - getprice());
                setnumofCopies(getnumofCopies() - 1);
            } else {
                System.out.println("No available copies");
            }
        } else {
            System.out.println("there is not enough budget");
        }
    }

    public String getiSBN() {
        return iSBN;
    }

    public void setiSBN(String iSBN) {
        this.iSBN = iSBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getcategory() {
        return category;
    }

    public void setcategory(String category) {
        this.category = category;
    }

    public String getpublisher() {
        return publisher;
    }

    public void setpublisher(String publisher) {
        this.publisher = publisher;
    }

    public String geteditionYear() {
        return editionYear;
    }

    public void seteditionYear(String editionYear) {
        this.editionYear = editionYear;
    }

    public AuthorClass getauther() {
        return auther;
    }

    public void setauther(AuthorClass auther) {
        this.auther = auther;
    }

    public int getnumofCopies() {
        return numofCopies;
    }

    public void setnumofCopies(int numofCopies) {
        this.numofCopies = numofCopies;
    }

    public double getprice() {
        return price;
    }

    public void setprice(double price) {
        this.price = price;
    }

    public StudentClass[] getstudents() {
        return students;
    }

    public void setStudents(StudentClass[] students) {
        this.students = students;
    }


}
