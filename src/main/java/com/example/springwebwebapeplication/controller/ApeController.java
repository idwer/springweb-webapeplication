package com.example.springwebwebapeplication.controller;

import com.example.springwebwebapeplication.ApeIndex;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApeController {
    @RequestMapping(value = "/ape", method = RequestMethod.GET)
    public String apeIndexHandleGet() {
        return "Usage: curl --header 'Content-Type: application/json' http://127.0.0.1:8080/ape -X POST -d '{\"height\": 123, \"wingspan\": 456}'";
    }

    @RequestMapping(value = "/ape", method = RequestMethod.POST)
    public float apeIndexHandlePost(@RequestBody ApeIndex apeIndex) {
        return apeIndex.getApeIndex();
    }
}
