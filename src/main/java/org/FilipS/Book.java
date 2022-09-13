package org.FilipS;


import java.time.LocalDate;


public class Book {

    private String author;
    private String title;
    private int numberOfPage;
    private LocalDate releaseDate;
    private boolean isBorrowed;

    public Book(String author, String title, int numberOfPage, LocalDate releaseDate) {
        this.author = author;
        this.title = title;
        this.numberOfPage = numberOfPage;
        this.releaseDate = releaseDate;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrow(){
        isBorrowed = true;
    }

    public void returnBook(){
        isBorrowed = false;
    }





}
