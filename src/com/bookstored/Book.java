package com.bookstored;

public class Book {
    private String author;
    private String title;
    private int publicationYear;

    // Constructeur
    public Book(String author, String title, int publicationYear) {
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Getters
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    // Autres méthodes, si nécessaires
}
