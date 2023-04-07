// Реализуйте очередь с помощью LinkedList со следующими методами:
// • enqueue() — помещает элемент в конец очереди,
// • dequeue() — возвращает первый элемент из очереди и удаляет его,
// • first() — возвращает первый элемент из очереди, не удаляя.

import java.util.*;

public class Task2 {
    public static void main(String[] args) {

        Queue<String> list = new LinkedList<>();
        System.out.println(list);
        enqueue(list);
        enqueue(list);
        enqueue(list);
        enqueue(list);
        System.out.println(list);
        dequeue(list);
        System.out.println(list);
        first(list);
    }

    static void dequeue(Queue<String> list){      
        System.out.println("Первый элемент в очереди " + list.peek());
        list.poll();
        System.out.println("Элемент удален ");   
    }

    static void enqueue(Queue<String> list){
        System.out.println("Введите добавляемый в очередь элемент: ");
        Scanner scanner = new Scanner(System.in);
        String elem = scanner.nextLine();

        list.add(elem);

    }
    
    static void first(Queue<String> list){      
        System.out.println("Первый элемент в очереди " + list.peek());    
    }
}
