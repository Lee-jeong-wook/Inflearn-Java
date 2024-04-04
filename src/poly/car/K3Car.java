package poly.car;

public class K3Car implements Car{

    @Override
    public void startEngine() {
        System.out.println("K3 시작");
    }

    @Override
    public void offEngine() {
        System.out.println("K3 꺼짐");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("K3 눌림");
    }
}
