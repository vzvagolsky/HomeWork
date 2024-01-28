public class Main {
    public static void main(String[] args)
    {
       ManagerBuch bibliotekar=new ManagerBuch();
        //Полный ввод
       Buch buch1= bibliotekar.createBuch();
       buch1.infoBuch();
        //Частичный ввод*/
       Buch buch2= bibliotekar.createBuch();
         bibliotekar.EditBuch(buch2);

       // Buch buch2 =new Buch("Жюль Верн","Таинственный Остров");
        buch2.infoBuch();

    }
}