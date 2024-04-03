package poly.override;

public class Child extends Parent{
    public String value = "자식";
    @Override
    public void method(){
        System.out.println("자식 메서드(오버라이드)");
    }
}
