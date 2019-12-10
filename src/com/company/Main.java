package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------MENU-------------");
        System.out.println("PRESS 1 TO ADD BOOK");
        System.out.println("PRESS 2 TO VIEW BOOK");
        System.out.println("PRESS 3 FOR EXIT");
        System.out.println(" ------------------------------");
        int enterNumber;
        HashMap<String, Book> libraryBooks = new HashMap<>();
        do {
            enterNumber = scanner.nextInt();
            switch (enterNumber) {
                case 1:
                    System.out.println("Please enter the name");
                    String bookName = scanner.nextLine();
                    String name = bookName;
                    scanner.next();
                    System.out.println("Please enter the author");
                    String bookAuthor = scanner.nextLine();
                    scanner.next();
                    System.out.println("Please enter the number of pages");
                    int numberOfPages = scanner.nextInt();
                    System.out.println("Please enter the genre");
                    String genre = scanner.nextLine();
                    scanner.next();
                    System.out.println("Please enter the year");
                    int year = scanner.nextInt();
                    System.out.println("The book was added");
                    libraryBooks.put(name, new Book(bookName, bookAuthor, numberOfPages, genre, year));
                    System.out.println("-------------MENU-------------");
                    System.out.println("PRESS 1 TO ADD BOOK");
                    System.out.println("PRESS 2 TO VIEW BOOK");
                    System.out.println("PRESS 3 FOR EXIT");
                    System.out.println(" ------------------------------");
                    scanner.next();
                    break;
                case 2:
                    System.out.println("Please enter the book name");
                    String bookName2 = scanner.nextLine();
                    if (libraryBooks.containsKey(bookName2)) {
                        System.out.println("The book name is " + libraryBooks.get(bookName2).getName());
                        System.out.println("The  Autor " + libraryBooks.get(bookName2).getAuthor());
                        System.out.println("Number of pages " + libraryBooks.get(bookName2).getNumberOfPages());
                        System.out.println("The genre " + libraryBooks.get(bookName2).getNumberOfPages());
                        System.out.println("The publishing year " + libraryBooks.get(bookName2).getYear());
                    } else {
                        System.out.println("The book doesn't exist, please add it");
                    }
                    break;
                default:
                    System.out.println("Please1 enter 1,2 or 3");
            }
        }

        while (enterNumber != 3);
        if (enterNumber == 3) {
            System.out.println("Exit");
        } else {
            System.out.println("Please1 enter 1,2 or 3");
        }
    }
}
