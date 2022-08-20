package homework;

public class Homework_03 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.shout();
        dog.shout();
    }
}


abstract class Animal{
    public abstract void shout();
}

class Cat extends Animal{
    @Override
    public void shout() {
        System.out.println("猫叫");
    }
}

class Dog extends Animal{
    @Override
    public void shout() {
        System.out.println("狗叫");
    }
}