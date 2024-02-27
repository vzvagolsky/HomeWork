import java.util.Comparator;

public class CompareChemodanRazmer implements Comparator<Chemodan> {
    @Override
    public int compare(Chemodan o1, Chemodan o2) {
        if(o1.getRazmer().ordinal() == o2.getRazmer().ordinal()){
            return 0;}
        else if(o1.getRazmer().ordinal() > o2.getRazmer().ordinal())
            return 1;
        else
            return -1;


    }

}
