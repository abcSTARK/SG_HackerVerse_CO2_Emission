

# MCTransactionFootprint

This object holds the transaction footprint for a payment transaction.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionId** | **String** | A unique id associated with a payment transaction, e.g. original payment transaction id. The same id will be returned in the response corresponding to its payment transaction. | 
**carbonEmissionInGrams** | [**BigDecimal**](BigDecimal.md) | The transaction&#39;s CO2 emission in grams |  [optional]
**carbonEmissionInOunces** | [**BigDecimal**](BigDecimal.md) | The transaction&#39;s CO2 emission in ounces |  [optional]
**carbonSocialCost** | [**MCCarbonSocialCost**](MCCarbonSocialCost.md) |  |  [optional]
**waterUseInCubicMeters** | [**BigDecimal**](BigDecimal.md) | The transaction&#39;s water use in cubic meters |  [optional]
**waterUseInGallons** | [**BigDecimal**](BigDecimal.md) | The transaction&#39;s water use in US gallons |  [optional]
**waterUseSocialCost** | [**MCWaterUseSocialCost**](MCWaterUseSocialCost.md) |  |  [optional]



