package com.pb.nechaev.hw6;

public class Horse extends  Animal{

    public boolean action;

    public Horse ()
    {
        super("Horse");
    }

    public void eat()
    {
        System.out.println(getType() + " не ест");
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
