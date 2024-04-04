package poly.car;

public class ModelCar implements Car{

    @Override
    public void startEngine() {
        System.out.println("모델 시작");
    }

    @Override
    public void offEngine() {
        System.out.println("모델 꺼짐");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("모델 눌림");
    }
}
