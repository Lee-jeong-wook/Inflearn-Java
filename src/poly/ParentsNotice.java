package poly;

public class ParentsNotice {
    public static void main(String[] args){
        Parents parents1 = new Child();
        Child child1 = (Child) parents1;
        child1.childMethod(); //문제 없음
        Parents parents2 = new Parents();
        Child child2 = (Child) parents2; // class cast Exception
//        child2.childMethod(); 실행 불가 메모리상에 child 타입 자체가 없음
        //업캐스팅은 메모리상에 인스턴스가 모두 존재하기에 안전
    }
}
