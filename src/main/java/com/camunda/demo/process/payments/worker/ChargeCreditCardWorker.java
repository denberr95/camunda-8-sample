package com.camunda.demo.process.payments.worker;

import java.util.Map;
import com.camunda.demo.process.payments.util.BPMProcessVariables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import io.camunda.zeebe.client.api.response.ActivatedJob;
import io.camunda.zeebe.spring.client.annotation.JobWorker;
import io.camunda.zeebe.spring.client.annotation.Variable;

@Component
public class ChargeCreditCardWorker {

    private static final Logger LOG = LoggerFactory.getLogger(ChargeCreditCardWorker.class);

    @JobWorker(type = "charge-credit-card")
    public Map<String, Double> chargeCreditCard(
            @Variable(name = BPMProcessVariables.TOTAL_WITH_TAX) final Double totalWithTax,
            final ActivatedJob activatedJob) {
        LOG.info(
                "Execute on processInstanceKey: '{}', job chargeCreditCard: '{}'",
                activatedJob.getProcessInstanceKey(), totalWithTax);
        return Map.of(BPMProcessVariables.AMOUNT_CHARGED, totalWithTax);
    }
}
