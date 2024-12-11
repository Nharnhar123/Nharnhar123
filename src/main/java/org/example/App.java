package org.example;

public class App {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        library.addBook(book1);
        library.addBook(book2);

        Patron patron = new Patron("Alice");
        library.addPatron(patron);

        System.out.println("Borrowing '1984': " + library.borrowBook("1984", patron));
        System.out.println("Borrowing '1984' again: " + library.borrowBook("1984", patron));
        System.out.println("Returning '1984': " + library.returnBook("1984", patron));
        System.out.println("Returning '1984' again: " + library.returnBook("1984", patron));
    }
}

