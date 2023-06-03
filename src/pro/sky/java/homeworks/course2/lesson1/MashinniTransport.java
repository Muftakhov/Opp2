package pro.sky.java.homeworks.course2.lesson1;
public abstract class MashinniTransport extends BicycleTransport {
    public  MashinniTransport (String modelName,int wheelsCount ) {
        super(modelName, wheelsCount);
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public  void service () {
        super.service();
        checkEngine();
    }
}
