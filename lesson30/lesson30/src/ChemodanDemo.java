import java.util.Comparator;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class ChemodanDemo {
    public static void main(String[] args) {
        //по трем параметрам - размеру и материалу и цвету
        Comparator<Chemodan> ChemodanComparator = new CompareChemodanRazmer().thenComparing(new CompareChemodanMaterial()).thenComparing(new CompareChemodanColor());



        Set<Chemodan> chemodans = new TreeSet<>(ChemodanComparator);

        /*
        Razmer:
    M,
    L,
    XL
    ==================
        Type:
         Plastik,
          Tkan
   --------------
   Coor:
     White,
    Black,
    Red
    -------------------


         */



        chemodans.add(new Chemodan( Color.Black,Razmer.M,MaterialType.Tkan));
        chemodans.add(new Chemodan( Color.White,Razmer.L,MaterialType.Plastik));
        chemodans.add(new Chemodan( Color.Yellow,Razmer.M,MaterialType.Tkan));
        chemodans.add(new Chemodan( Color.Red,Razmer.XL,MaterialType.Plastik));
        chemodans.add(new Chemodan( Color.Green,Razmer.L,MaterialType.Tkan));
        chemodans.add(new Chemodan( Color.Black,Razmer.XL,MaterialType.Tkan));

        System.out.println(chemodans);

        LinkedList<Chemodan> chemodans2 = new LinkedList<>();
        chemodans2.add(new Chemodan( Color.Black,Razmer.M,MaterialType.Tkan));
        chemodans2.add(new Chemodan( Color.White,Razmer.L,MaterialType.Plastik));
        chemodans2.add(new Chemodan( Color.White,Razmer.M,MaterialType.Tkan));
        chemodans2.add(new Chemodan( Color.Red,Razmer.XL,MaterialType.Plastik));
        chemodans2.add(new Chemodan( Color.Red,Razmer.XL,MaterialType.Tkan));
        chemodans2.add(new Chemodan( Color.Black,Razmer.XL,MaterialType.Tkan));

        //System.out.println(chemodans2);
        chemodans2.sort(ChemodanComparator);
        //System.out.println(chemodans2);
    }
}
