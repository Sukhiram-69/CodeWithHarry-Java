package com.company;

class Library{
    String[] books;
    int no_of_books;

    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBooks(String books){
        this.books[no_of_books] = books;
        no_of_books++;
        System.out.println(books + " has been added !");
    }

    void showAvailableBooks(){
        System.out.println("Available Books are : ");
        for (String book : this.books){
            if (book == null){
                continue;
            }
            System.out.println("* "+book);
        }
    }
    void issueBook(String book){
      for (int i =0; i<this.books.length; i++){
          if(this.books[i] == book){
              System.out.println(book + " book has been issued!");
              this.books[i] = null;
              return;
          }
      }
        System.out.println("this book does not exists");
    }

    void returnBook(String book){
        this.books[no_of_books] = book;
    }
}
public class CWH_61_Solution_Exercise {
    public static void main(String[] args) {
    Library centralLibrary = new Library();
    centralLibrary.addBooks("Think and grow Rich");
    centralLibrary.addBooks("Algorithms Book");
    centralLibrary.addBooks("C++");
    centralLibrary.showAvailableBooks();
    centralLibrary.issueBook("C++");
    centralLibrary.showAvailableBooks();
    centralLibrary.returnBook("C++");
    centralLibrary.showAvailableBooks();
    }
}
