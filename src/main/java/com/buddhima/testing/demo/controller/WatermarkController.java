package com.buddhima.testing.demo.controller;

import com.buddhima.testing.demo.service.WatermarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WatermarkController {

    @Autowired
    WatermarkService watermarkService;

    @GetMapping("/watermark")
    public boolean watermarkFile(String filename) {

        watermarkService.processWatermarking();

        return false;
    }

}
