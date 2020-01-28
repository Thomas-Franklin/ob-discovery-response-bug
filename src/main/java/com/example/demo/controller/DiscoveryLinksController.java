package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import uk.org.openbanking.datamodel.discovery.OBDiscoveryResponse;

@RestController
public class DiscoveryLinksController implements DiscoveryLinks {

    private final RestTemplate restTemplate;

    public DiscoveryLinksController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public ResponseEntity<OBDiscoveryResponse> discovery(String discoveryUrl) {

        return restTemplate.getForEntity(discoveryUrl, OBDiscoveryResponse.class);
    }
}
