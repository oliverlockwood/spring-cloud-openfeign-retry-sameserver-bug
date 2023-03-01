package com.oliverlockwood.retrybug;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
public class ClientController {

    @Autowired
    private DownstreamServiceClient downstreamServiceClient;


    @GetMapping("/test")
    public String hitTheDownstreamService() {

        return downstreamServiceClient.getMeSomething();
    }
}
