
/*

7 Создать Stack, добавить в него несколько элементов.
Проверить есть ли в коллекции заданный элемент.
Если есть,то найти его глубину и вывести на экран.

 */
import java.util.Stack;
public class Task07 {


        public static void main(String[] args) {
            Stack<Integer> stack = new Stack<>();

            // Добавляем элементы в стек
            stack.push(15);
            stack.push(6);
            stack.push(70);
            stack.push(4);
            stack.push(9);

            // Элемент, который мы ищем
            int target = 15;

            // Проверяем, содержится ли заданный элемент в стеке
            if (stack.contains(target)) {
                // Находим индекс заданного элемента в стеке
                int depth = stack.search(target);
                System.out.println("Глубина элемента " + target + " в стеке: " + depth);
            } else {

                System.out.println("Элемент " + target + " не найден в стеке.");
            }




        }
    }





