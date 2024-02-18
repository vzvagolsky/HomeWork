package Nasledovanie;

public class EmplApp {
    public static void main(String[] args)
    {
        Employee empl1=new Employee("Ivan","Developer","22");
        Employee empl2=new Employee("Vasya","Developer","25");
        Employee empl3=new Employee("Niko","Developer","30");
        Employee empl4=new Employee("Dima","Developer","27");
        Employee empl5=new Employee("Vova","Developer","19");
        Employee empl6=new Employee("Alex","Developer","32");

        Employee empl7=new Employee("Viktor","Manadger","45");
        Employee empl8=new Employee("Ben","Manadger","40");




        Employee[]podchinennie1={ empl1,empl2,empl3};
        Manager manger1= new Manager(empl7,podchinennie1);

        Employee[]podchinennie2={ empl4,empl5,empl6};

        Manager manager2= new Manager(empl8,podchinennie2);

        String[]Proects1={"proect1","proect2"};

        String[]Proects2=  {"proect3","proect4"};

        String[]Proects3={ "proect5","proect6","proect6","proect7","proect8"};


        Developer develop1=new Developer(empl1,Proects1);
        Developer develop2=new Developer(empl2,Proects2);
        Developer develop3=new Developer(empl3,Proects3);


    }
}
