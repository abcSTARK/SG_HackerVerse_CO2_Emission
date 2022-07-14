package com.mastercard.developer.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openapitools.client.ApiException;
import org.openapitools.client.model.MCSupportedCurrencies;
import org.openapitools.client.model.MCSupportedMerchantCategories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class SupportedParametersServiceTest {

    @Autowired
    private SupportedParametersService supportedParametersService;

    /**
     * Use case: Supported Currencies
     */
    @Test
    @DisplayName("getSupportedCurrencies")
    void getSupportedCurrencies() throws ApiException {
        MCSupportedCurrencies supportedCurrencies = supportedParametersService.getSupportedCurrencies();
        assertNotNull(supportedCurrencies);
    }

    /**
     * Use case: Supported Merchant Categories
     */
    @Test
    @DisplayName("getSupportedMerchantCategories")
    void getSupportedMerchantCategories() throws ApiException {
        MCSupportedMerchantCategories supportedMerchantCategories = supportedParametersService.getSupportedMerchantCategories();
        assertNotNull(supportedMerchantCategories);
    }
}