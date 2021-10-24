package com.pb.nechaev.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] inputArray = new int[10];
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int temp = 0;

        System.out.println("Введите 10 целых чисел");
        for (int i=0; i < inputArray.length; i++)
        {
            System.out.print("Введите значение [" + (i+1) + "] - ");
            inputArray[i] = in.nextInt();
        }
        System.out.print("Ваш массив - [");
        for (int i=0; i < inputArray.length; i++)
        {
            System.out.print(inputArray[i] + ", ");

            sum += inputArray[i];

            if (inputArray[i] >= 0)
            {
                count++;
            }
        }
        System.out.println("]");
        System.out.println("Сумма чисел в массиве - " + sum);
        System.out.println("Количество положительных чисел - " + count);

        for (int i=0; i < inputArray.length -1; i++)
        {
            if (inputArray[i] > inputArray[i+1])
            {
                temp = inputArray[i];
                inputArray[i] = inputArray[i+1];
                inputArray[i+1]=temp;
            }
        }

        System.out.print("Отсортированный массив [");
        for (int i=0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + ", ");
        }
        System.out.println("]");
        }
}
