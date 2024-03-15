
/*
6 Создать PriorityQueue из 10 элементов типа Integer,
 добавить несколько элементов, извлечь минимальный элемент и вывести на экран.

*/
import java.util.*;
public class Task06 {

    public static void main(String[] args) {
        // Создаем PriorityQueue для хранения элементов типа Integer
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();


        priorityQueue.offer(45);
        priorityQueue.offer(67);
        priorityQueue.offer(89);
        priorityQueue.offer(8);
        priorityQueue.offer(9);
        priorityQueue.offer(34);


        // Добавляем еще несколько элементов
        priorityQueue.offer(4);
        priorityQueue.offer(15);

        System.out.println(priorityQueue);

        // Извлекаем минимальный элемент
        int minElement = priorityQueue.poll();

        // Выводим минимальный элемент на экран
        System.out.println("Минимальный элемент: " + minElement);




    }


    }


