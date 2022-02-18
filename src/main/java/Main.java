import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyList<People> list = new MyArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 99;i++){
            list.add(new People("Человек" + 1,r.nextInt(60)+1));
        }
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }



    }
}
