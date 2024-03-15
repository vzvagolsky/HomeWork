/*

 Дана коллекция Product - название, категория, цена,
 количество на складе.
   Найти среднюю цену продуктов каждой категории,
   у которых количество превышает заданное значение
   и отсортировать по убыванию цены
 */

import java.util.*;
import java.util.stream.Collectors;

public class task07 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Ноутбук", "Электроника", 1500.0, 15));
        products.add(new Product("Фотоаппарат", "Электроника", 800.0, 20));
        products.add(new Product("Футболка", "Одежда", 20.0, 30));
        products.add(new Product("Джинсы", "Одежда", 50.0, 25));


        // Заданное значение количества продуктов
        int minQuantity = 10;

        // Сначала фильтруем продукты по количеству
        Map<String, Double> averagePricesByCategory = products.stream()
                .filter(p -> p.getQuantity() > minQuantity)
                .collect(Collectors.groupingBy(p -> p.getCategory(),
                        Collectors.averagingDouble(p -> p.getPrice())));;

        // Теперь сортируем результаты по убыванию средней цены22
        averagePricesByCategory.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);

    }
}