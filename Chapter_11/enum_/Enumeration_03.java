package enum_;

public class Enumeration_03 {
    public static void main(String[] args) {
        System.out.println(Season2.SPRING);
    }
}
//使用enum关键字
enum Season2{


//    public static Season SPRING = new Season("春" , "Sp");
//    public static Season SUMMER = new Season("夏" , "Su");
//    public static Season AUTUMN = new Season("秋" , "Au");
//    public static Season WINTER = new Season("冬" , "Wi");

    SPRING("春" , "Sp"),
    SUMMER("夏" , "Su"),
    AUTUMN("秋" , "Au"),
    WINTER("冬" , "Wi");
    private String name;
    private String desc;


    private Season2(String name, String desc) {
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