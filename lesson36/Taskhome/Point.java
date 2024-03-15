
/*
6   Создать множество TreeSet и добавить в него несколько объектов класса Point,
 у которых есть свойства x и y.
        Затем перебрать все элементы множества
         и вывести на консоль только те точки, у которых x > y.


 */

    // Класс, представляющий точку
    class Point implements Comparable<Point> {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

        // Реализация метода compareTo интерфейса Comparable для сравнения точек
        @Override
        public int compareTo(Point other) {
            if (this.x != other.x) {
                return Integer.compare(this.x, other.x);
            } else {
                return Integer.compare(this.y, other.y);
            }
        }
    }



