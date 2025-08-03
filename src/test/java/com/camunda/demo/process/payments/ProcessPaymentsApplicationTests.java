package com.camunda.demo.process.payments;

import com.camunda.demo.process.payments.worker.ChargeCreditCardWorker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.wildfly.common.Assert;

@SpringBootTest
class ProcessPaymentsApplicationTests {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    void contextLoads() {
        Assert.assertNotNull(this.applicationContext.getBean(ChargeCreditCardWorker.class));
    }
}
