import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new MyArrayList<>();
        list.add(3);
        list.add(5);
        list.add(4);
        list.add(6);
        list.add(4);
        list.add(2);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(4);
        for (int i = 0; i < list.size() ; i++){
            System.out.println(list.get(i) );
        }
        list.sort(Integer::compareTo);
        System.out.println("Hello World!");
        for (int i = 0; i < list.size() ; i++){
            System.out.println(list.get(i) );
        }



    }
}
