//GENERIC CLASS WITH MULTIPLE TYPES

package generics;

class Pair<K, v>{
    private K key;
    private v value;

    Pair(K key, v value){
        this.key = key;
        this.value = value;
    }
    void display(){
        System.out.println(key + "-->" + value);
    }
}

public class Program2 {
    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(1 , "Shubham");
        Pair<String, Double> p2 = new Pair<>("kale" , 10.0);
        p1.display();
        p2.display();
    }
}
