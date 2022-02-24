import javax.swing.*;

public class Hello {

    String nameOfTheMan = "Ivan";
    int height = 186;

    public static void main(String[] args) {

        System.out.println("Hello World " + args[0]);
        Car myCar;
        myCar = new Car();
        myCar.setPrice(20_000_000);
        System.out.println(myCar.getPrice());
        System.out.println(myCar.model);

    }
}

class Car {

    int price = 1000;
    String model = "BMW X6";

    public int getPrice() {
        return price;
    }

    public void setPrice(int newPrice) {
        price = newPrice;
    }

}