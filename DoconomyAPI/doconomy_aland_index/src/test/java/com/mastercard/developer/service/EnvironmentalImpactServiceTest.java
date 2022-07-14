package com.mastercard.developer.service;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openapitools.client.ApiException;
import org.openapitools.client.model.MCAmount;
import org.openapitools.client.model.MCTransaction;
import org.openapitools.client.model.MCTransactionFootprints;
import org.openapitools.client.model.MCTransactions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest
class EnvironmentalImpactServiceTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(EnvironmentalImpactServiceTest.class);


    @Autowired
    private EnvironmentalImpactService environmentalImpactService;

    /**
     * Use case: Calculate Transaction Footprints
     */
    @Test
    @DisplayName("Calculate transaction footprints")
    void calculateFootprints() {

        //Test with different values
        MCTransactions mcTransactions = new MCTransactions()
                .addTransactionsItem(new MCTransaction().transactionId("TX-1")
                                             .mcc("3000").amount(
                                new MCAmount().currencyCode("EUR").value(new BigDecimal(150))));

        MCTransactionFootprints mcTransactionFootprints = null;
        try {
            mcTransactionFootprints = environmentalImpactService.calculateFootprints(
                    mcTransactions);

            if (mcTransactionFootprints != null) {
                LOGGER.info(String.valueOf(mcTransactionFootprints));
                assertNotNull(mcTransactionFootprints.getTransactionFootprints());
                assertFalse(mcTransactionFootprints.getTransactionFootprints().isEmpty());
            } else {
                LOGGER.info("Calculate Transaction Footprint API call failed.");
                Assert.fail("Calculate Transaction Footprint API call failed.");
            }

        } catch (ApiException e) {
            LOGGER.info("Calculate Transaction Footprint API call failed with error msg {}", e.getMessage());
            Assert.fail(e.getResponseBody());
        }


    }

}