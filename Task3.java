// Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор

import java.util.*;

public class Task3 {
    
    public static void main(String[] args) {

        System.out.println("Список из какого количества элементов вы хотите создать: ");
        Scanner scanner = new Scanner(System.in);
        Integer col = scanner.nextInt();

        LinkedList<Integer> list = new LinkedList<>();
        Random rnd = new Random();
        for (int i = 0; i < col; i++) {
            list.add(i, rnd.nextInt(10));
        }
        System.out.println(list);
        Sum(list);
    }

    static void Sum(LinkedList<Integer> list){
        int sum = 0;
        ListIterator<Integer> iterator = list.listIterator(0);
            while (iterator.hasNext()){
                    sum = sum + iterator.next();
            }
        System.out.println("Сумма всех чисел в списке равна " + sum);    
    }
    
}
