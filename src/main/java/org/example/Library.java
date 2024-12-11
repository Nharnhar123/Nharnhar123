package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<Patron> patrons = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addPatron(Patron patron) {
        patrons.add(patron);
    }

    public boolean borrowBook(String title, Patron patron) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isBorrowed()) {
                book.borrow();
                patron.borrowBook(book);
                return true;
            }
        }
        return false;
    }

    public boolean returnBook(String title, Patron patron) {
        for (Book book : patron.getBorrowedBooks()) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.returnBook();
                patron.returnBook(book);
                return true;
            }
        }
        return false;
    }
}

