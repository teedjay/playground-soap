# playground-soap
Simple SOAP using only plain Java SE 8
Added GitHub Action to the project for Java CI.


## How to build
You need Java 8 to build this project.
```
mvn clean        <== will install the ojdbc8.jar file in your local Maven repo
mvn package      <== will build a runnable jar file at target/fms-metrics-server.jar
```

## How to run this project
You can run directly from the command line.
```
java -cp target/soap-1.0-SNAPSHOT.jar com.teedjay.soap.BootServer
```

## How to use the service
WSDL will be available for import to SOAP-UI etc at `http://localhost:8082/pinger?wsdl`

You can post a request file by using this curl :
```
curl -i -X POST -H "Content-Type: text/xml" -d @src/test/resources/ExampleRequest.xml http://localhost:8082/pinger
```

The response should be like this :
```
<?xml version="1.0" ?>
<S:Envelope xmlns:S="http://schemas.xmlsoap.org/soap/envelope/">
  <S:Body>
    <ns2:pingResponse xmlns:ns2="http://teedjay.com/wsdl">
      <PingerOutput>
        <message>This is a simple SAMPLE message</message>
        <reverse>egassem ELPMAS elpmis a si sihT</reverse>
        <timestamp>2017-12-12T14:40:07.659</timestamp>
      </PingerOutput>
    </ns2:pingResponse>
  </S:Body>
</S:Envelope>
```
