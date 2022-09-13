package org.FilipS;


import java.util.List;

public class Library {

    private List<Book> books;

    public Library(List<Book> books){
        this.books = books;
    }

    public Book borrowBook(String title){
        for(Book book : books){
            if(title.equalsIgnoreCase(book.getTitle())){
                book.borrow();
                return book;
            }
        }
        return null;
    }

    public void returnBook(Book book){
        book.returnBook();
    }

}
