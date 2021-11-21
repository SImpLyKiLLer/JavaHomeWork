package com.pb.nechaev.hw8;

public class WrongLoginException extends Exception {

    public WrongLoginException(String error) {
        super(error);
    }

    public WrongLoginException()
    {

    }
}
