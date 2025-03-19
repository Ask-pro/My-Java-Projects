abstract class Library {
    public int bookId;
    private String title;
    private String author;
    private int availableCopies;

    // Setters and getters
    public void setTitle(String title) { this.title = title; }
    public String getTitle() { return title; }
    public void setAuthor(String author) { this.author = author; }
    public String getAuthor() { return author; }
    public void setAvailableCopies(int availableCopies) { this.availableCopies = availableCopies; }
    public int getAvailableCopies() { return availableCopies; }

    // Display system message
    void displayMessage() { System.out.println("--- Library Management System ---"); }

    // Abstract methods to be implemented in subclasses
    abstract void add();
    abstract void displayInfo();

    // Borrow book method with exception handling
    protected void borrow() throws IllegalArgumentException {
        System.out.print("\nBorrowing a book - " + getTitle() + ", Author: " + getAuthor());
        System.out.print(", Copies available: " + getAvailableCopies() + "\n");
    }

    // Return book method
    protected void returnBook() {
        System.out.print("\nReturned a book: " + getTitle() + ", Author: " + getAuthor());
        System.out.print(", Copies available: " + getAvailableCopies() + "\n");
    }

    // Book class extends Library class
    static class Book extends Library {

        public Book(int bookId, String title, String author, int availableCopies) {
            super.setTitle(title);
            super.setAuthor(author);
            super.setAvailableCopies(availableCopies);
            super.bookId = bookId;
        }

        // Add a new book (increase copies)
        public void add() {
            setAvailableCopies(getAvailableCopies() + 1);
            System.out.print("\nAdding a new book: ");
            System.out.print("\nBook Id: " + bookId + ", Title: " + getTitle() + ", Author: " + getAuthor());
            System.out.print(", Copies available: " + getAvailableCopies() + "\n");
        }

        // Borrow method with exception handling for unavailable books
        protected void borrow() throws IllegalArgumentException {
            if (getAvailableCopies() <= 0) {
                throw new IllegalArgumentException("\nBook not available!");  // Throw exception if no copies
            }
            setAvailableCopies(getAvailableCopies() - 1);  // Decrease available copies
            super.borrow();  // Call parent method
        }

        // Return method to increase available copies
        protected void returnBook() {
            setAvailableCopies(getAvailableCopies() + 1);  // Increase available copies
            super.returnBook();  // Call parent method
        }

        // Display book info
        void displayInfo() {
            System.out.print("Book Id: " + bookId + ", Title: " + getTitle() + ", Author: " + getAuthor());
            System.out.print(", Copies available: " + getAvailableCopies() + "\n");
        }
    }

    // Ebook class extends Library class
    static class Ebook extends Library {
        String file_size;

        public Ebook(int bookId, String title, String author, String file_size) {
            super.setTitle(title);
            super.setAuthor(author);
            super.bookId = bookId;
            this.file_size = file_size;
        }

        // Add a new ebook
        public void add() {
            System.out.print("\nAdding a new book: ");
            System.out.print("\nBook Id: " + bookId + ", Title: " + getTitle() + ", Author: " + getAuthor() + ", File size: " + file_size + "\n");
        }

        // Display ebook info
        public void displayInfo() {
            System.out.print("Book Id: " + bookId + ", Title: " + getTitle() + ", Author: " + getAuthor() + ", File size: " + file_size + "\n");
        }
    }
}

class Library_main {
    public static void main(String[] args) {
        Library[] library = new Library[5];  // Array to hold library items

        // Initialize books and ebooks
        library[0] = new Library.Book(101, "The Great Gatsby", "F. Scott Fitzgerald", -1);
        library[1] = new Library.Book(102, "Harry Potter", "J.K.Rowling", 19);
        library[2] = new Library.Book(113, "1984", "George Orwell", 15);
        library[3] = new Library.Ebook(124, "The Book Thief", "Markus Zusak", "8 MB");
        library[4] = new Library.Ebook(213, "The Night Circus", "Erin Morgenstern", "2 MB");

        library[0].displayMessage();  // Display system message

        // Add books to library
        for (Library lib : library) {
            lib.add();  // Add each book or ebook
        }

        // Borrow a book (handling exception for unavailable book)
        for (Library lib : library) {
            if (lib.bookId == 101) {
                try {
                    lib.borrow();  // Try borrowing the book
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());  // Catch and display error message
                }
            }
        }

        // Return a book
        for (Library lib : library) {
            if (lib.bookId == 113) {
                lib.returnBook();  // Return a specific book
            }
        }

        // Display info for all books
        System.out.println("\nAll the available books in library");
        for (Library lib : library) {
            lib.displayInfo();  // Display information for each book or ebook
        }
    }
}
