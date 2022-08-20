package abstract_;

public class Common_exercise extends Employee_exercise{
    public Common_exercise(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("工人" + getName() + " 工作中");
    }

    @Override
    public void money() {
        System.out.println("工资为：" + getSalary() * 12);
    }
}
