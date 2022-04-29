package com.fzf.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;
import java.util.Map;

/**
 * @author
 * @Data:2022/4/27 16:05
 * @description:some description
 * @Function:
 */
public class Master implements BeanNameAware, BeanFactoryAware, ApplicationContextAware , DisposableBean {
    private String name;
    private int age;
    private Pet pet;
    private List stringList;
    private Map map;

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean");
    }

    public void close(){
        System.out.println("close");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("setBeanName:"+s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext");

    }

    public Master() {
        System.out.println("Master构造方法");
    }

    public Master(String name, int age, Pet pet) {
        this.name = name;
        this.age = age;
        this.pet = pet;
    }

    public List getStringList() {
        return stringList;
    }

    public void setStringList(List stringList) {
        this.stringList = stringList;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void sayHello(){
        System.out.println("Hello world !");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("master的set方法");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Master{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
