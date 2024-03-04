package com.bookstored;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/*
public class Bookshelf {
    private List<Book> books;
    public Bookshelf() {
        this.books = new ArrayList<>();
    }
    public boolean addBookToShelf(Book book) {
        if (!books.contains(book)) {
            books.add(book);
            return true;
        }
        return false;
    }
    public boolean containsBook(Book book) {
        return books.contains(book);
    }
    public boolean isEmpty() {
        return books.isEmpty();
    }

    public int getNumberOfBooks() {
        return books.size();
    }
    public void addBooksToShelf(Book... booksToAdd) {
        books.addAll(Arrays.asList(booksToAdd));
    }
    public List<Book> getBooks() {
        return Collections.unmodifiableList(books);
    }

    public void arrangeByBookTitle() {
        Collections.sort(books, Comparator.comparing(Book::getTitle));
    }
    }
*/


public class Bookshelf {
    private List<Book> books;

    public Bookshelf() {
        this.books = new ArrayList<>();
    }

    public boolean addBookToShelf(Book book) {
        if (!books.contains(book)) {
            books.add(book);
            return true;
        }
        return false;
    }

    public void addBooksToShelf(Book... booksToAdd) {
        Collections.addAll(books, booksToAdd);
    }

    public void arrangeByBookTitle() {
        Collections.sort(books, Comparator.comparing(Book::getTitle));
    }

    public List<Book> getBooks() {
        return Collections.unmodifiableList(books);
    }

    public boolean isEmpty() {
        return books.isEmpty();
    }

    public int getNumberOfBooks() {
        return books.size();
    }
    public boolean containsBook(Book book) {
        return books.contains(book);
    }
}
	



