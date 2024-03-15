/*
6   Создать множество TreeSet и добавить в него несколько объектов класса Point,
у которых есть свойства x и y.
        Затем перебрать все элементы множества
         и вывести на консоль только те точки, у которых x > y.


 */
import java.util.Set;
import java.util.TreeSet;
public class Task16 {



        public static void main(String[] args) {
            // Создание множества TreeSet
            Set<Point> points = new TreeSet<>();

            // Добавление точек в множество
            points.add(new Point(1, 2));
            points.add(new Point(3, 1));
            points.add(new Point(5, 5));
            points.add(new Point(4, 3));

            // Вывод точек, у которых x > y
            for (Point point : points) {
                if (point.getX() > point.getY()) {
                    System.out.println(point);
                }
            }
        }
    }



