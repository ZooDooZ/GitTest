package AggregationExerciseExample;

public class Course {

    private String courseName;
    private Instruktor instruktor;
    private Book book;

    public Course(String courseName, Instruktor instruktor, Book book){
        this.courseName = courseName;
        this.instruktor = new Instruktor(instruktor);
        this.book = new Book(book);
    }

    public String getCourseName() {
        return courseName;
    }

    public Instruktor getInstruktor() {
        return new Instruktor(instruktor);
    }

    public Book getBook() {
        return new Book(book);
    }

    @Override
    public String toString() {
        String str = "Nazwa kursu: " + courseName +
                "\nInformacje o wykładowcy:\n" +
                instruktor +
                "\nInformacje o podręczniku:\n" +
                book;
        return str;
    }
}
