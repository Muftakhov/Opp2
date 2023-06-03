import pro.sky.java.homeworks.course2.lesson1.*;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Машина1");
        Car car2 = new Car("Машина2");

        Truck truck1 = new Truck("Грузовая машина №1");
        Truck truck2 = new Truck("Грузовая машина №2",6);

        Bicycle bicycle1 = new Bicycle("Велосипед №1");
        Bicycle bicycle2 = new Bicycle("Велосипед №2");

        Transport[] transports = {
                car1,car2,
                truck1,truck2,
                bicycle1, bicycle2
        };
        ServiceStation serviceStation = new ServiceStation();
        System.out.println("__________________________");
        for(Transport transport : transports) {
            serviceStation.check(transport);
            System.out.println("__________________________");
        }
    }



}