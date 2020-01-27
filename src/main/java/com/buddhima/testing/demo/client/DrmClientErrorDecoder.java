package com.buddhima.testing.demo.client;

import feign.Response;
import feign.RetryableException;
import feign.codec.ErrorDecoder;

public class DrmClientErrorDecoder implements ErrorDecoder {

    private final ErrorDecoder defaultErrorDecoder = new Default();

    @Override
    public Exception decode(String s, Response response) {


        System.out.println("Error Response!!!");

        if (400 == response.status()) {
            return new RetryableException(400, response.reason(), response.request().httpMethod(), null, response.request());
        }

        return defaultErrorDecoder.decode(s, response);

    }
}
