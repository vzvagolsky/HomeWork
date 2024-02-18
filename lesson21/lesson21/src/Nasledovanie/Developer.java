package Nasledovanie;

public class Developer {

    private Employee empl;
    private String[]Proects;

    public Developer(Employee empl, String[] proects) {
        this.empl = empl;
        Proects = proects;
    }

    public Employee getEmpl() {
        return empl;
    }

    public String[] getProects() {
        return Proects;
    }

    public void setProects(String[] proects) {
        Proects = proects;
    }
}
