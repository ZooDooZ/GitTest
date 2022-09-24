package AggregationExerciseExample;

public class Main {

    public static void main(String[] args) {

        Instruktor instruktor = new Instruktor("Sokołowski", "Filip","C112");

        Book book = new Book("Harry Potter", "J.K.Rowlling", "Media Rodzina");
        Book book1 = new Book("Harry Potter", "J.K.Rowlling", "Meddia Rodzina");

        // Comparison of two objects
        if(book.getTitle().equals(book1.getTitle()) && book.getAuthor().equals(book1.getAuthor())
                && book.getPublisher().equals(book1.getPublisher())){
            System.out.println("Sa takie same!");
        } else {
            System.out.println("Nie sa takie same!");
        }

        Course course = new Course("Znajomość HP", instruktor, book);

        // Calling the Course object
        System.out.println(course);



    }
}
