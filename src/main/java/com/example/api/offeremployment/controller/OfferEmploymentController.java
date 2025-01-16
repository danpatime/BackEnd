package com.example.api.offeremployment.controller;

import com.example.api.offeremployment.OfferEmploymentService;
import com.example.api.offeremployment.dto.OfferEmploymentRequest;
import com.example.api.offeremployment.dto.OfferEmploymentResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/offeremployment")
@RequiredArgsConstructor
public class OfferEmploymentController {
    private final OfferEmploymentService offerEmploymentService;

    @PostMapping
    public ResponseEntity<OfferEmploymentResponse> sendOfferEmployment(
            @RequestBody final OfferEmploymentRequest offerEmploymentRequest
    ) {
        final OfferEmploymentResponse offerEmploymentResponse = offerEmploymentService.sendOfferEmployment(offerEmploymentRequest);
        return ResponseEntity.ok(offerEmploymentResponse);
    }
}