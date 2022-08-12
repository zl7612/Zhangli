public class Homework_05 {
    //随机生成10个整数，1-100，倒序打印，求平均，求最大最小值的下标，查找是否有8
    public static void main(String[] args) {
        int sum = 0;
        int a[] = new int[10];
        for (int i = 1; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100) + 1;
        }
        for (int i = 0; i < a.length; i++) {
            sum += a[i]; //求和
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = a.length - 1; i >= 0; i--) {//倒序
            System.out.print(a[i] + " ");
        }

        //求平均
        System.out.println();
        System.out.println("平均为" + (sum / 10));

        //找最大最小
        int max = a[0];
        int min = a[9];
        int maxindex = 0;
        int minindex = 9;
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
                maxindex = i;
            }
        }
        System.out.println("最大值为" + max + "下标为" + maxindex);

        for (int i = 0; i < a.length - 1; i++) {
            if (min > a[i]) {
                min = a[i];
                minindex = i;
            }
        }
        System.out.println("最小值为" + min + "下标为" + minindex);

        //查找8
        for (int i = 0; i < a.length; i++) {
            if(a[i] == 8){
                System.out.println("含有8");
                break;
            }
            else {
                System.out.println("不含8");
                break;
            }
        }
    }
}
