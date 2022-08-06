public class dowhile_exercise_03 {
    //统计1-200之间被5整除不被3整除的个数
    public static void main(String[] args){
        int i=1;
        int count=0;
        do {
            if (i % 5 == 0 && i % 3 != 0) {
                System.out.println("i=" + i);
                count++;

            }
            i++;
        }
        while(i<=200);
        System.out.println(count);
    }
}
