package com.will.nacos.domain;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Description TODO
 * @Author maolingwei
 * @Date 2022-02-19 10:05 PM
 * @Version 1.0
 **/
public class PersonTest {

    @Test
    public void test() {
        Person person = new Person();
        person.setName("tom");
        Assert.assertEquals("tom", person.getName());
        System.out.println("success");
    }

    @Test
    public void test2() {
        int num = 10;
        Assert.assertEquals(10, num);
    }
}