package edu.nc.sumy.view;


public class ShitHappensException extends RuntimeException {

    public ShitHappensException(String message) {
        super(message);
    }

    public ShitHappensException(String message, Throwable cause) {
        super(message, cause);
    }
}
