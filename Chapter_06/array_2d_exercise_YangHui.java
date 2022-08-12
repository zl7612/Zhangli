public class array_2d_exercise_YangHui {
    public static void main(String[] args){
        /*
			规律
			1.第一行有 1 个元素, 第 n 行有 n 个元素
			2. 每一行的第一个元素和最后一个元素都是 1
			3. 从第三行开始, 对于非第一个元素和最后一个元素的元素的值. arr[i][j]
			arr[i][j] = arr[i-1][j] + arr[i-1][j-1]; //必须找到这个规律
		*/
        int[][] yangHui = new int[12][];
//        System.out.println(yangHui.length); //12
        for(int i = 0; i < yangHui.length; i++) {//遍历 yangHui 的每个元素
            //给每个一维数组(行) 开空间
            yangHui[i] = new int[i+1];
            //给每个一维数组(行) 赋值
            for(int j = 0; j < yangHui[i].length; j++){
                //每一行的第一个元素和最后一个元素都是 1
                if(j == 0 || j == yangHui[i].length - 1) {
                    yangHui[i][j] = 1;
                } else {//中间的元素
                    yangHui[i][j] = yangHui[i-1][j] + yangHui[i-1][j-1];
                }
            }
        }
        //输出杨辉三角
        for(int i = 0; i < yangHui.length; i++) {
            for(int j = 0; j < yangHui[i].length; j++) {//遍历输出该行
                System.out.print(yangHui[i][j] + "\t");
            }
            System.out.println();//换行.
        }
    }
}
