import model.Books;
import model.Borrowing;
import model.Students;
public class Main {

    public static void main(String[] args) {

        Students p1 = new Students(1,"Ashna",12,9);
        Students p2 = new Students(2,"avi",12,11);
        Students p3 = new Students(3,"ojes",12,13);
        Students p4 = new Students(4,"dp",12,15);

        Books b1 = new Books(1,"yo","he",1234455,2013);
        Books b2 = new Books(2," Kathmandu","Manj",1234456,2015);
        Books b3 = new Books(3,"by"," Guru",1234457,2012);
        Books b4 = new Books(4,"hii"," Tzu",1234458,2005);

        Borrowing bo1 = new Borrowing(1,1,0,50);
        Borrowing bo2 = new Borrowing(2,2,1,50);
        Borrowing bo3 = new Borrowing(3,3,3,50);
        Borrowing bo4 = new Borrowing(4,4,5,50);

        b1.print_books();
        b2.print_books();
        b3.print_books();
        b4.print_books();

        p1.print_students();
        p2.print_students();
        p3.print_students();
        p4.print_students();

        bo1.borrowing();
        bo2.borrowing();
        bo3.borrowing();
        bo4.borrowing();


    }







}