/*
 9 Создать TreeMap, где ключом является число типа Integer,
 а значением - его факториал. Вывести на экран все элементы TreeMap.



 */

import java.util.*;
public class Task09 {


        public static void main(String[] args) {
            TreeMap<Integer, Integer> factorialMap = new TreeMap<>();

            // Вычисляем факториалы и добавляем их в TreeMap
            for (int i = 1; i <= 10; i++) {
                int factorial = getFactorial(i);
                factorialMap.put(i, factorial);
            }

            // Выводим все элементы TreeMap
            for (Map.Entry<Integer, Integer> entry : factorialMap.entrySet()) {
                System.out.println("Число: " + entry.getKey() + ", Факториал: " + entry.getValue());
            }
        }

        // Метод для вычисления факториала числа
        private static int getFactorial(int n) {
            if (n == 0) {
                return 1;
            }
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial = factorial*i;
            }
            return factorial;
        }
    }

