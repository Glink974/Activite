package com.expedition.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class ImpossibleAjouterException extends RuntimeException {

    public ImpossibleAjouterException(String s){
        super(s);
    }


}
