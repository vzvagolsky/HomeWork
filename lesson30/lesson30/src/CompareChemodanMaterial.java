import java.util.Comparator;

public class CompareChemodanMaterial implements Comparator<Chemodan> {
    @Override
    public int compare(Chemodan o1, Chemodan o2) {
        if(o1.getMaterial().ordinal() == o2.getMaterial().ordinal()){
            return 0;}
        else if(o1.getMaterial().ordinal() > o2.getMaterial().ordinal())
            return 1;
        else
            return -1;


    }



}
