package com.teedjay.soap;

import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDateTime;

@XmlRootElement(name = "PingerOutput")
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
