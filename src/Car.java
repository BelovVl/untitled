public class Car extends Traffic {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("проверяем двигатель");
    }
}
