public class Homework_02 {
    public static void main(String[] args){
        String[] strs = {"js","hs","hg","uh"};
        String find = "js";
        A02 a02 = new A02();
        int index = a02.FindString(find , strs);
        System.out.println("索引"+index);
    }
}
class A02{
    public int FindString(String findStr , String[] strs){
        for(int i = 0 ; i < strs.length ; i++){
            if(strs[i].equals(findStr)){
                return i;
            }
        }
        return -1;
    }
}
//0251