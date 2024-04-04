package poly.car;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver();

        K3Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.drive();

        ModelCar modelCar = new ModelCar();
        driver.setCar(modelCar);
        driver.drive();

    }
}
