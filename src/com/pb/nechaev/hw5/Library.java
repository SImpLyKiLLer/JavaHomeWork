package com.pb.nechaev.hw5;

public class Library {

    public static void main(String[] args) {

        Book[] Book = new Book[3];
        Book[0] = new Book("Приключения", "Иванов И. И.", "2000 г.");
        Book[1] = new Book("Словарь ", "Сидоров А. В ", "1980 г.");
        Book[2] = new Book ("Энциклопедия ", "Гусев К. В.", "2010 г.");

        Reader[] Reader = new Reader[3];
        Reader[0] = new Reader("Иванов", 1, "информатики", "10.10.1992", "09999999999");
        Reader[1] = new Reader ("Сидоров", 2, "физический", "05.12.2000", "08888888888");
        Reader[2] = new Reader("Петров", 3, "математический", "20.05.1996", "06666666666");

        for (int i = 0; i < Book.length; i++) {
            Book[i].printBook();
        }

        for (int i= 0; i < Reader.length; i++)
        {
            Reader[i].printReader();
        }

        for (int i = 0; i < Reader.length; i++)
        {
            Reader[i].takeBook(i + 1);
        }

        Reader[0].takeBook("Приключения", ", Словарь", ", Энциклопедия");


        Reader[2].takeBook(Book[0], Book[1], Book[2]);


        for (int i = 0; i < Reader.length; i++)
        {
            Reader[i].returnBook(i + 1);
        }

        Reader[2].returnBook("Приключения", ", Словарь", ", Энциклопедия");


        Reader[1].returnBook(Book[0], Book[1], Book[2]);
    }
}
