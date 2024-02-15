
public class AutoShop {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(120, 20000, "Blue", 25);
        Ford ford1 = new Ford(140, 30000, "Red", 2010, 5000);
        Ford ford2 = new Ford(160, 35000, "Black", 2015, 6000);
        Car car = new Car(100, 15000, "Green");

        System.out.println("Sale price of Sedan: $" + sedan.getSalePrice());
        System.out.println("Sale price of Ford 1: $" + ford1.getSalePrice());
        System.out.println("Sale price of Ford 2: $" + ford2.getSalePrice());
        System.out.println("Sale price of Car: $" + car.getSalePrice());
    }
}