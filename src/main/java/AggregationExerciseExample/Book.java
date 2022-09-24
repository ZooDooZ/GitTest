package AggregationExerciseExample;

public class Book {

    private String title;
    private String author;
    private String publisher;

    public Book(String title, String author, String publisher){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public Book(Book object2){
        title = object2.title;
        author = object2.author;
        publisher = object2.publisher;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    @Override
    public String toString() {
        String str = "Tytuł: " + title +
                "\nAutor: " + author +
                "\nWydawnictwo: " + publisher;
        return str;
    }
}
