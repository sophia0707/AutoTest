package com.course.testng.parameter;

import com.sun.org.apache.xpath.internal.objects.XString;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

    @Test
    @Parameters({"name","age"})
    public void parameterTest1(String name,int age){
        System.out.println("name = " + name + "; age =" + age);
    }
}
