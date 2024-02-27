import java.util.Comparator;

public class CompareChemodanColor implements Comparator<Chemodan> {
    @Override
    public int compare(Chemodan o1, Chemodan o2) {
        if(o1.getColor().ordinal() == o2.getColor().ordinal()){
            return 0;}
        else if(o1.getColor().ordinal() > o2.getColor().ordinal())
            return 1;
        else
            return -1;


    }
}




