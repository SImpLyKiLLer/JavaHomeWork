package com.pb.nechaev.hw6;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return action == horse.action;
    }

    @Override
    public int hashCode() {
        return Objects.hash(action);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "action=" + action +
                '}';
    }
}
