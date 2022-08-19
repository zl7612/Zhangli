public class Homework_07 {
    public static void main(String[] args){
        DOG dog = new DOG("TG",85,"huang");
        dog.Shoe();
        dog.show2();

    }
}
class DOG{
    String name;
    int age;
    String color;
    public DOG(String name , int age , String color){
        this.name = name;
        this.age = age;
        this. color = color;
    }
    public void Shoe(){
        System.out.println(this.name + "\t" + this.color + "\t" + this.age);
    }
    public void show2(){
        System.out.println(name + " " + age + " " + color);
    }
}