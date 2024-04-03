package poly.ex03;

public abstract class AbstractAnimal {
    // 추상 메서드는 반드시 오버라이딩 해야하기에 바디부분이 없다
    public abstract void sound();

    public void move(){
        System.out.println("동물이 움직입니다");
    }
}
