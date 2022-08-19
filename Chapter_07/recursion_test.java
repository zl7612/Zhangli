public class recursion_test {
    public static void main(String[] args){
        T t1 = new T();
        t1.test(4);
        int res = t1.fac(5);
        System.out.println("res="+res);
    }
}
class T{
    public void test(int n){
        if(n > 2){
            test(n-1);
        }
        System.out.println("n=" + n);
    }

    public int fac(int n){
        if(n == 1){
            return 1;
        }
        else {
            return fac(n - 1) * n;
        }
    }
}
