package com.camunda.demo.process.payments.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import io.camunda.zeebe.client.ZeebeClient;
import io.camunda.zeebe.client.api.response.DeploymentEvent;

@Profile(value = "runtime")
@Configuration(proxyBeanMethods = false)
public class ProcessDeploymentConfig {

    @Bean(name = "processPaymentsDeployment")
    DeploymentEvent processPaymentsDeployment(final ZeebeClient zeebeClient) {
        return zeebeClient.newDeployResourceCommand()
                .addResourceFromClasspath("bpmn/process-payments.bpmn").send().join();
    }
}
