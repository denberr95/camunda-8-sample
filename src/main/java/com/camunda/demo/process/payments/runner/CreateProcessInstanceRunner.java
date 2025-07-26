package com.camunda.demo.process.payments.runner;

import java.util.Map;
import com.camunda.demo.process.payments.util.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import io.camunda.zeebe.client.ZeebeClient;
import io.camunda.zeebe.client.api.response.ProcessInstanceEvent;

@Component
public class CreateProcessInstanceRunner implements CommandLineRunner {

    private static final Logger LOG = LoggerFactory.getLogger(CreateProcessInstanceRunner.class);
    private final ZeebeClient zeebeClient;

    public CreateProcessInstanceRunner(ZeebeClient zeebeClient) {
        this.zeebeClient = zeebeClient;
    }

    @Override
    public void run(String... args) throws Exception {
        ProcessInstanceEvent event = this.zeebeClient.newCreateInstanceCommand()
                .bpmnProcessId(Constants.BPM_PROCESS_PAYMENTS_ID).latestVersion()
                .variables(Map.of("total", 100)).send().join();
        LOG.info("Started a process instance: '{}'", event.getProcessInstanceKey());
    }
}
