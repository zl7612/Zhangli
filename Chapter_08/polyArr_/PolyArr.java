package com.polyArr_;

public class PolyArr {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        people[0] = new Person("jack" , 20);
        people[1] = new Student("jack2" , 18 , 100);
        people[2] = new Student("smith" , 19 , 30.1);
        people[3] = new Teacher("scoot" , 30 , 20000);
        people[4] = new Teacher("king" , 50 , 25000);

        //循环遍历数组
        for(int i = 1 ; i < people.length ; i++){
            System.out.println(people[i].say());//动态绑定机制,编译类型是Person，运行类型根据=后改变
            //这里使用 类型判断 + 向下转型.
            if(people[i] instanceof Student ){
                Student student = (Student)people[i];//向下转型
                student.study();
            } else if (people[i] instanceof Teacher) {
                Teacher teacher = (Teacher)people[i];
                teacher.teach();
            }else {
                System.out.println("你的类型有误, 请自己检查...");
            }
        }
    }
}
