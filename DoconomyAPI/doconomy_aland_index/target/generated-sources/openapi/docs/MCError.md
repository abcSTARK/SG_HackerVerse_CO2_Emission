

# MCError

Error object which contains details about error
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source** | **String** | The application name that generated this error. Every error message that is generated and returned by the gateway will have this field equal to Gateway. Other possible values are Doconomy-Proxy and Doconomy. | 
**reasonCode** | **String** | A unique constant identifying the error case encountered during request processing. | 
**description** | **String** | Short description of the ReasonCode field. | 
**recoverable** | **Boolean** | Indicates whether this error will always be returned for this request, or retrying could change the outcome. | 
**details** | **String** | (Optional) Where appropriate, indicates detailed information about data received and calculated during request processing, to help the user with diagnosing errors. |  [optional]



