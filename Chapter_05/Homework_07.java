public class Homework_07 {
    //输出小写的a-z 大写的Z-A
    public static void main(String[] args) {
        for (char c1 = 'a'; c1 <= 'z'; c1++) {
            System.out.print(c1 + " ");
        }
        for (char c2 = 'Z'; c2 >= 'A'; c2--) {
            System.out.print(c2 + " ");
        }
    }
}
