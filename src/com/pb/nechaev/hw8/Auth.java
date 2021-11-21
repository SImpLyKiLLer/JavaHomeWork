package com.pb.nechaev.hw8;

public class Auth {

    protected String login;
    protected String password;


    protected void singUp (String login, String password, String confirmPassword) throws WrongPasswordException, WrongLoginException
    {
        String stLogin = login.replaceAll("[^\\da-zA-Z]","");
        String stPasssword = password.replaceAll("[^\\da-zA-Z_]","");
        if (!login.equals(stLogin) || login.length() < 5 || login.length() > 20)
        {
            throw new WrongLoginException("Неверный формат логина");
        } else {
            if (!password.equals(stPasssword) || password.length() < 5)
            {
                throw new WrongPasswordException("Неверный формат пароля");
            } else
            {
                if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароли не совпадают");
                } else
                {
                    this.login = login;
                    this.password = password;
                    System.out.println("Пользователь зарегестрирован");
                }
            }
        }
    }

    protected void singIn (String login, String password) throws WrongLoginException
    {
        if (!this.login.equals(login) || !this.password.equals(password))
        {
            throw new WrongLoginException("Неверный логин или пароль");
        }
    }
}
