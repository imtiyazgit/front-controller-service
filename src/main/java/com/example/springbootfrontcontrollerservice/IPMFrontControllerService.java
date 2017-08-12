package com.example.springbootfrontcontrollerservice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@RestController
public class IPMFrontControllerService {

    @RequestMapping("/CardDetails/{account_number}")
    public CardDetails getCardDetails(@PathVariable int account_number) {
        RestTemplate restTemplate = new RestTemplate();
        String userProfileUrl = "http://localhost:8082/user/"+account_number;
        User user = restTemplate.getForObject(userProfileUrl, User.class);
        CardDetails cardDetails = new CardDetails();
        cardDetails.setUser(user);
        cardDetails.setLimit(10000);
        cardDetails.setType("BlueCard");
        return cardDetails;
    }
}
