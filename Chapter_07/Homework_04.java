public class Homework_04 {
    public static void main(String[] args){
        A03 a03 = new A03();
        int[] oldArr = {30,40,50};
        int[] newArr = a03.copyArr(oldArr);
        for(int i = 0 ; i < newArr.length ; i++){
            System.out.print(newArr[i] + " ");
        }
    }
}
class A03{
    public int[] copyArr(int[] oldArr){
        int[] newArr = new int[oldArr.length];
        for(int i = 0 ; i < oldArr.length ; i++){
            newArr[i] = oldArr[i];
        }
        return newArr;
    }
}