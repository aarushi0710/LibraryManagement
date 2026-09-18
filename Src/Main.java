 import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Service service = new Service();      // Service object
        int choice;

        while (true) {

            System.out.println("\n===== SIMPLE LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Delete a Book");
            System.out.println("6. Load data from file directly");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Book ID: ");
                    String bookId = scanner.nextLine();

                    System.out.print("Enter Book Title: ");
                    String bookTitle = scanner.nextLine();

                    service.addBook(bookId, bookTitle);
                    break;

                case 2:
                    service.displayBooks();
                    break;

                case 3:

                    System.out.print("Enter Book ID to Issue: ");
                    String issueBookId = scanner.nextLine();

                    service.issueBook(issueBookId);
                    break;

                case 4:

                    System.out.print("Enter Book ID to Return: ");
                    String returnBookId = scanner.nextLine();

                    service.returnBook(returnBookId);
                    break;

                case 5:

                    System.out.print("Enter Book ID to Delete: ");
                    String deleteBookId = scanner.nextLine();

                    service.deleteBook(deleteBookId);
                    break;

                case 6:

                    System.out.println("Library Books stored in file are:");
                    service.loadBooksFromFile();
                    break;

                case 7:

                    System.out.println("Thank you for using Library Management System.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
