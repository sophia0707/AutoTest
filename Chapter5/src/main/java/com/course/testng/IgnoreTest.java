package com.course.testng;

import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;
import org.testng.annotations.Test;

public class IgnoreTest {

    @Test
    public void ignore1(){
        System.out.println("忽略测试1执行");
    }

    @Test(enabled = false)
    public void ignore2(){
        System.out.println("忽略测试2执行");
    }

    @Test(enabled = true)
    public void ignore3(){
        System.out.println("忽略测试3执行");
    }
}
