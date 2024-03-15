/*
8 Создать ArrayDeque, добавить в него несколько элементов с каждой стороны,
извлечь элементы с одной из сторон и вывести на экран.


 */

import java.util.ArrayDeque;

public class Task08 {

       public static void main(String[] args) {
            ArrayDeque<String> deque = new ArrayDeque<>();

            // Добавляем элементы в начало и конец очереди
            deque.addFirst("First");
            deque.addLast("Last");
            deque.addFirst("New First");
            deque.addLast("New Last");
           //System.out.println(deque);



            // Извлекаем элементы с одной из сторон и выводим на экран
            while (!deque.isEmpty()) {
                System.out.println(deque.pollFirst());
            }
        }
    }







