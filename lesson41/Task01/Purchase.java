public class Purchase {
   private String NameTovar;
    private Double SumTovar;

    public Purchase(String nameTovar, Double sumTovar) {
        NameTovar = nameTovar;
        SumTovar = sumTovar;
    }

    public String getNameTovar() {
        return NameTovar;
    }

    public Double getSumTovar() {
        return SumTovar;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "NameTovar='" + NameTovar + '\'' +
                ", SumTovar=" + SumTovar +
                '}';
    }
}
