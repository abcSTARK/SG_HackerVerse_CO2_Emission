package com.mastercard.developer.service;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.api.SupportedParametersApi;
import org.openapitools.client.model.MCSupportedCurrencies;
import org.openapitools.client.model.MCSupportedMerchantCategories;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This service calls the Get Supported Currencies and Merchant Categories APIs.
 */
@Service
public class SupportedParametersService {
    private static final Logger LOGGER = LoggerFactory.getLogger(SupportedParametersService.class);

    private final SupportedParametersApi supportedParametersApi;

    @Autowired
    public SupportedParametersService(ApiClient apiClient) {
        LOGGER.info("Initializing Supported Parameters API");
        supportedParametersApi = new SupportedParametersApi(apiClient);
    }

    public MCSupportedCurrencies getSupportedCurrencies() throws ApiException {
        LOGGER.info("Calling Get Supported Currencies API");

        MCSupportedCurrencies mcSupportedCurrencies = supportedParametersApi.getSupportedCurrencies();

        LOGGER.info("Returning list of supported currencies.");

        return mcSupportedCurrencies;

    }

    public MCSupportedMerchantCategories getSupportedMerchantCategories() throws ApiException {
        LOGGER.info("Calling Get Supported Merchant Categories API");

        MCSupportedMerchantCategories merchantCategories = supportedParametersApi.getSupportedMerchantCategories();

        LOGGER.info("Returning list of supported MCCs.");

        return merchantCategories;

    }

}
