package org.FilipS;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main( String[] args ) {


        List<Book> books = new ArrayList<>();

        books.add(new Book("J.K.Rowlling","Harry Potter1", 354, LocalDate.of(1998,5,20)));
        books.add(new Book("J.K.Rowlling","Harry Potter2", 454, LocalDate.of(1998,5,20)));
        books.add(new Book("J.K.Rowlling","Harry Potter3", 554, LocalDate.of(1998,5,20)));
        books.add(new Book("J.K.Rowlling","Harry Potter4", 654, LocalDate.of(1998,5,20)));
        books.add(new Book("J.K.Rowlling","Harry Potter5", 754, LocalDate.of(1998,5,20)));
        books.add(new Book("J.K.Rowlling","Harry Potter6", 854, LocalDate.of(1998,5,20)));


        Library library = new Library(books);

        Book book1 = library.borrowBook("Harry Potter1");
        System.out.println(book1.isBorrowed());
        library.returnBook(book1);
        System.out.println(book1.isBorrowed());






    }
}
