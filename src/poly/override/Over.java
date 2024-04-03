package poly.override;

public class Over {
    public static void main(String[] args){
        Child child = new Child();
        System.out.println("자식 - 자식");
        System.out.println("value = " + child.value);
        child.method();

        //부모변수가ㅣ부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("부모 - 부모");
        System.out.println("value = " + parent.value);
        parent.method();
        
        Parent poly1 = new Child();
        System.out.println("부모 - 자식");
        System.out.println("value = " + poly1.value);
        //오버라이딩 된 메서드는 항상 우선권을 가진다
        //자식에서 오버라이딩하고, 손자에서도 오버라이딩하면 손자가 우선순위가 가장 높다
        poly1.method();

        Child poly2 = (Child) poly1;
        System.out.println("자식 - 자식 인스턴스 가진 부모");
        System.out.println("value = " + poly2.value);
        poly2.method();
    }
}
