/*
请编写一个猜拳的游戏
有个人Tom 对象，设计他的成员变量. 成员方法, 可以电脑猜拳. 电脑每次都会随机生成 0, 1, 2
0 表示 石头 1 表示剪刀 2 表示 布
并要可以显示 Tom的输赢次数（清单）, 假定 玩三次.
 */

import java.util.Random;
import java.util.Scanner;

public class Homework_14 {
    public static void main(String[] args){
        //0石头1剪刀2布
        Tom tom = new Tom();
        int iswinCount = 0;
        int[][] arr1 = new int[3][3];
        int j = 0;

        // 创建一个一维数组，用来接收输赢情况
        String[] arr2 = new String[3];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {   //比赛3次
            System.out.println("请输入你要出的拳（0-拳头，1-剪刀，2-布）：");
            int num = scanner.nextInt();
            tom.setTomGuess(num);
            int tomGuess = tom.getTomGuess();
            arr1[i][j + 1] = tomGuess;//出的情况汇总的二维表格中

            // 获取电脑出的拳
            int comGuess = tom.computerNum();
            arr1[i][j + 2] = comGuess;

            // 将玩家猜的拳与电脑做比较
            String isWin = tom.vsComputer();
            arr2[i] = isWin;
            arr1[i][j] = tom.count;

            // 对每一局的情况进行输出
            System.out.println("=========================================");
            System.out.println("局数\t玩家的出拳\t电脑的出拳\t输赢情况");
            System.out.println(tom.count + "\t" + tomGuess + "\t\t" + comGuess + "\t\t" + tom.vsComputer());
            System.out.println("=========================================");
            System.out.println("\n\n");
            iswinCount = tom.winCount(isWin);
        }
        scanner.close();//关闭扫描器，它一直在占用资源，因此使用完毕后要关闭

        // 对游戏的最终结果进行输出（二维表格）
        System.out.println("局数\t玩家的出拳\t电脑的出拳\t\t输赢情况");
        for (int a = 0; a < arr1.length; a++) {
            for (int b = 0; b < arr1[a].length; b++) {
                System.out.print(arr1[a][b] + "\t\t\t");
            }

            System.out.print(arr2[a]);
            System.out.println();
        }
        System.out.println("你赢了" + iswinCount + "次");
    }
}
//0261

class Tom{
    int tomGuess;
    int comGuess;
    int winCount;
    int count = 1;

    public void showInfo(){

    }

    public int computerNum(){
        Random random = new Random();
        comGuess = random.nextInt(3);
        return comGuess;
    }

    public void setTomGuess(int tomGuess){
        this.tomGuess = tomGuess;
    }

    public int getTomGuess() {
        return tomGuess;
    }

    public String vsComputer() {
        //比较巧
        if (tomGuess == 0 && comGuess == 1) {
            return "你赢了";
        } else if (tomGuess == 1 && comGuess == 2) {
            return "你赢了";
        } else if (tomGuess == 2 && comGuess == 0) {
            return "你赢了";
        } else if (tomGuess == comGuess){
            return "平手";
        } else {
            return "你输了";
        }
    }

    public int winCount(String s) {
        count++;    //控制玩的次数
        if (s.equals("你赢了")) {     //统计赢的次数
            winCount++;
        }
        return winCount;
    }
}