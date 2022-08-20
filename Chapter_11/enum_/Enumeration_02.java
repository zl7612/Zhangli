package enum_;

public class Enumeration_02 {
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN);
    }
}

//自定义枚举
class Season{
    private String name;
    private String desc;

    public static Season SPRING = new Season("春" , "Sp");
    public static Season SUMMER = new Season("夏" , "Su");
    public static Season AUTUMN = new Season("秋" , "Au");
    public static Season WINTER = new Season("冬" , "Wi");

    //1.构造器私有化
    //2.去掉setXXX方法
    //3.在Season内部创建固定的对象
    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }


    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}