package com.override_;

public class Dog extends Animal{
    //dog是animal子类
    //cry方法完全一样
    //dog的cry方法重写了animal的cry
    public void cry(){
        System.out.println("小狗叫...");
    }
}
