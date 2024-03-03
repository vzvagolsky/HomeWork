/*
### Задание: Разработка пользовательского класса коллекции в Java

**Цель задания:** Создать класс в Java, который функционирует как упрощенная коллекция,
аналогичная  `LinkedList`.
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


public class MyLinkedCollection {

    private Node head;
    private int size;

    public MyLinkedCollection() {
        this.head = null;
        this.size = 0;
    }

    public void add(Object element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void add(int index, Object element) {
        if (index < 0 || index > size) {
            System.out.println("Index is out of bounds.");
            return;
        }
        Node newNode = new Node(element);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index is out of bounds.");
            return;
        }
        if (index == 0) {
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }

    public int size() {
        return size;
    }
}






