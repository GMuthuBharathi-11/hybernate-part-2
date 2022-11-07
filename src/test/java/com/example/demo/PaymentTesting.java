package com.example.demo;

import com.example.demo.entities.Check;
import com.example.demo.entities.CreditCard;
import com.example.demo.entities.PaymentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PaymentTesting {
    @Autowired
    PaymentRepository repository;
    @Test
    public void createPayment()
    {
        CreditCard creditCard=new CreditCard();
        creditCard.setId(100);
        creditCard.setAmount(80000);
        creditCard.setCardnumber("6a5mary");
        repository.save(creditCard);
    }
    @Test
    public void createCheckPayment()
    {
        Check check=new Check();
        check.setId(200);
        check.setAmount(80000);
        check.setCheckNumber("3zq8rt");
        repository.save(check);
    }
}
