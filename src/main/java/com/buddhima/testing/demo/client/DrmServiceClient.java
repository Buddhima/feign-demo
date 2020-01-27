package com.buddhima.testing.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

//@FeignClient(value="drmClient", url="http://jsonplaceholder.typicode.com/")
@FeignClient(value="drmClient", url="http://www.mocky.io/v2/5e2d966a3000006200e77d2d") // to produce 400 HTTP status
public interface DrmServiceClient {

    @RequestMapping(method = RequestMethod.GET, value = "/posts")
    List<Object> getObjects();

}
