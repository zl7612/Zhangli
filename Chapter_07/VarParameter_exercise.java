public class VarParameter_exercise {
    public static void main(String[] args){
        VP vp = new VP();
        System.out.println(vp.showscore("jh" , 90 , 62));
    }
}
class VP{
    public String showscore(String name , double...nums){
        double total = 0;
        for(int i = 0 ; i < nums.length ; i++){
            total += nums[i];
        }
        return name + total;
    }
}
