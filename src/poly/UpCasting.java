package poly;

public class UpCasting {
    public static void main(String[] args){
        Child child = new Child();
        Parents parents1 = (Parents) child; //업캐스팅은 생략 가능, 생략 권장
        Parents parents2 = child;

        parents1.parents();
        parents2.parents();
    }
}
