// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список.

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        
        LinkedList<String> list = new LinkedList<>();
        LinkedList<String> list2 = new LinkedList<>();
        list.add(0,"Moscow");
        list.add(1,"Minsk");
        list.add(2,"Warsaw");
        list.add(3,"Paris");
        list.add(4,"Bern");
        System.out.println(list);
        reverse(list, list2);
    }

    static void reverse(LinkedList<String> list, LinkedList<String> list2 ){
        ListIterator<String> iterator = list.listIterator(list.size());
            while (iterator.hasPrevious()){
                    list2.add(iterator.previous());
            }
        System.out.println(list2);
    }
}
