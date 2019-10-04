package de.tomasulo.quickstart;

import lombok.extern.slf4j.Slf4j;

import javax.enterprise.context.ApplicationScoped;

@Slf4j
@ApplicationScoped
public class GreetingService {

    public String greeting(String name) {
        log.info("Received greeting request!!");
        return "hello " + name + ". This is a new version";
    }

}
