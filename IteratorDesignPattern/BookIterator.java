import java.util.List;

public class BookIterator extends Iterator{

    private int cursor;
    List<Book> library;

    public BookIterator(List<Book> collection) {
        this.library = collection;
    }

    @Override
    public boolean hasNext() {
        return cursor <= library.size()-1;
    }

    @Override
    public Book next() {
        Book book = library.get(cursor);
        cursor++;
        return book;
    }
}
