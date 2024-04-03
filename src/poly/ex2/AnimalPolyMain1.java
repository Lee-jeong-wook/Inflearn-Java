package poly.ex2;

public class AnimalPolyMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
    }
    public static void soundAnimal(Animal animal){
        System.out.println("테스트 시작");
        animal.sound();
        System.out.println("종료");
    }
}
