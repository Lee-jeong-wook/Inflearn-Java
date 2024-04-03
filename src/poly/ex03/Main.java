package poly.ex03;

public class Main{

    public static void main(String[] args) {
        //인스턴스 생성 불가
//        AbstractAnimal abstractAnimal = new AbstractAnimal();
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.sound();
        cat.move();
        dog.sound();
        dog.move();
    }
}
