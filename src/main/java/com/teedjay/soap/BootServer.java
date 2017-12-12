package com.teedjay.soap;

import javax.xml.ws.Endpoint;

public class BootServer {

    private final static String address = "http://0.0.0.0:8082/pinger";

    public static void main(String[] args) {
        PingerService pingerService = new PingerService();
        System.out.println("Booting SOAP server at : " + address);
        System.out.println("WSDL available at : " + address + "?wsdl");
        Endpoint.publish(address, pingerService);
    }

}
