abstract class Library{
    public int bookId;
    private String title;
    private String author;
    private int availableCopies;


    public void setTitle(String title){
    this.title = title;
    }
    public String getTitle(){
    return title;
    }

    public void setAuthor(String author){
        this.author = author;
    }
    public String getAuthor(){
        return author;
    }

    public void setAvailableCopies(int availableCopies){
        this.availableCopies = availableCopies;
    }
    public int getAvailableCopies(){
        return availableCopies;
    }

    void displayMessage(){
        System.out.println("--- Library Management System ---");
    }

    abstract void add();

    abstract void displayInfo();

    protected void borrow(){
        System.out.print("\nBorrowing a book - " + getTitle() + ", Author: " + getAuthor());
        System.out.print(", Copies available: " +getAvailableCopies()+"\n");
    }
    protected void returnBook(){
        System.out.print("\nReturned a book: " + getTitle() + ", Author: " + getAuthor());
        System.out.print(", Copies available: " +getAvailableCopies()+"\n");
    }

    static class Book extends Library {

        public Book(int bookId, String title, String author, int availableCopies) {
            super.setTitle(title);
            super.setAuthor(author);
            super.setAvailableCopies(availableCopies);
            super.bookId = bookId;
        }

        public void add() {
            setAvailableCopies(getAvailableCopies()+1);
            System.out.print("\nAdding a new book:" );
            System.out.print("\nBook Id: " + bookId + ", Title: " + getTitle() + ", Author: " + getAuthor());
            System.out.print(", Copies available: " +getAvailableCopies()+"\n");
        }

        protected void borrow(){
            if(getAvailableCopies()>0) {
                setAvailableCopies(getAvailableCopies() - 1);
                super.borrow();
            } else {
              System.out.println("\n"+getTitle()+" book is not available!");
            }
        }

        protected void returnBook(){
            setAvailableCopies(getAvailableCopies()+1);
            super.returnBook();
        }

        void displayInfo(){
            System.out.print("Book Id: " +bookId + ", Title: " + getTitle() + ", Author: " +getAuthor());
            System.out.print(", Copies available: "+getAvailableCopies()+"\n");
        }
    }

    static class Ebook extends Library {

        String file_size;

        public Ebook(int bookId, String title, String author, String file_size) {
            super.setTitle(title);
            super.setAuthor(author);
            super.bookId = bookId;
            this.file_size = file_size;
        }

        public void add() {
            System.out.print("\nAdding a new book:");
            System.out.print("\nBook Id: " + bookId + ", Title: " + getTitle() + ", Author: " + getAuthor() + ", File size: " +file_size+"\n");
        }

        public void displayInfo(){
            System.out.print("Book Id: " + bookId + ", Title: " + getTitle() + ", Author: " + getAuthor()+ ", File size: " +file_size +"\n");
        }
    }
}

class Library_main{
    public static void main(String[] args){
        Library[] library = new Library[5];

        library[0] = new Library.Book(101,"The Great Gatsby","F. Scott Fitzgerald",-1);
        library[1] = new Library.Book(102,"Harry Potter","J.K.Rowling",19);
        library[2] = new Library.Book(113,"1984","George Orwell",15);
        library[3] = new Library.Ebook(124,"The Book Thief","Markus Zusak","8 MB");
        library[4] = new Library.Ebook(213,"The Night Circus","Erin Morgenstern","2 MB");


        library[0].displayMessage();

        for(Library lib : library){
            lib.add();
        }

        for(Library lib : library){
            if(lib.bookId == 101) {
                lib.borrow();
            }
        }

        for(Library lib : library){
            if(lib.bookId == 113) {
                lib.returnBook();
            }
        }

        System.out.println("\nAll the available books in library");
        for(Library lib : library){
                lib.displayInfo();
        }
    }
}

