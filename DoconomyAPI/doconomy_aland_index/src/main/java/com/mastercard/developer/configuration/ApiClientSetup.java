package com.mastercard.developer.configuration;

import com.mastercard.developer.interceptors.OkHttpOAuth1Interceptor;
import com.mastercard.developer.utils.AuthenticationUtils;
import okhttp3.OkHttpClient.Builder;
import org.openapitools.client.ApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

import java.security.PrivateKey;

/**
 * Api Client Setup
 */

@Configuration
public class ApiClientSetup {

    private static final Logger LOGGER = LoggerFactory.getLogger(ApiClientSetup.class);

    @Value("${mastercard.api.consumer-key}")
    private String consumerKey;

    @Value("${mastercard.api.keystore-alias}")
    private String keyAlias;

    @Value("${mastercard.api.keystore-password}")
    private String keyPassword;

    @Value("${mastercard.api.key-file}")
    private Resource p12File;

    @Value("${mastercard.api.base-path}")
    private String basePath;

    @Bean
    public ApiClient setupAppClient() {
        LOGGER.info("Initializing API Client");

        ApiClient client = new ApiClient();

        client.setBasePath(basePath);

        PrivateKey signingKey;
        try {

            signingKey = AuthenticationUtils.loadSigningKey(p12File.getFile().getAbsolutePath(),
                                                            keyAlias,
                                                            keyPassword);

            Builder httpClientBuilder = client.getHttpClient().newBuilder();
            httpClientBuilder.addInterceptor(new OkHttpOAuth1Interceptor(consumerKey, signingKey));

            client.setHttpClient(httpClientBuilder.build());

        } catch (Exception e) {
            LOGGER.error("Error occurred while configuring ApiClient.", e);
        }

        LOGGER.info("API Client initialized successfully");
        return client;
    }

}
