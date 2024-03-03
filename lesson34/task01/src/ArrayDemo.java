public class ArrayDemo {
    /*
    ## Домашнее задание

### Задание: Разработка пользовательского класса коллекции в Java

**Цель задания:** Создать класс в Java, который функционирует как упрощенная коллекция,
аналогичная `ArrayList` или `LinkedList`.
Этот класс должен поддерживать базовые операции добавления и удаления элементов.

#### Основные требования:

1. **Создание класса:** Разработайте класс, назовите его, например, `MyCollection`.
Этот класс должен использовать массив или другую структуру данных для хранения элементов.

2. **Вставка элементов:**
  - Реализуйте метод `add(E element)`, который добавляет элемент в конец коллекции.
  - Реализуйте метод `add(int index, E element)`, который вставляет элемент по
  - указанному индексу, сдвигая существующие элементы вправо.

3. **Удаление элементов:**
  - Реализуйте метод `remove(int index)`, который удаляет элемент по указанному индексу,
  - сдвигая последующие элементы влево.

4. **Дополнительно:**
  - Реализуйте метод `size()`, возвращающий текущий размер коллекции.
  - Обеспечьте корректную обработку нестандартных ситуаций, например,
при попытке добавления элемента по недопустимому индексу или удаления
из пустой коллекции.

5. **Тестирование:**
  - Создайте класс с методом `main` для демонстрации работы вашей коллекции.
Продемонстрируйте добавление, вставку и удаление элементов, а также вывод
размера коллекции.

#### Критерии оценки:

- **Функциональность:** Класс корректно реализует все запрошенные методы.
- **Корректность:** Программа обрабатывает краевые случаи, такие как вставка или удаление по недопустимым индексам.
- **Код:** Код должен быть чистым, хорошо структурированным и комментированным, чтобы облегчить понимание логики работы.

#### Рекомендации:

- Используйте массивы или связанные узлы в зависимости от выбранного вами аналога (`ArrayList` или `LinkedList`).
- Ваша коллекция должна работать с одним типом данных.
- Проверьте эффективность вашей реализации, особенно методы вставки и удаления, которые могут требовать перемещения элементов.
==========================================================



     */
    public static void main(String[] args) {
        MyArrayCollection Arraycollection = new MyArrayCollection();
        Arraycollection.add("First");
        Arraycollection.add("Second");
        Arraycollection.add("Third");

        System.out.println(Arraycollection);
/*
        MyArrayCollection Arraycollection2 = new MyArrayCollection();
        Arraycollection2.add(10);
        Arraycollection2.add(35);
        Arraycollection2.add(40);
*/
        Arraycollection.add(2,"Iserted1");
        System.out.println(Arraycollection);
        Arraycollection.add(40,"Iserted2");
        Arraycollection.add(3,"Iserted3");
        System.out.println(Arraycollection);
        Arraycollection.add(1,"Iserted4");
        System.out.println(Arraycollection);
        Arraycollection.add(0,"Iserted5");
        System.out.println(Arraycollection);
        Arraycollection.remove(2);
        System.out.println(Arraycollection);

    }
}