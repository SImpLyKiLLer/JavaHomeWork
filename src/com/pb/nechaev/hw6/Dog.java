package com.pb.nechaev.hw6;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(status, dog.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "status='" + status + '\'' +
                '}';
    }
}
