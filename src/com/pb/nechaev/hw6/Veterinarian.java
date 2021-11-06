package com.pb.nechaev.hw6;

public class Veterinarian extends Animal{

    public Veterinarian (String type)
    {
        super(type);
    }

    public void treatAnimal (Animal animal)
    {
        System.out.println(getType() + " ест " + getFood() + ", живет - " + getLocation());
    }
}
