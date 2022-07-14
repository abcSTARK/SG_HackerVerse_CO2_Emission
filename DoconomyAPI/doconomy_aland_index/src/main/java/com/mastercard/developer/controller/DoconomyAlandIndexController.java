package com.mastercard.developer.controller;

import com.mastercard.developer.service.EnvironmentalImpactService;
import com.mastercard.developer.service.SupportedParametersService;
import org.openapitools.client.ApiException;
import org.openapitools.client.model.MCSupportedCurrencies;
import org.openapitools.client.model.MCSupportedMerchantCategories;
import org.openapitools.client.model.MCTransactionFootprints;
import org.openapitools.client.model.MCTransactions;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * This controller class exposes the following endpoints
 * 1. /transaction-footprints
 * 2. /supported-currencies
 * 3. /supported-mccs
 * Issuer can consume these endpoints through their web or mobile application.
 */
@RestController
@RequestMapping("/demo")
public class DoconomyAlandIndexController {

    private final EnvironmentalImpactService environmentalImpactService;
    private final SupportedParametersService supportedParametersService;

    public DoconomyAlandIndexController(EnvironmentalImpactService environmentalImpactService, SupportedParametersService supportedParametersService) {
        this.environmentalImpactService = environmentalImpactService;
        this.supportedParametersService = supportedParametersService;
    }

    @PostMapping("/transaction-footprints")
    public ResponseEntity<MCTransactionFootprints> calculateFootprints(@RequestBody MCTransactions mcTransactions) throws ApiException {
        return ResponseEntity.ok(environmentalImpactService.calculateFootprints(mcTransactions));

    }

    @GetMapping("/supported-currencies")
    public ResponseEntity<MCSupportedCurrencies> getSupportedCurrencies() throws ApiException {

        return ResponseEntity.ok(supportedParametersService.getSupportedCurrencies());

    }

    @GetMapping("/supported-mccs")
    public ResponseEntity<MCSupportedMerchantCategories> getSupportedMerchantCategories() throws ApiException {

        return ResponseEntity.ok(supportedParametersService.getSupportedMerchantCategories());

    }
}
