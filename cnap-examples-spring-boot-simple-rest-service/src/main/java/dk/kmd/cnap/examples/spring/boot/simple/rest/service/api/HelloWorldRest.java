package dk.kmd.cnap.examples.spring.boot.simple.rest.service.api;

import dk.kmd.cnap.examples.spring.boot.simple.rest.service.service.HelloWorldService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class
HelloWorldRest {

    Logger logger = LoggerFactory.getLogger(HelloWorldRest.class);


    @Autowired
    HelloWorldService helloWorldService;


    @GetMapping("/helloNemkonto")
    public ResponseEntity executeHello() {
        logger.info("Inside executeHello...");
        String hello = helloWorldService.returnHello();
        return ResponseEntity.ok(hello);
    }
}
