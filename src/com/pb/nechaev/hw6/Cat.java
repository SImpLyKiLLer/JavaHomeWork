package com.pb.nechaev.hw6;

public class Cat extends  Animal{

    private int hight;

    public Cat ()
    {
        super("Cat");
    }

    public void eat()
    {
        System.out.println(getType() + " ест");
    }


    public String toString()
    {
        System.out.println("toString....");
        return " ";
    }

    public void equals ()
    {
        System.out.println("equals.....");
    }

    public int hashCode()
    {
        System.out.println("hashCode...");
        return 0;
    }
}
