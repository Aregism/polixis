package com.polixis.service;

//import com.polixis.model.OtherObj;
import com.polixis.model.UserData;
import com.polixis.repository.UserDataRepository;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    public KafkaConsumer(UserDataRepository userDataRepository) {
        this.userDataRepository = userDataRepository;
    }

    private final UserDataRepository userDataRepository;

    @KafkaListener(topics = "userData", groupId = "main")
    public void consumeUserData(UserData userData) {
        // could be a log here
        System.out.println("Consumed userData\n" + userData.toString());
        // could be a another log here
        userDataRepository.save(userData);
    }



}