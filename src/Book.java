public class Book {
    private String title;
    private String author;
    private int yearPublished;
    private boolean isAvailable = true;

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public boolean borrowBook() {
        if (isAvailable = false) {
            System.out.println("Book is not available");
            isAvailable = false;
        } else if (isAvailable = true) {
            System.out.println("Book Borrowed");
            isAvailable = false;
        } isAvailable = false;
            return isAvailable; // i dont even know whats wrong because it gets set to false at the end anyways and when i debug it isavailabkle is still false for book1 so i dont know why it allows me to borrow the book again :(
    }

    public boolean returnBook() {
        isAvailable = true;
        System.out.println("Book returned");
        return isAvailable;
    }

    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Year published: " + yearPublished + ", Available: "
                + isAvailable;
    }
}
