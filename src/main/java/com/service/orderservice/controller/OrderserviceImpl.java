package com.service.orderservice.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-11-29T08:54:31.798Z")

@RestSchema(schemaId = "orderservice")
@RequestMapping(path = "/orderservice", produces = MediaType.APPLICATION_JSON)
public class OrderserviceImpl {

    @Autowired
    private OrderserviceDelegate userOrderserviceDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userOrderserviceDelegate.helloworld(name);
    }

}
