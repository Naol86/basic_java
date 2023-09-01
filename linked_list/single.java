package basic_java.linked_list;

import java.util.LinkedList;

public class single {
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<Integer>();
        num.add(1);
        num.add(2);
        num.add(1,10);

        System.out.println(num);
    }
}
