package abstract_;

public class Manager_exercise extends Employee_exercise{
    private double bonus;

    public Manager_exercise(String name, int id, double salary) {
        super(name, id, salary);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("经理" + getName() + " 工作中");
    }

    @Override
    public void money() {
        System.out.println("工资为：" + getSalary() * 12 + getBonus());
    }
}
