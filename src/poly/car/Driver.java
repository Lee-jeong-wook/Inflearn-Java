package poly.car;

public class Driver {
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void drive(){
        System.out.println("drive");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
