public class break_exercise_01 {
    public static void main(String[] args){
        int sum=0;
        for(int i=1;i<=100;i++){
            sum += i;
            if(sum>20){
                System.out.println("当前数i="+i);
                break;
            }
        }
    }
}
