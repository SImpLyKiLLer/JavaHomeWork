package com.pb.nechaev.hw8;

public class WrongPasswordException extends Exception{

    public WrongPasswordException(String error) {
        super(error);
    }

    public WrongPasswordException()
    {

    }
}
