package poly;

public class DownCasting {
    public static void main(String[] args) {
        Parents poly = new Child();
        Parents parents = new Parents();
        Child child = new Child();
        poly.parents();
        ((Child)poly).childMethod();
        Child child2 = (Child)poly;
//        parents는 애초에 Parents타입으로 선언되어 Child 인스턴스가 존재하지 않기에 형변환이 되지 않는다
//        Child child3 = (Child)parents;
        child2.parents();
    }
}
