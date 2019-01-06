package day3;

public class TestCar {
    public static void main(String[] args) {
        Car car = new Car("BMW", "yellow", 350);
        Car car1 = new Car("Jaguar", "red", 400);
        Car car3  = new Car("Maluch", "czerwony", 30);
//        car.setName("BMW");
//        car.setColor("yellow");
//        car.setHorsePower(350);
    //    System.out.println(car.getName() + " : " + car.getColor() + " : " + car.getHorsePower());
        System.out.println(car);
//        car.setName("Jaguar");
        System.out.println(car1);
        System.out.println(car3);


    }
}
