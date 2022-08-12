public class for_exercise_01 {
    public static void main(String[] args){
        int count = 0;
        int sum = 0;
        for(int i = 1 ; i <= 100 ; i++){
            if(i % 9 == 0){
                System.out.println(i);
                sum += i;
                count += 1;
            }
        }
        System.out.println(count);
        System.out.println(sum);
    }
}
