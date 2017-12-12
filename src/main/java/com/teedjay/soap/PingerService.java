package com.teedjay.soap;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(
        portName = "PingerPort",
        serviceName = "PingerService",
        targetNamespace = "http://teedjay.com/wsdl")
public class PingerService {

    @WebResult(name="PingerOutput")
    public PingerOutput ping(@WebParam(name = "PingerInput") PingerInput pingerInput) {
        return new  PingerOutput(pingerInput.message);
    }

}
