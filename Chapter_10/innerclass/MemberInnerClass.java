package innerclass;

public class MemberInnerClass {
    public static void main(String[] args) {
        Outer08 outer08 = new Outer08();
        outer08.t1();
    }
}

class Outer08{
    private int n1 = 10;
    public String name = "ss";
    class Inner08{
        public void say(){
            System.out.println("Outer08 的 n1 = " + n1 + " Outer08 的 name = " + name);
        }
    }

    public void t1(){
        Inner08 inner08 = new Inner08();
        inner08.say();
    }
}