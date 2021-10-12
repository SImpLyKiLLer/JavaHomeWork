package com.pb.nechaev.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputInt;

        System.out.printf("Введите целое число ");
        inputInt = in.nextInt();

        if ( inputInt >= 0 && inputInt <= 100 ) {
            if (inputInt <= 14) {
                System.out.printf("Указанное число " + inputInt + " входит в промежуток [0 - 14]");
            } else
            {
                if (inputInt <=  35) {
                    System.out.printf("Указанное число " + inputInt + " входит в промежуток [15 - 35]");
                }
                else {
                    if (inputInt <= 50) {
                        System.out.printf("Указанное число " + inputInt + " входит в промежуток [36 - 50]");
                    }
                    else {
                        System.out.printf("Указанное число " + inputInt + " входит в промежуток [51 - 100]");
                    }
                }
            }
        } else {
            System.out.printf("Указанное число не входит в заданный промежуток");
        }
    }
}
