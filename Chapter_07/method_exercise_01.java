public class method_exercise_01 {
    public static void main(String[] args){
        AA a = new AA();
        boolean b = a.isOdd(1);
        System.out.println("布尔返回值" + b);
        a.printChar(4,4,'*');
    }
}
class AA{
    public boolean isOdd(int num){
        if(num % 2 != 0){
            return true;
        }
        else {
            return false;
        }
//        return num % 2 != 0 ? true ; false;
    }
    public void printChar(int row , int col , char c){
        for(int i = 0 ; i < row ; i++){
            for (int j = 0 ; j < col ; j++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
