package com.pb.nechaev.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int operand1, operand2;
        String sign;
        Scanner in = new Scanner(System.in);

        System.out.printf("Введите первое значение ");
        operand1 = in.nextInt();
        System.out.printf("Введите второе значение ");
        operand2 = in.nextInt();
        System.out.printf("Введите арифметическую операцию ");
        sign = in.next();

        switch (sign) {
            case "+":
                System.out.printf("Результат " + (operand1 + operand2));
                break;
            case "-":
                System.out.printf("Результат " + (operand1 - operand2));
                break;
            case "*":
                System.out.printf("Результат " + (operand1 * operand2));
                break;
            case "/":
                if (operand2 != 0) {
                    System.out.printf("Результат " + (operand1 / operand2));
                    break;
                } else
                {
                    System.out.printf("Второе значение не может быть равно 0, при операции деления");
                    break;
                }
            default:
                System.out.printf("Введена неподдерживаемая арифметическая операция");


        }
    }
}
