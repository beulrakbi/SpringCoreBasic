package hello.core.singleton;

public class StateFulService {
    //무상태로 하면 이렇게 설정해줄 필요가 없음
    //private int price;

    public int order(String name, int price){
        System.out.println("name = " + name + " price = " + price);
        //this.price=price; 변수에 담아줄 필요가 없음
        return price;
    }

    public void getPrice(){
//        return  price;
    }
}
