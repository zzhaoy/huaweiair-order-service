package com.service.orderservice.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestOrderservice {

        OrderserviceDelegate orderserviceDelegate = new OrderserviceDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = orderserviceDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}