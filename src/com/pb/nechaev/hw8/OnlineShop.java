package com.pb.nechaev.hw8;

import java.util.Scanner;

public class OnlineShop {

    public static void main(String[] args) {

        String login, password, confirmPassowrd;
        Scanner in = new Scanner(System.in);
        Auth auth = new Auth();

        try {
            System.out.println("Регистрация на сайте.");
            System.out.print("Введите логин - ");
            login = in.next();
            System.out.print("Введите пароль - ");
            password = in.next();
            System.out.print("Подтвердите пароль - ");
            confirmPassowrd = in.next();


            auth.singUp(login, password, confirmPassowrd);


            System.out.println("Вход на сайт.");
            System.out.print("Введите логин - ");
            login = in.next();
            System.out.print("Введите пароль - ");
            password = in.next();

        } catch (WrongLoginException wle)
        {
            System.out.println(wle.getMessage());
        }
        catch (WrongPasswordException wpe)
        {
            System.out.println(wpe.getMessage());
        }
    }
}
