public class OverLoad_test_01 {
    public static void main(String[] args){
        OverLoad_test m = new OverLoad_test();
        m.m(10);
        m.m(1,2);
        m.m("werf");
        OverLoad_test mm = new OverLoad_test();
        System.out.println(mm.mm(2,3));
        System.out.println(mm.mm(2.1,3.5));
        System.out.println(mm.mm(3.5,5.2,6.3));
    }
}

//重载 java 中允许同一个类中，多个同名方法的存在，但要求形参列表不一致

class OverLoad_test{
    public void m(int n){
        System.out.println("平方" + (n*n));
    }
    public void m(int n1, int n2){
        System.out.println("乘积" + (n1*n2));
    }
    public void m(String str){
        System.out.println(str);
    }

    public int mm(int n1 , int n2){
        if(n1 > n2){
            return n1;
        }
        else {
            return n2;
        }
    }
    public double mm(double n1 , double n2){
        if(n1 > n2){
            return n1;
        }
        else {
            return n2;
        }
    }
    public double mm(double n1 , double n2 , double n3){
        if(n1 > n2 && n1 > n3){
            return n1;
        }
        else if(n2 > n1 && n2 > n3){
            return n2;
        }
        else {
            return n3;
        }
    }
}
