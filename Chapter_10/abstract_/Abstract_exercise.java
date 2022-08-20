package abstract_;

public class Abstract_exercise {
    public static void main(String[] args) {
        Manager_exercise jack = new Manager_exercise("jack", 555, 8596.3);
        jack.setBonus(8000);
        jack.work();
        jack.money();

        Common_exercise tom = new Common_exercise("tom", 556, 5555);
        tom.work();
        tom.money();
    }
}

