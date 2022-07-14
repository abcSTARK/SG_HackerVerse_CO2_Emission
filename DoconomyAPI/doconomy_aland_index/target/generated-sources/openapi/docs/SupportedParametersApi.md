# SupportedParametersApi

All URIs are relative to *https://sandbox.api.mastercard.com/doconomy*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSupportedCurrencies**](SupportedParametersApi.md#getSupportedCurrencies) | **GET** /supported-currencies | Provide Supported Currencies
[**getSupportedMerchantCategories**](SupportedParametersApi.md#getSupportedMerchantCategories) | **GET** /supported-merchant-categories | Provide Supported MCCs


<a name="getSupportedCurrencies"></a>
# **getSupportedCurrencies**
> MCSupportedCurrencies getSupportedCurrencies()

Provide Supported Currencies

This service provides list of currencies supported by the application. While sending a transaction amount in Amount object, &#39;currencyCode&#39; should be from one of the supported currencies. It is recommended to cache this list and use it for checking before sending transactions for footprint calculation.&lt;br&gt;&lt;br&gt;Generally this list doesn&#39;t change that often but it is recommended to refresh this data every 24-hours.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportedParametersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox.api.mastercard.com/doconomy");

    SupportedParametersApi apiInstance = new SupportedParametersApi(defaultClient);
    try {
      MCSupportedCurrencies result = apiInstance.getSupportedCurrencies();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportedParametersApi#getSupportedCurrencies");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MCSupportedCurrencies**](MCSupportedCurrencies.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | This response code is returned when a request is accepted and successfuly processed. A corresponding response will be returned for the API caller. |  -  |
**500** | This is usually a temporary error, for example when downstream Doconomy system is not reachable or is experiencing heavy traffic. Please contact support email or try again later. |  -  |

<a name="getSupportedMerchantCategories"></a>
# **getSupportedMerchantCategories**
> MCSupportedMerchantCategories getSupportedMerchantCategories()

Provide Supported MCCs

This service provides list of merchant category codes supported by the application. While sending a transaction data in Transaction object, &#39;mcc&#39; should be from one of the supported merchant categories. It is recommended to cache this list and use it for checking before sending transactions for footprint calculation.&lt;br&gt;&lt;br&gt;Generally this list doesn&#39;t change that often but it is recommended to refresh this data every 24-hours.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportedParametersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox.api.mastercard.com/doconomy");

    SupportedParametersApi apiInstance = new SupportedParametersApi(defaultClient);
    try {
      MCSupportedMerchantCategories result = apiInstance.getSupportedMerchantCategories();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportedParametersApi#getSupportedMerchantCategories");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MCSupportedMerchantCategories**](MCSupportedMerchantCategories.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | This response code is returned when a request is accepted and successfuly processed. A corresponding response will be returned for the API caller. |  -  |
**500** | This is usually a temporary error, for example when downstream Doconomy system is not reachable or is experiencing heavy traffic. Please contact support email or try again later. |  -  |

