package com.teedjay.soap;

import java.time.LocalDateTime;

public class PingerOutput {

    public String message;
    public String reverse;
    public String timestamp;

    public PingerOutput() { /* empty for jaxb marshalling */ }

    public PingerOutput(String message) {
        this.message = message;
        this.reverse = new StringBuffer(message).reverse().toString();
        this.timestamp = LocalDateTime.now().toString();
    }

}
