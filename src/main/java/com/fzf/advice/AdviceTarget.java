package com.fzf.advice;

/**
 * @author
 * @Data:2022/4/28 16:52
 * @description:some description
 * @Function:
 */
public class AdviceTarget {

    /**
     * 测试方法，用于测试前置增强、后置增强、环绕增强
     * @param parama1
     * @param parama2
     * @return
     */
    public String testAdvice(String parama1,Integer parama2){
        System.out.println("我是测试类的方法，参数是parama1="+parama1+";parama2="+parama2);
        return "测试返回";
    }

    /**
     * 测试方法，用于测试异常抛出增强
     * @throws Exception
     */
    public void testException() throws Exception{
        throw new Exception("我是测试故意抛出的异常");
    }
}
