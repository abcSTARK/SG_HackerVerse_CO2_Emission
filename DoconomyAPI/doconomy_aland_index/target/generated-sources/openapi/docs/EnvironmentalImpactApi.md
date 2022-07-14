# EnvironmentalImpactApi

All URIs are relative to *https://sandbox.api.mastercard.com/doconomy*

Method | HTTP request | Description
------------- | ------------- | -------------
[**footprintsByTransactionData**](EnvironmentalImpactApi.md#footprintsByTransactionData) | **POST** /transaction-footprints | Calculate Transaction Footprints


<a name="footprintsByTransactionData"></a>
# **footprintsByTransactionData**
> MCTransactionFootprints footprintsByTransactionData(mcTransactions)

Calculate Transaction Footprints

This service calculates carbon emission and water usage based on payment transaction amount and the merchant category code. You can send one or more transactions together to get the transaction footprints.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EnvironmentalImpactApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox.api.mastercard.com/doconomy");

    EnvironmentalImpactApi apiInstance = new EnvironmentalImpactApi(defaultClient);
    MCTransactions mcTransactions = new MCTransactions(); // MCTransactions | List of payment transaction which needs to be scored.
    try {
      MCTransactionFootprints result = apiInstance.footprintsByTransactionData(mcTransactions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnvironmentalImpactApi#footprintsByTransactionData");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mcTransactions** | [**MCTransactions**](MCTransactions.md)| List of payment transaction which needs to be scored. |

### Return type

[**MCTransactionFootprints**](MCTransactionFootprints.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | This response code is returned when a request is accepted and successfuly processed. A corresponding response will be returned for the API caller. |  -  |
**400** | This response code is returned when one or more request parameters is either missing or is invalid. A caller should update his request as per error details before trying again. |  -  |
**415** | This response code is returned when the MediaType in request is other than application/json. |  -  |
**500** | This is usually a temporary error, for example when downstream Doconomy system is not reachable or is experiencing heavy traffic. Please contact support email or try again later. |  -  |

