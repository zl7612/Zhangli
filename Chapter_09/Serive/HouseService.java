package Serive;

import domain.House;

public class HouseService {
    private House[] houses;
    private int houseNums = 1;
    private int idCounter = 1;//记录id自增到哪个值
    public HouseService(int size){
        houses = new House[size];
        houses[0] = new House(1 , "jack" , "5869" , "海淀区" , 2000 , "未出租");
    }

    //del方法
    public boolean del(int delId){
        //找到对应下标
        int index = -1;
        for(int i = 0 ; i < houseNums ; i++){
            if(delId == houses[i].getId()){
                index = i ;
            }
        }
        if(index == -1){
            return false;
        }
        //如果找到，删除
        for(int i = index ; i < houseNums-1 ; i++){
            houses[i] = houses[i+1];

        }
        houses[houseNums - 1] = null;
        houseNums--;
        return true;
    }

    //findHouse方法
    public House findById(int findId){
        for(int i = 0 ; i < houseNums ; i++){
            if(findId == houses[i].getId()){
                return houses[i];
            }
        }
        return null;
    }

    //updateHouse方法



    public House[] list(){
        return houses;
    }

    public boolean add(House newhouse){
        //判断是否还可以继续添加
        if(houseNums >= houses.length){
            System.out.println("数组已满");
            return false;
        }
        houses[houseNums] = newhouse;
        houseNums++;
        //id自增长
        idCounter++;
        newhouse.setId(idCounter);
        return true;
    }
}
