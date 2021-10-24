package com.pb.nechaev.hw3;

import sun.security.rsa.RSAUtil;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {

        Random rand = new Random();
        int r = rand.nextInt(101);
        Scanner in = new Scanner(System.in);
        int score = 0;
        String inSring;

        System.out.println("Угадайте число от 0 до 100");
        System.out.println("Для выхода введите exit");
        System.out.println("-------------------------------");

        for (;;)
        {
            System.out.println("Введите Ваш вариант: ");
            inSring = in.next();
            if (inSring.equals("exit"))
            {
                System.out.println("Вы проиграли");
                System.out.println("Загаданное число - " + r);
                System.out.println("Количество потраченых попыток - " + (score+1));
                break;
            }
            if (inSring.matches("[-+]?\\d+"))
            {
                score++;
                if (Integer.parseInt(inSring) == r)
                {
                    System.out.println("Поздравляем, Вы угадали");
                    System.out.println("Загаданное число - " + r);
                    System.out.println("Количество попыток - " + score);
                    break;
                }
                else
                {
                    if (Integer.parseInt(inSring) > r)
                    {
                        System.out.println("Загаданное число меньше");
                    }
                    else
                    {
                        System.out.println("Загаданое число больше");
                    }
                }
            } else
            {
                System.out.println("Введено не число, попробуйте снова");
            }
        }
    }
}
