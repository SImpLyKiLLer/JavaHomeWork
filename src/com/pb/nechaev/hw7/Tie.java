package com.pb.nechaev.hw7;

public class Tie extends Clothes implements ManClothes {

    private static String name = "Галстук";

    Tie(Size size, String color, int price)
    {
        super.size = size;
        super.color = color;
        super.price = price;
    }

    @Override
    public void dressMan() {
        System.out.print("[ " + name + ", " + size + "_" + size.getDescription() + "_" + size.getEuroSize() +", " + color + ", " + price + " ]");
    }

}
