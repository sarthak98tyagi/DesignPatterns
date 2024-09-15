import java.util.ArrayList;
import java.util.List;

public class IteratorClient {
    public static void main(String[] args) {
        Book book1 = new Book("Abcs",46);
        Book book2 = new Book("ASsd",76);
        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        Library library = new Library(bookList);
        Iterator<Book> iterator = library.getIterator();
        while(iterator.hasNext()){
            Book book = iterator.next();
            System.out.println(book.getName());
        }
    }
}
