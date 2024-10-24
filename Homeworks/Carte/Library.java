package Carte;

public class Library {
    public static void main(String[] args) {

        Author author = new Author("Alex Gatu", "poped@gmail.com");

        Book book = new Book("QA_Bootcamp", 2024, author, 200);

        System.out.println("Book " + book.getName() + " (" + book.getPrice() + " RON), by " + book.getAuthor().getName() + ", published in " + book.getYear());
    }
}
