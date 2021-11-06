package com.pb.nechaev.hw6;

public class Dog extends  Animal{


    public String status;

    public Dog ()
    {
        super("Dog");
    }

    public void eat()
    {
        System.out.println(getType() + " плохо ест");
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
