import java.util.HashMap;

public class Library {
    // 0 : "Some book name"
    private HashMap<Integer, Book> books;

    public Book addBook(int id, String details) {
        // if the book is already there
        if (books.containsKey(id)) {
            return null;
        }
        // else create book object and add it to the library
        Book book = new Book(id, details);
        // in hashmap put is used to add a new entity
        books.put(id, book);
        return book;
    }

    public boolean removeBook(Book book) {
        return removeBook(book.getId());

    }

    public boolean removeBook(int id) {
        if (!books.containsKey(id)) {
            return false;
        }

        books.remove(id);
        return true;

    }

    public Book findBook(int id) {
        return books.get(id);
    }

}
