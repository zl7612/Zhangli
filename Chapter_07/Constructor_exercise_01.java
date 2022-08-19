public class Constructor_exercise_01 {
    public static void main(String[] args){
        Person_Con p_con = new Person_Con();//无参构造器
        System.out.println("p_con的信息"+p_con.name+p_con.age);
        Person_Con p_con2 = new Person_Con("sc" , 50);
        System.out.println("p_con的信息"+p_con2.name+p_con2.age);

    }
}
class Person_Con{
    String name;
    int age;
    public Person_Con(){
//        name = "XXX";
                age = 18;
    }

    public Person_Con(String pName , int pAge){
        name = pName;
        age = pAge;
    }
}