package com.rtb.cloud.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/ratingServiceFallBack")
    public String ratingServiceFallBackMethod() {
        return "Rating Service is taking longer than Expected." +
                " Please try again later";
    }

    @GetMapping("/reviewServiceFallBack")
    public String reviewServiceFallBackMethod() {
        return "Review Service is taking longer than Expected." +
                " Please try again later";
    }

    @GetMapping("/detailServiceFallBack")
    public String detailServiceFallBackMethod() {
        return "Details Service is taking longer than Expected." +
                " Please try again later";
    }

    @GetMapping("/pageServiceFallBack")
    public String pageServiceFallBackMethod() {
        return "Product page Service is taking longer than Expected." +
                " Please try again later";
    }
}

