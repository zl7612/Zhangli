public class Homework_09 {
    public static void main(String[] args){
        Music music = new Music("歌" , 300);
        music.play();
        System.out.println(music.getinfo());
    }
}
class Music{
    String name;
    double times;
    public Music(String name , double times){
        this.name = name;
        this.times = times;
    }
    public void play(){
        System.out.println("音乐" + name + "正在播放……时长为" + times + "秒");
    }
    public String getinfo(){
        return name + " " + times;
    }
}