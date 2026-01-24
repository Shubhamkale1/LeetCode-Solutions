package oops.polymorphism;

//class C{
//    final void show(){
//        System.out.println("c");
//    }
//}
//
//class D extends C{
//    void test(){
//        show();
//    }
//}

class Box {
    double width;
    void show() {
        System.out.println("Box");
    }
}
class BoxWeight extends Box {
    double weight;
    void printWeight() {
        System.out.println(weight);
    }
}
public class Program2 {
    public static void main(String[] args) {

        Box ref = new BoxWeight(); // allowed but we only access Box Method [Access depends on reference type, not object type]
        double width = ref.width;
        System.out.println(width);
        ref.show();

        Box ref2 = new Box();
        double width2 = ref2.width;
        System.out.println(width2);
        ref2.show();

        BoxWeight ref3 = new BoxWeight();
        double weight3 = ref3.weight;
        System.out.println(weight3);
        ref3.show();
        double weight4 = ref3.weight;
        System.out.println(weight4);
        ref3.printWeight();

//        BoxWeight ref5 = new Box();    // not allowed


    }
}
