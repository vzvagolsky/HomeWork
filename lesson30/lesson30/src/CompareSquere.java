import java.util.Comparator;

public class CompareSquere implements Comparator<Flat> {
    @Override
    public int compare(Flat o1, Flat o2) {
        if (o1.getS() == o2.getS()) {
            return 0;
        } else if (o1.getS() - o2.getS() > 0) {
            return 1;
        } else return -1;


    }
}