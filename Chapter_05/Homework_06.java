public class Homework_06 {
    //输出1-100间不能被5整除的数，5个一行
    public static void main(String[] args){
        int count = 0;
        for(int i = 1;i<=100;i++){
            if(i%5!=0){
                count++;
                System.out.print(i+" ");
                if(count%5==0){
                    System.out.println();
                }
            }
        }
    }
}
