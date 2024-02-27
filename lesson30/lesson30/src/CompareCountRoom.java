import java.util.Comparator;

public class CompareCountRoom implements Comparator<Flat> {
    @Override
    public int compare(Flat o1, Flat o2) {
        if (o1.getNumkomnat() == o2.getNumkomnat()) {
            return 0;
        } else if (o1.getNumkomnat() - o2.getNumkomnat() > 0) {
            return 1;
        } else return -1;


    }

}
