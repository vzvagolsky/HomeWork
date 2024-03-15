/*

Задача 3: Преобразование списка объектов и агрегация

Задание: Дан список объектов заказов (Order), где каждый заказ
содержит список покупок (List<Purchase>) и дату заказа.
Каждая покупка содержит название товара и его стоимость.
Необходимо рассчитать общую сумму стоимости всех покупок,
сделанных в текущем месяце.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Double.sum;

public class Task03 {
    public static void main(String[] args) {// Создание списка заказов
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("20240310",
                List.of(new Purchase("Товар1", 100.0),
                        new Purchase("Товар2", 200.0))));

        orders.add(new Order("20240315",
                List.of(new Purchase("Товар3", 150.0),
                        new Purchase("Товар4", 250.0))));

        orders.add(new Order("20240220",
                List.of(new Purchase("Товар5", 300.0),
                        new Purchase("Товар6", 400.0))));


      //  String str1="20240315".substring(4, 6);
        //System.out.println(str1);



// Создание списка заказов
        // Рассчет общей суммы стоимости всех покупок, сделанных в текущем месяце
        double totalCost = orders.stream()
                .filter(order -> order.getDate().substring(4,6).equals("03"))
                // фильтруем заказы, сделанные в марте (03 - номер месяца)
                .flatMap(order -> order.getPurchases().stream()) // объединяем все покупки из всех заказов в один поток
                .mapToDouble(Purchase::getSumTovar)
        // получаем значения стоимостей покупок в виде примитивов double
                .sum(); // вычисляем сумму всех стоимостей покупок


        System.out.println(totalCost);

/*
        List<Order> orders2= orders.stream()
                .filter(order -> order.getDate().substring(4,6).equals("03"))
                // .flatMap(order -> order.getPurchases().stream())
                .collect(Collectors.toList());
        ;
        List<Purchase> orders3 = orders.stream()
                .filter(order -> order.getDate().substring(4,6).equals("03"))
                .flatMap(order -> order.getPurchases().stream()) // Переходим к потоку покупок
                .collect(Collectors.toList()); // Со


        System.out.println(orders2);
        */
    }
}