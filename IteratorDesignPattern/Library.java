import java.util.List;

public class Library implements Aggregate{

    List<Book> library;

    public Library(List<Book> library) {
        this.library = library;
    }

    @Override
    public Iterator getIterator() {
        return new BookIterator(library);
    }

    public List<Book> getLibrary() {
        return library;
    }

    public void setLibrary(List<Book> library) {
        this.library = library;
    }
}
