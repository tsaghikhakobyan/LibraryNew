package com.company;

class Book {
    String name;
    String author;
    int numberOfPages;
    String genre;
    int year;

    public Book(String name, String author, int numberOfPages, String genre, int year) {
        this.name = name;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
        this.year = year;
    }

    //Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
