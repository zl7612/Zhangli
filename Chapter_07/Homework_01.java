public class Homework_01 {
    public static void main(String[] args) {
        A01 a01 = new A01();
        double[] arr = {1.0, 5.2, 6.3, 8.5};
        Double res = a01.max(arr);
        if (res != null) {
            System.out.println("arr的最大值为" + res);
        }else {
            System.out.println("arr的输入有误");
        }

        //增加
        AA01 aa01 = new AA01();
        aa01.findmax(arr);

    }
}
class A01{
    public Double max(double[] arr) {
        if (arr != null && arr.length > 0) {
            double max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            return max;
        }else {
            return null;
        }
    }
}

//Try
class AA01{
    public void findmax(double[] arr){
        double maxNum = arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > maxNum){
                maxNum = arr[i];
            }
        }
        System.out.println("最大为" + maxNum);
    }
}