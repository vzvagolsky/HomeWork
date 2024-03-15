/*

Создать класс Book со свойствами title, author и year (год издания),
затем создать список LinkedList, заполнить
        его несколькими объектами Book и удалить из списка все книги,
        которые были изданы до 2000 года.

 */

import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class Task15 {



        public static void main(String[] args) {
            // Создание списка книг
            List<Book> books = new LinkedList<>();

            // Добавление книг в список
            books.add(new Book("Book 1", "Author 1", 1995));
            books.add(new Book("Book 2", "Author 2", 2005));
            books.add(new Book("Book 3", "Author 3", 1990));
            books.add(new Book("Book 4", "Author 4", 2010));

            // Удаление книг, изданных до 2000 года
            Iterator<Book> iterator = books.iterator();
            while (iterator.hasNext()) {
                Book book = iterator.next();

                if (book.getYear() < 2000) {
                    iterator.remove();
                }
            }

            // Вывод оставшихся книг на экран
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }



