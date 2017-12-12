package com.teedjay.soap;

import javax.xml.bind.annotation.XmlElement;

public class PingerInput {

    @XmlElement(required = true)
    public String message;

}
