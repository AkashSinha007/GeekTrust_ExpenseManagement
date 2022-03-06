package com.geektrust.backend.exceptions;

public class MoveOutFailureException extends RuntimeException{
    public MoveOutFailureException()
    {
     super();
    }
    public MoveOutFailureException(String msg)
    {
     super(msg);
    }
}
