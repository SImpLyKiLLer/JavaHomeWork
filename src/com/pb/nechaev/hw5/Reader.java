package com.pb.nechaev.hw5;

public class Reader {

    private String fio;
    private int number;
    private String fac;
    private String dateR;
    private String tel;

    public Reader (String fio, int number, String fac, String dateR, String tel)
    {
        this.fio = fio;
        this.number = number;
        this.fac = fac;
        this.dateR = dateR;
        this.tel = tel;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFac() {
        return fac;
    }

    public void setFac(String fac) {
        this.fac = fac;
    }

    public String getDateR() {
        return dateR;
    }

    public void setDateR(String dateR) {
        this.dateR = dateR;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void takeBook(int col)
    {
        System.out.println(fio + " взял - " + col + " книгу(и)");
    }

    public void takeBook (String... book)
    {
        System.out.print(fio + " взял: ");
        for (int i = 0; i < book.length; i++)
        {
            System.out.print(book[i]);
        }
        System.out.println();
    }


    public void takeBook(Book... Book)
    {
        System.out.print(fio + " взял - ");
        for (int i = 0; i < Book.length; i++)
        {
            System.out.print(Book[i].getName() + "(" + Book[i].getAvtor() + " " + Book[i].getDate() + ")");
        }
        System.out.println();
    }


    public void returnBook(int col)
    {
        System.out.println(fio + " отдал - " + col + " книгу(и)");
    }

    public void returnBook (String... book)
    {
        System.out.print(fio + " отдал: ");
        for (int i = 0; i < book.length; i++)
        {
            System.out.print(book[i]);
        }
        System.out.println();
    }


    public void returnBook(Book... Book)
    {
        System.out.print(fio + " отдал - ");
        for (int i = 0; i < Book.length; i++)
        {
            System.out.print(Book[i].getName() + "(" + Book[i].getAvtor() + " " + Book[i].getDate() + ")");
        }
        System.out.println();
    }

    public void printReader ()
    {
        System.out.println("ФИО - " + fio + " | Номер читательского билета - " + number + " | Факультет - " + fac + " | Дата рождения - " + dateR + " | Телефон - " + tel);
    }
}
