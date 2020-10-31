/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kcc.animal.data;
/**
 *
 * @author Haley Hepker
 */
public class AnimalDataException extends Exception{
    
    public AnimalDataException() {
    }

    public AnimalDataException(String msg) {
        super(msg);
    }

    public AnimalDataException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public AnimalDataException(Throwable cause) {
        super(cause);
    }

    public AnimalDataException(String msg, Throwable cause
            , boolean enableSuppression, boolean writableStackTrace) {
        super(msg, cause, enableSuppression, writableStackTrace);
    }
}
