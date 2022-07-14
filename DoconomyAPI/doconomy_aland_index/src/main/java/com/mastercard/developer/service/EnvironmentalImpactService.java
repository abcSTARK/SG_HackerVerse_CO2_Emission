package com.mastercard.developer.service;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.api.EnvironmentalImpactApi;
import org.openapitools.client.model.MCTransactionFootprints;
import org.openapitools.client.model.MCTransactions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This service calls the Transaction Footprint API.
 */
@Service
public class EnvironmentalImpactService {

    private static final Logger LOGGER = LoggerFactory.getLogger(EnvironmentalImpactService.class);

    private final EnvironmentalImpactApi environmentalImpactApi;

    @Autowired
    public EnvironmentalImpactService(ApiClient apiClient) {
        LOGGER.info("Initializing Calculate Transaction Footprint API");
        environmentalImpactApi = new EnvironmentalImpactApi(apiClient);
    }

    public MCTransactionFootprints calculateFootprints(MCTransactions mcTransactions) throws ApiException {
        LOGGER.info("Calling Calculate Transaction Footprint endpoint");

        MCTransactionFootprints footprints = environmentalImpactApi.footprintsByTransactionData(mcTransactions);

        LOGGER.info("Returning Transaction Footprint response.");

        return footprints;

    }

}
