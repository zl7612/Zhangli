package com.poly_.detail_;

public class Dog extends Animal{
    public void eat(){//方法重写
        System.out.println("狗吃肉");
    }
    public void climb(){//Dog 特有方法
        System.out.println("狗爬墙");
    }
}
