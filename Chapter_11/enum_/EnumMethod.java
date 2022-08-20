package enum_;

public class EnumMethod {
    public static void main(String[] args) {
        Season2 autumn = Season2.AUTUMN;
        System.out.println(autumn.name());
        System.out.println(autumn.ordinal());
        Season2.values();
        Season2 aut = Season2.valueOf("AUTUMN");
        System.out.println("sut = " + aut);
    }
}
