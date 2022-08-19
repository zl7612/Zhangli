public class this_exercise {
    public static void main(String[] args){
        Person_this p1 =new Person_this("nnn" , 20);
        Person_this p2 =new Person_this("mmm" , 30);
        System.out.println(p1.compareTo(p2));//p1是当前对象
    }
}
class Person_this{
    String name;
    int age;
    public Person_this(String name, int age){
        this.name =name;
        this.age = age;
    }
    public boolean compareTo(Person_this p){
        if(this.name.equals(p.name) && this.age == p.age){//此处this代表p1
            return true;
        }else {
            return false;
        }
    }
}