package com.polixis.util;

import com.polixis.model.UserData;
import com.polixis.service.KafkaProducerService;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class PostConstructInit {

    public PostConstructInit(KafkaProducerService producerService) {
        this.producerService = producerService;
    }

    private final KafkaProducerService producerService;



    @PostConstruct
    public void init() {
        UserData userData = new UserData(
                "coolest username ever",
                "encode me",
                "email@mail.ml",
                LocalDate.of(1997, 6, 24));

        producerService.send("userData", userData);
        // could be a log here
        System.out.println("Produced user data:\n" + userData );
    }
}
