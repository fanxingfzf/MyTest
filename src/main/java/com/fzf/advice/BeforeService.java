package com.fzf.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author
 * @Data:2022/4/28 17:04
 * @description:some description
 * @Function:
 */
public class BeforeService implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("-----前置增强Start------");
        System.out.println(o+"的"+method.getName()+"方法，参数是"+ Arrays.toString(objects));
        System.out.println("------前置增强End--------");
    }
}
