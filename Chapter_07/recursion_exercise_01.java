public class recursion_exercise_01 {
    public static void main(String[] args){
        T2 t2 = new T2();
        System.out.println("当n=7,结果为" + t2.fibonacci(7));
        System.out.println("第1天桃子为" + t2.eat_peach(1));

    }
}
class T2 {
    public int fibonacci(int n) {
        if (n >= 1) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }
        else {
            System.out.println("有误");
            return -1;
        }
    }

    public int eat_peach(int n){
        if(n == 10){
            return 1;
        }
        else {
            return (eat_peach(n+1) + 1)*2;
        }
    }

}
