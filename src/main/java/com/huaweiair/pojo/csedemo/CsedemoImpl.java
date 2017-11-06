package com.huaweiair.pojo.csedemo;

import com.huaweiair.pojo.csedemo.model.Person;

import java.util.List;
import javax.validation.constraints.*;
import io.servicecomb.provider.pojo.RpcSchema;
import com.huaweiair.pojo.csedemo.Csedemo;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CsePojoCodegen", date = "2017-11-06T09:20:28.961Z")

@RpcSchema(schemaId = "csedemo")
public class CsedemoImpl implements Csedemo {
    private CsedemoAgent csedemoAgent = new CsedemoAgent();

    public Integer add(Integer a, Integer b) {

        return csedemoAgent.add(a, b);
    }


    public String sayHei(String name) {

        return csedemoAgent.sayHei(name);
    }


    public String sayHello(String name) {

        return csedemoAgent.sayHello(name);
    }


    public String sayHi(String name) {

        return csedemoAgent.sayHi(name);
    }


    public String saySomething(String prefix, Person user) {

        return csedemoAgent.saySomething(prefix, user);
    }

}
