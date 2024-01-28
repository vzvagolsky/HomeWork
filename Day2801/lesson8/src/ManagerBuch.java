import scanner.UserInput;
public class ManagerBuch
{
    private UserInput ui = new UserInput();
    /*
       this.Athor = athor;
        this.NameBuch = nameBuch;
        this.NumPages = numPages;
        this.NumKatalog = numKatalog;
        this.weheIs = weheIs;


     */
    public Buch createBuch() {
        Buch buch;

        int viborUser = ui.inputInteger("Полный ввод книги или упрощенный 1-есть ,0-Нет: ");
        if(viborUser==1) {
            String athor = ui.inputText("Автор: ");
            String namebuch = ui.inputText("Название Книги: ");
            int pages = ui.inputInteger("Количество страниц в книге: ");
            int catalog = ui.inputInteger("Номер каталога: ");
            char yesno = (char) ui.inputInteger("Наличие книги 1-есть ,0-Нет: ");

            buch = new Buch(athor, namebuch, pages, catalog, yesno);
        }else{
            String athor = ui.inputText("Автор: ");
            String namebuch = ui.inputText("Название Книги: ");
            buch = new Buch(athor, namebuch);

        }

     /*
        String athor = ui.inputText("Автор: ");
        String namebuch = ui.inputText("Название Книги: ");
        buch = new Buch(athor, namebuch);
      */

        return buch;
    }

    public void EditBuch(Buch buch) {
        System.out.println("Редактируем книгу!");
        int pages = ui.inputInteger("Количество страниц в книге: ");
        int catalog = ui.inputInteger("Номер каталога: ");
        char yesno = (char) ui.inputInteger("Наличие книги 1-есть ,0-Нет: ");
        buch.Edit(pages,catalog,yesno);

    }




}
