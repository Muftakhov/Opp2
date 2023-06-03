package pro.sky.java.homeworks.course2.lesson1;

public class Truck extends MashinniTransport {
    public Truck (String modelName){
        super(modelName, 6);
    }
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
    @Override
    public void service() {
        super.service();
        checkTrailer();
    }
}
