import java.util.Scanner;
//视频采用了this

public class Homework_03 {
    public static void main(String[] args){
        Scanner OLD = new Scanner(System.in);
        System.out.println("输入价格");
        int OLD_Price = OLD.nextInt();
        Book book_price = new Book();
        int NEW_proce = book_price.updatePrice(OLD_Price);
        System.out.println("新价格为" + NEW_proce);
    }
}
class Book{
    public int updatePrice(int old_price){
        if(old_price > 150){
            return 150;
        }
        else if(old_price > 100 && old_price < 150){
            return 100;
        }
        else {
            return old_price;
        }
    }
}