public class ifexercise02 {
    public static void main(String[] args){
        int d1 = 15;
        int d2 = 10;
        int sum = d1 + d2;
        if(sum % 3 == 0 && sum % 5 == 0){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}