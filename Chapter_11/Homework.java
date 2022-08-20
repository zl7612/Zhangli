import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Color red = Color.RED;
        red.show();
//        Scanner myScanner = new Scanner(System.in);
//        System.out.println("ss:");
//        int T1 = myScanner.nextInt();
//        if(T1 == 1){
//            String T = "RED";
//        }
//        Color t = Color.T;
//        t.show();
    }
}

interface showcolor{
    public void show();
}

enum Color implements showcolor{
    RED(255,0,0),
    BLUE(0,0,255),
    BLACK(0,0,0),
    YELLOW(255,255,0),
    GREEN(0,255,0)
    ;
    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

//    public void show(){
//        System.out.println("属性值为 " + redValue + "," + greenValue + "," + blueValue);
//    }


    @Override
    public void show() {
        System.out.println("属性值为 " + redValue + "," + greenValue + "," + blueValue);
    }
}