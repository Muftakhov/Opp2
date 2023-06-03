package pro.sky.java.homeworks.course2.lesson1;

public abstract class BicycleTransport implements Transport {
   private String modelName;
   private int wheelsCount;

    public BicycleTransport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    @Override
    public  void service () {
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }
}

