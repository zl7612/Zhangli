package com.polyparameter;

public class polyParameter {
    public static void main(String[] args) {
//        "hello".equals("abc");
        Worker tom = new Worker("tom", 2500);
        Manager jaack = new Manager("jaack", 5000, 200000);
        polyParameter polyParameter = new polyParameter();
        polyParameter.showEmpAnnual(tom);
        polyParameter.showEmpAnnual(jaack);

        polyParameter.testwork(tom);
    }
    public void showEmpAnnual(Employee e){
        System.out.println(e.getAnnual());
    }
    public void testwork(Employee e){
        if(e instanceof Worker){
            ((Worker) e).work();//向下转型
        }else if(e instanceof Manager){
            ((Manager) e).manage();
        }else{
            System.out.println("不做处理");
        }
    }
}
