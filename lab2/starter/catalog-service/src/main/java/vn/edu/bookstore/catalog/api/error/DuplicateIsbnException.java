package vn.edu.bookstore.catalog.api.error;

public class DuplicateIsbnException extends RuntimeException {
    public DuplicateIsbnException(String isbn) {
        super("Sách với ISBN " + isbn + " đã tồn tại");
    }
}
