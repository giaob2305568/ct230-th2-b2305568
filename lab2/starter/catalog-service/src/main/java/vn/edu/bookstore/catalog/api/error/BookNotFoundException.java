package vn.edu.bookstore.catalog.api.error;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(String isbn) {
        super("Không tìm thấy sách với ISBN: " + isbn);
    }
}
