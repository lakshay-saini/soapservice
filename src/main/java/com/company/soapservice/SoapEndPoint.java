package com.company.soapservice;

import order.UpdateOrderStatusRequest;
import order.UpdateOrderStatusResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * Created by Officials on 27-10-2018.
 */
@Endpoint
public class SoapEndPoint {

    @PayloadRoot(namespace = "urn:order", localPart = "updateOrderStatusRequest")
    @ResponsePayload
    public UpdateOrderStatusResponse processCourseDetailsRequest(@RequestPayload UpdateOrderStatusRequest request) {
        UpdateOrderStatusResponse response = new UpdateOrderStatusResponse();
        response.set_return("success");
        return response;
    }
}
