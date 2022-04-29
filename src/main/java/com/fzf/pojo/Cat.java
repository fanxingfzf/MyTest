package com.fzf.pojo;

import org.springframework.stereotype.Component;

/**
 * @author
 * @Data:2022/4/27 21:34
 * @description:some description
 * @Function:
 */

public class Cat extends Pet {

    @Override
    public void shout() {
        System.out.println("喵喵");
    }
}
