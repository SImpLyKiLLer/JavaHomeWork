package com.pb.nechaev.hw6;

import java.lang.reflect.Constructor;

public class VetСlinic {

    public static void main(String[] args)  throws Exception{
        Cat cat = new Cat();
        Dog dog = new Dog();
        Horse horse = new Horse();
        Animal[] ani = new Animal[] {cat, dog, horse};

        for (Animal a: ani)
        {

            Class clazz =  Class.forName("com.pb.nechaev.hw6.Veterinarian");
            Constructor cons = clazz.getConstructor( new Class[] {String.class});
            Object ob = cons.newInstance(a.getType());

            if (ob instanceof Veterinarian) {
                ((Veterinarian) ob).treatAnimal(a);
            }
        }

    }
}
