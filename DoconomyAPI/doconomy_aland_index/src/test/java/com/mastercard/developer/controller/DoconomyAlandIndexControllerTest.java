package com.mastercard.developer.controller;

import com.google.gson.Gson;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openapitools.client.model.MCAmount;
import org.openapitools.client.model.MCSupportedCurrencies;
import org.openapitools.client.model.MCTransaction;
import org.openapitools.client.model.MCTransactions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
class DoconomyAlandIndexControllerTest {

    @Autowired
    private Gson gson;

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("POST /transaction-footprints")
    void calculateFootprints() throws Exception {
        MCTransactions mcTransactions = new MCTransactions()
                .addTransactionsItem(new MCTransaction().transactionId("TX-1")
                                             .mcc("3000").amount(
                                new MCAmount().currencyCode("EUR").value(new BigDecimal(150))));

        MvcResult mvcResult = mockMvc.perform(post("/demo/transaction-footprints").contentType("application/json").content(
                gson.toJson(mcTransactions))).andExpect(
                status().isOk()).andReturn();

        String response = mvcResult.getResponse().getContentAsString();
        assertNotNull(response);
        assertTrue(response.contains("TX-1"));


    }

    @Test
    @DisplayName("GET /supported-currencies")
    void getSupportedCurrencies() throws Exception {

        MvcResult mvcResult = this.mockMvc
                .perform(get("/demo/supported-currencies"))
                .andExpect(status().isOk()).andReturn();

        String response = mvcResult.getResponse().getContentAsString();
        MCSupportedCurrencies currencies = gson.fromJson(response, MCSupportedCurrencies.class);
        assertNotNull(currencies);
    }

    @Test
    @DisplayName("GET /supported-mccs")
    void getSupportedMerchantCategories() throws Exception {
        MvcResult mvcResult = this.mockMvc
                .perform(get("/demo/supported-mccs"))
                .andExpect(status().isOk()).andReturn();
        String response = mvcResult.getResponse().getContentAsString();
        assertNotNull(response);

    }

}