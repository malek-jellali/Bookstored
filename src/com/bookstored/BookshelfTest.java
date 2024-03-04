package com.bookstored;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;

public class BookshelfTest {
	private Bookshelf userBookshelf;
	@BeforeEach
    void setUp() {
        userBookshelf = new Bookshelf();
        Book book1 = new Book("John Doe", "Book One", 2020);
        Book book2 = new Book("Jane Smith", "Book Two", 2021);
        userBookshelf.addBooksToShelf(book1, book2);
    }
@Test
void emptyBookShelfWhenNoBookAdded() {
    Bookshelf userBookshelf = new Bookshelf();
    assertTrue(userBookshelf.isEmpty());
}


@Test
void emptyBookshelfWhenBooksAdded() {
    assertEquals(2, userBookshelf.getNumberOfBooks());
}

@Test
void emptyBookShelfWhenAddIsCalledWithoutBooks() {
    Bookshelf userBookshelf = new Bookshelf();
    userBookshelf.addBooksToShelf();

    assertTrue(userBookshelf.isEmpty());
}
@Test
void booksReturnedFromBookShelfImmutableForClient() {
	assertThrows(UnsupportedOperationException.class, () -> {
        List<Book> books = userBookshelf.getBooks();
        books.add(new Book("Another Author", "Another Book", 2022));
    });
}
@Test
void bookshelfArrangedByBookTitle() {
    Bookshelf userBookshelf = new Bookshelf();
    Book book1 = new Book("John Doe", "Book Beta", 2020);
    Book book2 = new Book("Jane Smith", "Book Alpha", 2021);
    Book book3 = new Book("Alice Johnson", "Book Gamma", 2019);
    userBookshelf.addBooksToShelf(book1, book2, book3);
    userBookshelf.arrangeByBookTitle();
    List<Book> arrangedBooks = userBookshelf.getBooks();
    assertEquals("Book Alpha", arrangedBooks.get(0).getTitle());
    assertEquals("Book Beta", arrangedBooks.get(1).getTitle());
    assertEquals("Book Gamma", arrangedBooks.get(2).getTitle());
}
@Test
void booksInBookShelfAreInInsertionOrderAfterCallingArrange() {
    // Configuration initiale
    Bookshelf userBookshelf = new Bookshelf();
    Book book1 = new Book("John Doe", "Book Beta", 2020);
    Book book2 = new Book("Jane Smith", "Book Alpha", 2021);
    Book book3 = new Book("Alice Johnson", "Book Gamma", 2019);
    userBookshelf.addBooksToShelf(book1, book2, book3);
    List<Book> unmodifiableCopy = Collections.unmodifiableList(userBookshelf.getBooks());
    userBookshelf.arrangeByBookTitle();
    List<Book> arrangedBooks = userBookshelf.getBooks();
    assertEquals(unmodifiableCopy, arrangedBooks);
}
    
}
