package com.teedjay.soap;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PingerInput")
public class PingerInput {

    @XmlElement(required = true)
    public String message;

}
