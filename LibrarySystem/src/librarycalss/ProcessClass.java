package librarycalss;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ProcessClass {s
    public void Report() throws FileNotFoundException{
        try{
            PrintWriter pw = new PrintWriter("report.txt");
            pw.println(allBooks());
            pw.println("----------students bought the book----------");
            pw.close();
            System.out.println("Report generated!");
        }catch (FileNotFoundException e){
            System.out.println("file not found");
        }




    }
    public void menu() throws FileNotFoundException{
        Scanner in = new Scanner(System.in);
        String iSBN, name,bname, aname = null,stdname, category, publisher, editionYear,identityNum,gender,phone,email,id ,major,workplace;
        int numofCopies;
        double Budget,price;
        BookClass book;
        AuthorClass aut;
        StudentClass std;
        int choice = -1;



        do{
            try{
                System.out.println("ــــ+\nWelcame To our o2 Library + \nــــ");
                System.out.println("1. Show Books");
                System.out.println("2. Add a Book");//done
                System.out.println("3. Delete a Book");
                System.out.println("4. Search for a Book");
                System.out.println("5. Buy a Book");
                System.out.println("6. Show student");
                System.out.println("7. Add a student");//done
                System.out.println("8. Full Report");
                System.out.println("9. Exit");//done
                System.out.println("Enter your choice ...");
                choice = in.nextInt();

                switch (choice){
                    case 1 :
                        System.out.println(allBooks());
                        Enter();
                        break;




                    case 2 :
                        System.out.println("Enter the Student iSBN ...");
                        iSBN =in.next();
                        System.out.println("Enter the Student book name ...");
                        bname =in.next();
                        System.out.println("Enter the Student catrgory ...");
                        category =in.next();
                        System.out.println("Enter the Student publisher ...");
                        publisher =in.next();
                        System.out.println("Enter the Student editionYear ...");
                        editionYear =in.next();
                        System.out.println("Enter the Student name ...");
                        name =in.next();
                        System.out.println("Enter student identity ...");
                        identityNum = in.next();
                        System.out.println("Enter student gender ...");
                        gender = in.next();
                        System.out.println("Enter student phone ...");
                        phone = in.next();
                        System.out.println("Enter student email ...");
                        email = in.next();
                        System.out.println("Enter Author workplace ...");
                        workplace = in.next();

                        aut = new AuthorClass(identityNum,aname, gender, phone, email, workplace);
                        book = new BookClass(iSBN, bname , category , publisher, editionYear,name);
                        Enter();
                        break;




                    case 3 :
                        System.out.println("Enter the name of the book you want to delete...");
                        bname=in.next();
                        System.out.println(removebook(bname));
                        Enter();
                        break;

                    case 4 :
                        System.out.println("Enter the name or category");
                        bname=in.next();
                        category=in.next();
                        System.out.println(searhbook(bname, category));
                        Enter();
                        break;

                    case 5 :
                        System.out.println("Enter student name");
                        bname=in.next();
                        System.out.println("Enter student identity");
                        identityNum = in.next();
                        bayBook(bname,identityNum);
                        Enter();
                        break;

                    case 6  :
                        System.out.println(allstudents());
                        Enter();
                        break;



                    case 7 :
                        System.out.println("Enter the Student Info"+"\n**************");
                        System.out.println("Enter the Student name ...");
                        stdname =in.next();
                        System.out.println("Enter student identity ...");
                        identityNum = in.next();
                        System.out.println("Enter student gender ...");
                        gender = in.next();
                        System.out.println("Enter student phone ...");
                        phone = in.next();
                        System.out.println("Enter student id");
                        id = in.next();
                        System.out.println("Enter student major");
                        major=in.next();
                        System.out.println("Enter the Student budget ...");
                        Budget =in.nextDouble();

                        std=new StudentClass(identityNum,stdname,gender,phone,id,major,Budget);
                        Enter();
                        break;

                    case 8 :
                        Report();
                        Enter();
                        break;

                    case 9 :
                        System.out.println("thank u for using our library");
                        System.exit(0);
                        break;

                    default :
                        System.err.println("invaild choice!");
                }
            }
            catch (InputMismatchException e){
                System.err.println("invalid choice , choice must be number value please ...");
                in.next();
            }
        }
        while (choice != 10);


    }





    public BookClass allBooks() {
        BookClass book = new BookClass();
        return book;
    }

    private void bayBook(String bname, String identityNum) {
        throw new UnsupportedOperationException("Not supported yet.");
    }




    public StudentClass allstudents() {
        StudentClass std = new StudentClass();
        System.out.println(std.tostring());
        return std;

    }



    private boolean removebook(String bname) {
        throw new UnsupportedOperationException("Not supported yet.");

    }


    public BookClass  searhbook(String bname, String category) {
        if(bname .equalsIgnoreCase(bname)|| category .equalsIgnoreCase(category)){
            BookClass book = new BookClass();
            System.out.println(book.search(bname, category));
            return book;
        }else{
            System.out.println("not found book ");
        }
        return null;



    }

    public static void Enter(){
        Scanner input = new Scanner(System.in);
        System.out.print("Press Enter to continue . . . ");
        input.nextLine();
    }

}    

