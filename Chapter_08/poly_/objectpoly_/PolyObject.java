package com.poly_.objectpoly_;

public class PolyObject {
    public static void main(String[] args) {
        //animal编译类型是Animal 运行类型是Dog
        Animal animal = new Dog();
        animal.cry();//因为运行时，这时就执行该行，运行类型是Dog，执行dog cry

        animal = new Cat();
        animal.cry();
    }
}
