package com.fzf.pojo;

import org.springframework.stereotype.Component;

/**
 * @author
 * @Data:2022/4/27 21:35
 * @description:some description
 * @Function:
 */

/**
 * 使用@Component生成Bean
 */
@Component
public class Dog extends Pet{

    @Override
    public void shout() {
        System.out.println("汪汪");
    }
}
