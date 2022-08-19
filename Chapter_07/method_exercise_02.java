public class method_exercise_02 {
    public static void main(String[] args){
        Mytools A = new Mytools();
        int Arr[][] = {{1, 2, 3},{2,3,4}};
        A.print(Arr);
    }
}
class Mytools{
    public void print(int[][] arr){
        for(int i = 0 ; i < arr.length ; i++){
            for (int j = 0 ; j < arr[i].length ; j++){
                System.out.print(arr[i][j] + "_");
            }
            System.out.println();
        }
    }
}
