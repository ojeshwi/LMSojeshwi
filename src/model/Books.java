package model;

public class Books {
    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getName_of_book() {
        return name_of_book;
    }

    public void setName_of_book(String name_of_book) {
        this.name_of_book = name_of_book;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getB_year() {
        return B_year;
    }

    public void setB_year(int B_year) {
        this.B_year = B_year;
    }

    public Books(int book_id, String name_of_book, String author, int ISBN, int B_year) {
        this.book_id = book_id;
        this.name_of_book = name_of_book;
        this.author = author;
        this.ISBN = ISBN;
        this.B_year = B_year;
    }

    int book_id;
    String name_of_book;
    String author;
    int ISBN;
    int B_year;

    public void print_books (){
        System.out.println("Books");
        System.out.println("Name: " + this.name_of_book  );
        System.out.println("Author: " + this.author  );
        System.out.println("ISBN: " + this.ISBN  );
        System.out.println("Published year: " + this.B_year  );

    }
}
