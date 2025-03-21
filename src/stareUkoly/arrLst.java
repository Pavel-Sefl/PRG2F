package stareUkoly;

import java.util.ArrayList;

public class arrLst {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(34);
        al.add(56);
        al.add(78);
        al.add(90);

        al.set(3, 87);

        System.out.println(al);

        System.out.println(al.get(2));

        System.out.println(al.remove(1));

        System.out.println(al);
    }
}
