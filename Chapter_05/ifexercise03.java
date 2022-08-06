public class ifexercise03 {
    public static void main(String[] args){
        int year = 2022;
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}