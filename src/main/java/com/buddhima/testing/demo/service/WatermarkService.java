package com.buddhima.testing.demo.service;

import com.buddhima.testing.demo.client.DrmServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WatermarkService {

    @Autowired
    DrmServiceClient drmServiceClient;

    public void processWatermarking() {
        System.out.println("Watermarking file.....");

        Object o = drmServiceClient.getObjects();

        System.out.println();




//        DrmServiceClient drmServiceClient1 = Feign.builder()
//                .errorDecoder(new DrmClientErrorDecoder())
//                .target(DrmServiceClient.class, "http://jsonplaceholder.typicode.com/");

//        Object o1 = drmServiceClient1.getObjects((long) 1.0);

//        System.out.println("-----");
    }

}
