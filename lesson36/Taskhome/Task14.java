/*
4   Создать очередь PriorityQueue и добавить в нее несколько элементов,
у которых есть свойства name и priority.
        Затем извлечь элементы из очереди в порядке приоритета
         и вывести их на консоль.


 */


import java.util.PriorityQueue;

public class Task14 {
    public static void main(String[] args) {
        // Создание очереди PriorityQueue с пользовательским компаратором
        PriorityQueue<Task> priorityQueue = new PriorityQueue<>
                (new TaskComparator());

        // Добавление элементов в очередь
        priorityQueue.offer(new Task("Task 1", 3));
        priorityQueue.offer(new Task("Task 2", 1));
        priorityQueue.offer(new Task("Task 3", 2));

        // Извлечение элементов из очереди и вывод на консоль
        while (!priorityQueue.isEmpty()) {
            Task task = priorityQueue.poll();
            System.out.println(task);
        }
    }

}
