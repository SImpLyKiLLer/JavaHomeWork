package com.pb.nechaev.hw10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int size = 4;
        NumBox<Integer> num = new NumBox<>(size);
        List<Integer> tempNum = new ArrayList<>();
        try {
            num.add(5);
            num.add(15);
            num.add(10);
            tempNum.add(1);
            tempNum.add(2);
            tempNum.add(3);
        } catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

        num.addAll(tempNum);
        System.out.println("----Integer---");

        System.out.println("Первый элемент - " + num.get(0));

        System.out.println("Размер - " + num.length());


        System.out.println("Средние значение - " + num.average());

        System.out.println("Сумма элементов массива - " + num.sum());

        System.out.println("Максимальный элемент - " + num.max());

        System.out.println("----Float---");

        int size2 = 87;
        NumBox<Float> num2 = new NumBox<>(size2);
        try {
            num2.add(3.15F);
            num2.add(50.75F);
            num2.add(10.22F);
        } catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

        System.out.println("Первый элемент - " + num2.get(0));

        System.out.println("Размер - " + num2.length());


        System.out.println("Средние значение - " + num2.average());

        System.out.println("Сумма элементов массива - " + num2.sum());

        System.out.println("Максимальный элемент - " + num2.max());
    }
}
