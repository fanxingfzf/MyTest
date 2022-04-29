package com.fzf.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;
import sun.applet.resources.MsgAppletViewer;

/**
 * @author
 * @Data:2022/4/28 15:52
 * @description:some description
 * @Function:Bean生命周期
 */
public class TestBean implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("before:"+beanName);
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("after:"+beanName);
//        if (bean instanceof Master){
//            Master master= (Master) bean;
//            master.setAge(40);
//        }
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
