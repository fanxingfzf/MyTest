package com.fzf.pojo;

/**
 * @author
 * @Data:2022/4/28 14:10
 * @description:some description
 * @Function:
 */
public class PetShop {
    public static Pet getDog(){
        return new Dog();
    }


    public  Pet getCat(){
        return new Cat();
    }

    public  Pet getPet(String name){
        if (name=="cat"){
            return new Cat();
        }else {
            return new Dog();
        }
    }
}
