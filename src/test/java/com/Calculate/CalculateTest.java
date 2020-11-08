package com.Calculate;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculateTest {
    @Test(enabled = true)//false 忽略此测试用例
    public void testAdd(){
        /**
         * assertEquals这个方法是一个断言方法
         * 第一个参数表示程序的执行结果
         * 第二个参数表示预期的结果
         * 当预期结果与执行结果一致时表示单元测试成功
         */
        Assert.assertEquals(new Calculate().add(1,2),3);
        System.out.println("testAdd()");
    }

    @Test
    public void testSubtract(){
        Assert.assertEquals(new Calculate().subtract(4,1),3);
        System.out.println("testSubtract()");
    }

    @Test
    public void testMultiply(){
        Assert.assertEquals(new Calculate().multiply(1,3),3);
        System.out.println("testMultiply");
    }

    /**
     * 异常预期测试
     */
    @Test
    public void testDivid(){
        Assert.assertEquals(new Calculate().divide(4,2),1);
        System.out.println("testDivide");
    }

}
