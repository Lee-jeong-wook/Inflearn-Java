package poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        Cat cat = new Cat();
//        Cow cow = new Cow();
        Animal[] animalArr = {new Dog(), new Cat(), new Cow()};
        for(Animal animal: animalArr){
            soundAnimal(animal);
        }
    }
    // 이코드는 만약 Animal 타입을 호출하거나 타입에 오버라이딩이 안되엉 ㅣㅆ을경우 내가 생각하는 동작을 하지 않는다
    public static void soundAnimal(Animal animal){
        System.out.println("테스트 시작");
        animal.sound();
        System.out.println("종료");
    }
}
