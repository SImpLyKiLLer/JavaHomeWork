package com.pb.nechaev.hw7;

public class Skirt extends Clothes implements WomenClothes{

    private static String name = "Юбка";

    Skirt(Size size, String color, int price)
    {
        super.size = size;
        super.color = color;
        super.price = price;
    }


    @Override
    public void dressWomen() {
        System.out.print("[ " + name + ", " + size + "_" + size.getDescription() + "_" + size.getEuroSize() +", " + color + ", " + price + " ]");
    }
}
