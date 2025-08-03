package com.camunda.demo.process.payments.util;

public class BPMProcessVariables {
    
    private BPMProcessVariables() {
        throw new IllegalStateException("This is a utility class and cannot be instantiated");
    }

    public static final String AMOUNT_CHARGED = "amountCharged";
    public static final String TOTAL_WITH_TAX = "totalWithTax";
}
