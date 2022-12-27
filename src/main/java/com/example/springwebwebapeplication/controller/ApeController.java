package com.example.springwebwebapeplication.controller;

import com.example.springwebwebapeplication.ApeIndex;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ApeController {
    @GetMapping(value = "/ape")
    public String apeIndexHandleGet() {
        return "Usage: curl --header 'Content-Type: application/json' http://127.0.0.1:8080/ape -X POST -d '{\"height\": 123, \"wingspan\": 456}'";
    }

    @PostMapping(path = "/ape",
    consumes = MediaType.APPLICATION_JSON_VALUE,
    produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity retApeIndexFromPost(@RequestBody ApeIndex apeIndex) {
        return new ResponseEntity(new ApeIndex(apeIndex.getWingspan(), apeIndex.getHeight()), HttpStatus.OK);
    }
}
