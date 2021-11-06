package com.pb.nechaev.hw6;

public class VetСlinic {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Horse horse = new Horse();
        Animal[] ani = new Animal[] {cat, dog, horse};

        for (Animal a: ani)
        {
            Veterinarian vet = new Veterinarian(a.getType());
            vet.treatAnimal(a);
        }

    }
}
