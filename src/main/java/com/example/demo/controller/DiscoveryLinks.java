package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import uk.org.openbanking.datamodel.discovery.OBDiscoveryResponse;

@RequestMapping("discovery")
public interface DiscoveryLinks {

    @GetMapping
    ResponseEntity<OBDiscoveryResponse> discovery(@RequestParam("discoveryUrl") String discoveryUrl);
}
