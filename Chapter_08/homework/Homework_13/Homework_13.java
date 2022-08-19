package com.homework.Homework_13;

public class Homework_13 {
    public static void main(String[] args) {
        Student student = new Student("小米", '男', 15, "2212");
        student.printinfo();

        System.out.println("-------------------------------------");

        Teacher teacher = new Teacher("王", '男', 45, 20);
        teacher.printinfo();

        //多态数组
        Person[] people = new Person[4];
        people[0] = new Student("小米", '男', 15, "2212");
        people[1] = new Student("ed", '男', 18, "2522");
        people[2] = new Teacher("王", '男', 45, 20);
        people[3] = new Teacher("wa", '男', 65, 40);

        Homework_13 homework_13 = new Homework_13();
        homework_13.sort(people);

        //输出
        for (int i = 0 ; i < people.length ; i++){
            System.out.println(people[i]);
        }

        //遍历数组，调用test方法
        System.out.println("------------");
        for (int i = 0 ; i < people.length ; i++){
            homework_13.test(people[i]);
        }

    }

    public void test(Person p){
        if(p instanceof Student){
            ((Student) p).study();
        }else if(p instanceof Teacher){
            ((Teacher) p).teach();
        }else {
            System.out.println("oooo");
        }
    }

    //年龄排序
    public void sort(Person[] people){
        Person temp = null;
        for(int i = 0 ; i < people.length ; i++){
            for (int j = 0 ; j < people.length-i-1 ; j++){
                if(people[j].getAge() < people[j+1].getAge()) {
                    temp = people[j];
                    people[j] = people[j+1];
                    people[j+1] = temp;
                }
            }
        }
    }


}
