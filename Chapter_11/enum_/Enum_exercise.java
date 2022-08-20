package enum_;

public class Enum_exercise {
    public static void main(String[] args) {
        Week[] weeks = Week.values();
        for(Week week:weeks){
            System.out.println(week);
        }
    }
}


enum Week{
    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THUESDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期天");
    private String name;

    private Week(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}