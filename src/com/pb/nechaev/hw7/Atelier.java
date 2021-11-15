package com.pb.nechaev.hw7;

public class Atelier {

    public static void main(String[] args) {
        Clothes[] clothes = new Clothes[] {new Tshirt(Size.S,"red",50), new Pants(Size.M, "green", 100), new Skirt(Size.XXS, "blue", 20),new Tie(Size.L, "black",  70)};

        dressMan(clothes);
        System.out.println();
        dressWomen(clothes);
    }

    static void dressMan(Clothes[] clothes) {
        System.out.println("мужская одежка: ");
        for (Clothes cloth: clothes)
        {
            if (cloth instanceof ManClothes)
            {
                ((ManClothes) cloth).dressMan();
            }
        }
    }

    static void dressWomen(Clothes[] clothes) {
        System.out.println("женская одежка: ");
        for (Clothes cloth: clothes)
        {
            if (cloth instanceof WomenClothes)
            {
                ((WomenClothes) cloth).dressWomen();
            }
        }

    }
}
