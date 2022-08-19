package com.extend_;

public class PC extends computer{
    private String brand;

    //IDEA根据继承规则，自动把构造器调用写好
    public PC(String cpu, int memory, int disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void printInfo(){
        System.out.println("PC信息如下");
//        System.out.println(getCpu() + );
        System.out.println(getDetails() + " brand=" + brand);
    }
}
