/*
## Домашнее задание

даны два класса:
1) Flat - у которого основными параметрами являются площадь и количество спален
   создать класс который сразу бы определял правила сортировки -
1) 1) по количеству комнат и 2) по площади
   создать коллекцию TreeSet, добавить несколько элементов и проверить работу коллекции


 */

public class Flat {
private int id;
private double S;
private int Numkomnat;

    public Flat(int id, double s, int numkomnat) {
        this.id = id;
        S = s;
        Numkomnat = numkomnat;
    }

    public double getS() {
        return S;
    }

    public int getNumkomnat() {
        return Numkomnat;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "id=" + id +
                ", S=" + S +
                ", Numkomnat=" + Numkomnat +
                '}';
    }
}
