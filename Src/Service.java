 import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Service {

    private static final String FILE_NAME = "library_data.txt";

    private List<Book> books = new ArrayList<>();

    // Constructor
    public Service() {
        loadData();
    }

    // Add Book
    public void addBook(String bookId, String bookTitle) {

        books.add(new Book(bookId, bookTitle));

        saveData();

        System.out.println("Book added successfully!");
    }

    // Display Books
    public void displayBooks() {

        System.out.println("\n===== BOOK LIST =====");

        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book book : books) {
            System.out.println(book);
        }
    }

    // Issue Book
    public void issueBook(String bookId) {

        Book book = findBook(bookId);

        if (book != null && !book.isIssued) {

            book.isIssued = true;
            saveData();

            System.out.println("Book issued successfully!");

        } else {

            System.out.println("Book not found or already issued.");
        }
    }

    // Return Book
    public void returnBook(String bookId) {

        Book book = findBook(bookId);

        if (book != null && book.isIssued) {

            book.isIssued = false;
            saveData();

            System.out.println("Book returned successfully!");

        } else {

            System.out.println("Book not found or not issued.");
        }
    }

    // Delete Book
    public void deleteBook(String bookId) {

        Book book = findBook(bookId);

        if (book != null) {

            books.remove(book);
            saveData();

            System.out.println("Book deleted successfully!");

        } else {

            System.out.println("Book not found.");
        }
    }

    // Display books loaded from file
    public void loadBooksFromFile() {

        loadData();
        displayBooks();
    }

    // Find Book by ID
    private Book findBook(String bookId) {

        for (Book book : books) {

            if (book.id.equals(bookId)) {
                return book;
            }
        }

        return null;
    }

    // Save data into library_data.txt
    private void saveData() {

        try (ObjectOutputStream outputStream =
                new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {

            outputStream.writeObject(books);

        } catch (IOException e) {

            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    // Load data from library_data.txt
    @SuppressWarnings("unchecked")
    private void loadData() {

        File file = new File(FILE_NAME);

        if (!file.exists()) {

            books = new ArrayList<>();
            return;
        }

        try (ObjectInputStream inputStream =
                new ObjectInputStream(new FileInputStream(file))) {
             
            books = (List<Book>) inputStream.readObject();

        } catch (Exception e) {

            books = new ArrayList<>();
            System.out.println("Error loading saved data: " + e.getMessage());
        }
    }
}
