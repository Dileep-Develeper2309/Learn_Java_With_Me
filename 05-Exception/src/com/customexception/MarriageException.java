package com.customexception;

public class MarriageException extends RuntimeException{

    MarriageException(String message){
        super(message);
    }
}
