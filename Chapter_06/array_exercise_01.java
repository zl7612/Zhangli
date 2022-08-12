public class array_exercise_01 {
    public static void main(String[] args){
        char[] chars = new char[26];
        for(int i = 0 ; i< chars.length ; i++){
            chars[i] = (char)('A' + i);//A+i是int，需要转换
        }
        for(int i = 0 ; i < chars.length ; i++){
            System.out.print(chars[i] + " ");
        }
    }
}
