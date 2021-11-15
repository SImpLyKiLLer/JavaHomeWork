package com.pb.nechaev.hw7;

public class Pants extends Clothes implements ManClothes, WomenClothes{

    private static String name = "Штаны";

    Pants(Size size, String color, int price)
    {
        super.size = size;
        super.color = color;
        super.price = price;
    }

    @Override
    public void dressMan() {
        System.out.print("[ " + name + ", " + size + "_" + size.getDescription() + "_" + size.getEuroSize() + ", " + color + ", " + price + " ]");
    }

    @Override
    public void dressWomen() {
        System.out.print("[ " + name + ", " + size + "_" + size.getDescription() + "_" + size.getEuroSize() +", " + color + ", " + price + " ]");
    }
}
