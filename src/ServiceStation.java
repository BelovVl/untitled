public class ServiceStation implements Service {
    @Override
    public void check(Bicycle bicycle) {
        if (bicycle != null) {
            System.out.println("Обслуживааем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                bicycle.updateTyre();
            }
        }
    }

    @Override
    public void check(Car car) {
        System.out.println("Обслуживааем " + car.getModelName());
        for (int i = 0; i < car.getWheelsCount(); i++) {
            car.updateTyre();
        }
    }


    @Override
    public void check(Truck truck) {
        System.out.println("Обслуживааем " + truck.getModelName());
        for (int i = 0; i < truck.getWheelsCount(); i++) {
            truck.updateTyre();
        }
        truck.checkEngine();
        truck.checkTrailer();
    }
}



