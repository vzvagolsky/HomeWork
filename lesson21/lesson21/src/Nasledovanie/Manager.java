package Nasledovanie;

public class Manager {
    private Employee empl;
     private Employee[] podchinennie;

    public Manager(Employee empl, Employee[] podchinennie) {
        this.empl = empl;
        this.podchinennie = podchinennie;
    }

    public Employee getEmpl() {
        return empl;
    }

    public Employee[] getPodchinennie() {
        return podchinennie;
    }
}
