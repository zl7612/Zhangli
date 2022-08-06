public class Homework_01 {
    public static void main(String[] args){
        double i = 100000;
        int j = 0;
        while(i>0){
            if(i>50000){
                i = i*0.95;
                j++;
            }
            else if(i>1000 && i<=50000){
                i-=1000;
                j++;
            }
            else {
                break;
            }

        }
        System.out.println("可以过的路口数量："+j);
    }
}
