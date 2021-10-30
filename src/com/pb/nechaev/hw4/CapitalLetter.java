package com.pb.nechaev.hw4;

import java.util.Scanner;

public class CapitalLetter {

    static void CP (String buf){
        String[] bufPart = buf.split(" ");
        for (int i=0; i < bufPart.length; i++)
        {
            char[] bufTemp = bufPart[i].toCharArray();

            if (bufTemp[0] >= 'а' && bufTemp[0] <= 'я') {
                bufTemp[0] = Character.toUpperCase(bufTemp[0]);
                for (int j = 0; j < bufTemp.length; j++) {
                    System.out.print(bufTemp[j]);
                }

            } else {
                System.out.print(bufPart[i]);
            }
            System.out.print(" ");
        }
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите строку - ");
        String inString = in.nextLine();
        CP(inString);


    }
}
