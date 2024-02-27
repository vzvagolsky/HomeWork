import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class FlatDemo {
    /*
    создать коллекцию TreeSet, добавить несколько элементов
    и проверить работу коллекции


     */
    public static void main(String[] args) {

        Comparator<Flat> flatComparator = new CompareSquere().thenComparing(new CompareCountRoom());


        Set<Flat> flats1 = new TreeSet<>(flatComparator);


        flats1.add(new Flat(1, 45.0,1));
        flats1.add(new Flat(2, 50.0,1));
        flats1.add(new Flat(3, 50.0,2));
        flats1.add(new Flat(4, 120.0,5));
        flats1.add(new Flat(5, 120.0,4));
        flats1.add(new Flat(6, 100.0,3));
        flats1.add(new Flat(7, 200.0,6));
        flats1.add(new Flat(8, 80.0,3));

        System.out.println(flats1);




    }
}