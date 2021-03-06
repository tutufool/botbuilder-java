/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.bot.schema.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Provides information about the options desired for the payment request.
 */
public class PaymentOptions {
    /**
     * Indicates whether the user agent should collect and return the payer's
     * name as part of the payment request.
     */
    @JsonProperty(value = "requestPayerName")
    private Boolean requestPayerName;

    /**
     * Indicates whether the user agent should collect and return the payer's
     * email address as part of the payment request.
     */
    @JsonProperty(value = "requestPayerEmail")
    private Boolean requestPayerEmail;

    /**
     * Indicates whether the user agent should collect and return the payer's
     * phone number as part of the payment request.
     */
    @JsonProperty(value = "requestPayerPhone")
    private Boolean requestPayerPhone;

    /**
     * Indicates whether the user agent should collect and return a shipping
     * address as part of the payment request.
     */
    @JsonProperty(value = "requestShipping")
    private Boolean requestShipping;

    /**
     * If requestShipping is set to true, then the shippingType field may be
     * used to influence the way the user agent presents the user interface for
     * gathering the shipping address.
     */
    @JsonProperty(value = "shippingType")
    private String shippingType;

    /**
     * Get the requestPayerName value.
     *
     * @return the requestPayerName value
     */
    public Boolean requestPayerName() {
        return this.requestPayerName;
    }

    /**
     * Set the requestPayerName value.
     *
     * @param requestPayerName the requestPayerName value to set
     * @return the PaymentOptions object itself.
     */
    public PaymentOptions withRequestPayerName(Boolean requestPayerName) {
        this.requestPayerName = requestPayerName;
        return this;
    }

    /**
     * Get the requestPayerEmail value.
     *
     * @return the requestPayerEmail value
     */
    public Boolean requestPayerEmail() {
        return this.requestPayerEmail;
    }

    /**
     * Set the requestPayerEmail value.
     *
     * @param requestPayerEmail the requestPayerEmail value to set
     * @return the PaymentOptions object itself.
     */
    public PaymentOptions withRequestPayerEmail(Boolean requestPayerEmail) {
        this.requestPayerEmail = requestPayerEmail;
        return this;
    }

    /**
     * Get the requestPayerPhone value.
     *
     * @return the requestPayerPhone value
     */
    public Boolean requestPayerPhone() {
        return this.requestPayerPhone;
    }

    /**
     * Set the requestPayerPhone value.
     *
     * @param requestPayerPhone the requestPayerPhone value to set
     * @return the PaymentOptions object itself.
     */
    public PaymentOptions withRequestPayerPhone(Boolean requestPayerPhone) {
        this.requestPayerPhone = requestPayerPhone;
        return this;
    }

    /**
     * Get the requestShipping value.
     *
     * @return the requestShipping value
     */
    public Boolean requestShipping() {
        return this.requestShipping;
    }

    /**
     * Set the requestShipping value.
     *
     * @param requestShipping the requestShipping value to set
     * @return the PaymentOptions object itself.
     */
    public PaymentOptions withRequestShipping(Boolean requestShipping) {
        this.requestShipping = requestShipping;
        return this;
    }

    /**
     * Get the shippingType value.
     *
     * @return the shippingType value
     */
    public String shippingType() {
        return this.shippingType;
    }

    /**
     * Set the shippingType value.
     *
     * @param shippingType the shippingType value to set
     * @return the PaymentOptions object itself.
     */
    public PaymentOptions withShippingType(String shippingType) {
        this.shippingType = shippingType;
        return this;
    }

}
