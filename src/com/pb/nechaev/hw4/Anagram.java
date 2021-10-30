package com.pb.nechaev.hw4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Anagram {


    public static boolean isAnagram(String strA, String strB) {

        strA = strA.replaceAll("\\s+","").toLowerCase();
        strB = strB.replaceAll("\\s+","").toLowerCase();


        for (int i = 0; i < strA.length(); i++ ) {
            if (strB.equals("")) return false;
            strB = strB.replaceFirst(Pattern.quote("" + strA.charAt(i)), "");
        }

        return strB.equals("");
    }



    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите первую строку - ");
        String st1 = in.nextLine();
        System.out.print("Введите вторую строку - ");
        String st2 = in.nextLine();

        System.out.println(isAnagram(st1, st2));

    }
}
