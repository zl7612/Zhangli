public class Homework_07 {
    public static void main(String[] args){
        int[] arr = {24, 69, 80, 57, 13, -1, 30, 200, -110};
        int temp = 0; //用于辅助交换的变量
        for(int i = 0 ; i < arr.length - 1 ; i++){//外层循环数组长度-1次
            for(int j = 0 ; j < arr.length - 1 - i ; j++){//内层循环需要比较次数逐渐减少，大数已经比较完成，-i可有可无
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
