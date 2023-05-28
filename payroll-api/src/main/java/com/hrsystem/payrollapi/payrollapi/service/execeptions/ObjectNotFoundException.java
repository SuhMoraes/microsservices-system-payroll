package com.hrsystem.payrollapi.payrollapi.service.execeptions;

public class ObjectNotFoundException extends RuntimeException{

    public ObjectNotFoundException(String message) {
        super(message);
    }
}
