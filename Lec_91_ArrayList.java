package hello.com;
import java.lang.reflect.Array;
import java.util.*;
public class Lec_91_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> L1 = new ArrayList<>();
        ArrayList<Integer> L2 = new ArrayList<>(5);
        L1.add(6);
        L1.add(7);
        L1.add(4);
        L1.add(6);
        L1.add(0, 5);
        L1.add(0, 1);
        L2.add(15);
        L2.add(18);
        L2.add(19);
        L1.addAll(0, L2);
//        L1.clear();
        System.out.println(L1.contains(5));
        System.out.println(L1.contains(20));
        System.out.println(L1.indexOf(5));
        System.out.println(L1.indexOf(15));
        System.out.println(L1.indexOf(6));
        System.out.println(L1.lastIndexOf(6));
        L1.set(1, 566);



        for (int i=0; i<L1.size(); i++){
            System.out.print(L1.get(i));
            System.out.print(", ");
        }

    }
}
