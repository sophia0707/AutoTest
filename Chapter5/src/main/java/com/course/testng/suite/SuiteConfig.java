package com.course.testng.suite;

import org.testng.annotations.*;

public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite运行啦");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("sfter suite 运行啦");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeClass 运行啦");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("afterClass 运行啦");
    }
}
