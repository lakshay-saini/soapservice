package com.company.soapservice;

import order.UpdateOrderStatusRequest;
import order.UpdateOrderStatusResponse;
import order.WFMCreateWORequest;
import order.WFMCreateWOResponse;
import order.WFMUpdateStatusRequest;
import order.WFMUpdateStatusResponse;
import order.WFMUpdateWORequest;
import order.WFMUpdateWOResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * Created by Officials on 27-10-2018.
 */
@Endpoint
public class SoapEndPoint {

    @PayloadRoot(namespace = "WFM.xsd", localPart = "updateOrderStatusRequest")
    @ResponsePayload
    public UpdateOrderStatusResponse processupdateOrderStatusRequest(@RequestPayload UpdateOrderStatusRequest request) {
        UpdateOrderStatusResponse response = new UpdateOrderStatusResponse();
        response.set_return("success");
        return response;
    }

    @PayloadRoot(namespace = "WFM.xsd", localPart = "WFMCreateWORequest")
    @ResponsePayload
    public WFMCreateWOResponse processWFMCreateWORequestRequest(@RequestPayload WFMCreateWORequest request) {
        WFMCreateWOResponse response = new WFMCreateWOResponse();
        response.setReturn("success");
        return response;
    }

    @PayloadRoot(namespace = "WFM.xsd", localPart = "WFMUpdateWORequest")
    @ResponsePayload
    public WFMUpdateWOResponse processWFMUpdateWORequest(@RequestPayload WFMUpdateWORequest request) {
        WFMUpdateWOResponse response = new WFMUpdateWOResponse();
        response.setReturn("success");
        return response;
    }

    @PayloadRoot(namespace = "WFM.xsd", localPart = "WFMUpdateStatusRequest")
    @ResponsePayload
    public WFMUpdateStatusResponse processWFMUpdateStatusRequest(@RequestPayload WFMUpdateStatusRequest request) {
        WFMUpdateStatusResponse response = new WFMUpdateStatusResponse();
        response.setReturn("success");
        return response;
    }

}
