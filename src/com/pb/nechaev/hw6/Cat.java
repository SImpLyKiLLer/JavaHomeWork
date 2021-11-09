package com.pb.nechaev.hw6;

import java.util.Objects;

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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return hight == cat.hight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hight);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "hight=" + hight +
                '}';
    }
}
