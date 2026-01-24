package generics;

class Box<T>{
    private T value;
    Box(T value){
        this.value = value;
    }
    T getValue(){
        return value;
    }
}
public class Program1 {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>(10);
        System.out.println(box.getValue());

        Box<String> box2 = new Box<>("Shubham");
        System.out.println(box2.getValue());
    }
}

