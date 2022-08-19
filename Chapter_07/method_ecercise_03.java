public class method_ecercise_03 {
    public static void main(String[] args){
        Personn p = new Personn();
        p.name = "ssddsd";
        p.age = 87;
        Mytool tools = new Mytool();
        Personn p2 = tools.copyPerson(p);
        System.out.println("p:"+p.name+p.age);
        System.out.println("p2:"+p2.name+p2.age);
    }
}
class Personn{
    String name;
    int age;
}

class Mytool{
    public Personn copyPerson(Personn p){
        Personn p2 = new Personn();
        p2.name = p.name;
        p2.age = p.age;
        return p2;
    }
}
