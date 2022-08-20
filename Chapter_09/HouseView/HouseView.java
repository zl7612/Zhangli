package HouseView;

import Serive.HouseService;
import domain.House;
import utils.Utility;

public class HouseView {
    private boolean loop = true;
    private char key = ' '; //接收
    private HouseService houseService = new HouseService(10);

    //编写addHouse()
    public void addHouse(){
        System.out.println("========添加房屋========");
        System.out.println("姓名:");
        String name = Utility.readString(8);
        System.out.println("电话:");
        String phone = Utility.readString(12);
        System.out.println("地址:");
        String address = Utility.readString(16);
        System.out.println("月租:");
        int rent = Utility.readInt();
        System.out.println("状态");
        String state = Utility.readString(3);
        //创建一个新的Hous对象
        House house = new House(0, name, phone, address, rent, state);
        if(houseService.add(house)){
            System.out.println("========添加房屋成功========");
        }else {
            System.out.println("========添加房屋失败========");
        }
    }

    //编写delHouse
    public void delHouse(){
        System.out.println("========删除房屋信息========");
        System.out.println("请输入待删除房屋编号(-1退出)");
        int delId = Utility.readInt();
        if(delId == -1){
            System.out.println("========放弃删除房屋信息========");
            return;
        }
        System.out.println("请确认是否删除(Y/N)");
        char choice = Utility.readConfirmSelection();
        if(choice == 'Y'){
            if(houseService.del(delId)){ //为true
                System.out.println("========删除房屋信息成功========");
            }else{
                System.out.println("========房屋编号不存在========");
            }
        }else{
            System.out.println("========放弃删除房屋信息========");
        }
    }

    //退出确认
    public void exit(){
        char c = Utility.readConfirmSelection();
        if(c == 'Y'){
            loop = false;
        }
    }

    //查找功能
    public void findHouse(){
        System.out.println("========根据ID查找房屋信息========");
        System.out.println("请输入查找的房屋编号(-1退出)");
        int findId = Utility.readInt();
        House house = houseService.findById(findId);
        if(house != null){
            System.out.println(house);
        }else {
            System.out.println("没有查找到");
        }
    }

    //修改功能
    public void updateHouse(){
        System.out.println("========根据ID修改房屋信息========");
        System.out.println("请输入需要修改的房屋ID(-1退出)");
        int updateId = Utility.readInt();
        if(updateId == -1){
            System.out.println("========放弃修改房屋信息========");
            return;
        }

        //根据Id查找对象
        House house = houseService.findById(updateId);
        if(house == null){
            System.out.println("========需要修改的房屋信息不存在========");
            return;
        }
        System.out.println("姓名(" + house.getName() + "):");
        String name = Utility.readString(8 , "");
        if(!"".equals(name)){
            house.setName(name);
        }

        System.out.println("电话(" + house.getPhone() + "):");
        String phone = Utility.readString(12 , "");
        if(!"".equals(phone)){
            house.setPhone(phone);
        }

        System.out.println("地址(" + house.getAddress() + "):");
        String address= Utility.readString(18 , "");
        if(!"".equals(address)){
            house.setAddress(address);
        }

        System.out.println("租金(" + house.getRent() + "):");
        int rent = Utility.readInt(-1);
        if(rent != -1){
            house.setRent(rent);
        }

        System.out.println("状态(" + house.getState() + "):");
        String state = Utility.readString(8 , "");
        if(!"".equals(state)){
            house.setState(state);
        }

        System.out.println("修改成功");

    }

    public void listHouses(){
        System.out.println("========房屋列表========");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态");
        House[] houses = houseService.list();
        for(int i = 0 ; i < houses.length ; i++){
            System.out.println(houses[i]);
            if(houses[i] == null){
                break;
            }
        }
        System.out.println("========房屋列表显示完毕========");
    }


    public void mainMenu(){
        do{
            System.out.println("\n========房屋出租系统========");
            System.out.println("\t\t1 新增房源");
            System.out.println("\t\t2 查找房源");
            System.out.println("\t\t3 删除房屋信息");
            System.out.println("\t\t4 修改房屋信息");
            System.out.println("\t\t5 显示房屋信息");
            System.out.println("\t\t6 退出");
            System.out.println("请输入你的选择");

            key = Utility.readChar();
            switch (key){
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    updateHouse();
                    break;
                case '5':
                    listHouses();
                    break;
                case '6':
                    exit();
                    break;
            }
        }while(loop);
    }
}
