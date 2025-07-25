package io.camunda.demo.process.payments;

import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.camunda.zeebe.client.ZeebeClient;
import io.camunda.zeebe.client.api.response.ProcessInstanceEvent;
import io.camunda.zeebe.spring.client.annotation.Deployment;

@Deployment(resources = "classpath:bpmn/process-payments.bpmn")
@SpringBootApplication
public class ProcessPaymentsApplication implements CommandLineRunner {

    private static final Logger LOG = LoggerFactory.getLogger(ProcessPaymentsApplication.class);

    @Autowired
    private ZeebeClient zeebeClient;

    public static void main(String[] args) {
        SpringApplication.run(ProcessPaymentsApplication.class, args);
    }

    @Override
    public void run(final String... args) {
        String bpmnProcessId = "process-payments";
        ProcessInstanceEvent event =
                this.zeebeClient.newCreateInstanceCommand().bpmnProcessId(bpmnProcessId)
                        .latestVersion().variables(Map.of("total", 100)).send().join();
        LOG.info("started a process instance: '{}'", event.getProcessInstanceKey());
    }
}
