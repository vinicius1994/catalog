package com.portfolio.catalog.catalog.services.exception;

public class DataBaseException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public DataBaseException(String msg){
    super(msg);
    }
}
