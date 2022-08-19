public class class_test {
    public static void main(String[] args){
        class Cat{
            String name;
            int age;
            String color;
        }
        Cat cat1 = new Cat();
        cat1.name = "aa";
        cat1.age = 1;
        cat1.color = "bai";

        Cat cat2 = new Cat();
        cat2.name = "bb";
        cat2.age = 2;
        cat2.color = "black";

        System.out.println("第一只猫信息" + cat1.name + " " + cat1.age + " " + cat1.color +
                "第二只猫信息" + cat2.name + " " + cat2.age + " " + cat2.color);
    }


}
