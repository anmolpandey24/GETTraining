package com.coforge;

import java.util.Scanner;

import com.coforge.dao.AuthorDao;
import com.coforge.dao.BookDao;
import com.coforge.entities.Author;
import com.coforge.entities.Book;

public class App {

    public static void main(String[] args) {

        AuthorDao authorDao = new AuthorDao();
        BookDao bookDao = new BookDao();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n========= MAIN MENU =========");
            System.out.println("1. Author Operations");
            System.out.println("2. Book Operations");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            int mainChoice = sc.nextInt();

            switch (mainChoice) {

                // ================= AUTHOR MENU =================
                case 1:
                    while (true) {
                        System.out.println("\n----- AUTHOR MENU -----");
                        System.out.println("1. Add Author with Books");
                        System.out.println("2. View All Authors");
                        System.out.println("3. View Author By ID");
                        System.out.println("4. Update Author");
                        System.out.println("5. Delete Author");
                        System.out.println("6. Remove Book From Author");
                        System.out.println("0. Back to Main Menu");
                        System.out.print("Enter choice: ");

                        int authorChoice = sc.nextInt();

                        if (authorChoice == 0) break;

                        switch (authorChoice) {

                            case 1:
                                sc.nextLine();
                                System.out.print("Enter Author Name: ");
                                String name = sc.nextLine();
                                System.out.print("Enter Author Address: ");
                                String address = sc.nextLine();

                                Author author = new Author(name, address);

                                System.out.print("How many books to add: ");
                                int count = sc.nextInt();
                                sc.nextLine();

                                for (int i = 0; i < count; i++) {
                                    System.out.print("Enter Book Title: ");
                                    String title = sc.nextLine();
                                    System.out.print("Enter Book Price: ");
                                    double price = sc.nextDouble();
                                    sc.nextLine();
                                    author.addBook(new Book(title, price));
                                }

                                authorDao.save(author);
                                System.out.println("Author saved successfully");
                                break;

                            case 2:
                                authorDao.getAll();
                                break;

                            case 3:
                                System.out.print("Enter Author ID: ");
                                System.out.println(authorDao.getById(sc.nextLong()));
                                break;

                            case 4:
                                System.out.print("Enter Author ID: ");
                                long aid = sc.nextLong();
                                sc.nextLine();

                                Author updAuthor = authorDao.getById(aid);
                                if (updAuthor != null) {
                                   
                                    System.out.print("Enter New Address: ");
                                    updAuthor.setAddress(sc.nextLine());
                                    authorDao.update(updAuthor);
                                    System.out.println("Author updated");
                                } else {
                                    System.out.println("Author not found");
                                }
                                break;

                            case 5:
                                System.out.print("Enter Author ID to delete: ");
                                authorDao.delete(sc.nextLong());
                                break;

                            case 6:
                                System.out.print("Enter Author ID: ");
                                long ra = sc.nextLong();
                                System.out.print("Enter Book ID: ");
                                long rb = sc.nextLong();
                                authorDao.removeBookFromAuthor(ra, rb);
                                break;

                            default:
                                System.out.println("Invalid choice");
                        }
                    }
                    break;

                // ================= BOOK MENU =================
                case 2:
                    while (true) {
                        System.out.println("\n----- BOOK MENU -----");
                        System.out.println("1. View All Books");
                        System.out.println("2. View Book By ID");
                        System.out.println("3. Update Book");
                        System.out.println("4. Delete Book");
                        System.out.println("0. Back to Main Menu");
                        System.out.print("Enter choice: ");

                        int bookChoice = sc.nextInt();

                        if (bookChoice == 0) break;

                        switch (bookChoice) {

                            case 1:
                                bookDao.getAll();
                                break;

                            case 2:
                                System.out.print("Enter Book ID: ");
                                System.out.println(bookDao.getById(sc.nextLong()));
                                break;

                            case 3:
                                System.out.print("Enter Book ID: ");
                                long bid = sc.nextLong();
                                sc.nextLine();

                                Book book = bookDao.getById(bid);
                                if (book != null) {
                                    System.out.print("Enter New Title: ");
                                    book.setTitle(sc.nextLine());
                                    bookDao.update(book);
                                    System.out.println("Book updated");
                                } else {
                                    System.out.println("Book not found");
                                }
                                break;

                            case 4:
                                System.out.print("Enter Book ID to delete: ");
                                bookDao.delete(sc.nextLong());
                                break;

                            default:
                                System.out.println("Invalid choice");
                        }
                    }
                    break;

                case 0:
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}