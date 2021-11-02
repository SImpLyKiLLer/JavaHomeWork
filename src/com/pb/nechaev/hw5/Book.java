package com.pb.nechaev.hw5;

public class Book {

    private String name;
    private String avtor;
    private String date;

    public Book (String name, String avtor, String date)
    {
        this.name = name;
        this. avtor = avtor;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvtor() {
        return avtor;
    }

    public void setAvtor(String avtor) {
        this.avtor = avtor;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void printBook() {
        System.out.println("Название книги - " + name + ";  Автор - " + avtor + ";  Дата - " + date);
    }
}
