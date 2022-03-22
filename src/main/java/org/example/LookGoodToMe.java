package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lgtm")
public class LookGoodToMe {

    Logger logger = LoggerFactory.getLogger(LookGoodToMe.class);

    @GetMapping("/hello")
    public String execute(@RequestParam(defaultValue = "world") String name) {
        logger.info(name);
        return "Hello " + name + "!";
    }

}
