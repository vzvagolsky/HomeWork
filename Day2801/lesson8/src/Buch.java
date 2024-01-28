public class Buch {
    /*
    LESSON 8
Задача 1.
Написать программу, которая:
- оперирует объектами книга со следующими параметрами
- автор
- название книги
- количество страниц
- номер в каталоге
- параметр который показывает книга в хранилище или на руках

Нужно уметь создавать новые книги двумя способами:
- либо указывать только автора и название книги
  в этом случае недостающе при создании книги данные добавляются отдельно
- либо полностью все параметры

Написать отдельные сервисные методы которые:
- создают новую книгу только с автором и названием
- создают новую книгу с использованием всех параметров
- редактирует книгу добавляя: номер каталога, количество страниц и где книга находится
- который вывод подробно информацию о книге






     */

    private String Athor;
    private String NameBuch;
    private int NumPages;
    private int NumKatalog;
    private int weheIs;

    public Buch(String athor, String nameBuch, int numPages, int numKatalog, int weheIs) {
        this.Athor = athor;
        this.NameBuch = nameBuch;
        this.NumPages = numPages;
        this.NumKatalog = numKatalog;
        this.weheIs = weheIs;
    }

    public Buch(String athor, String nameBuch) {
        this.Athor = athor;
        this.NameBuch = nameBuch;
        this.NumPages = 0;
        this.NumKatalog =0;
        this.weheIs = 0;

    }
    public void Edit(int cataog,int numpages,int isno)
    {
        this.NumPages = numpages;
        this.NumKatalog = cataog;
        this.weheIs = isno;
    }

    public void infoBuch()
    {


        System.out.println("Название книги :"+ NameBuch);
        System.out.println("Автор книги :"+ Athor);
        System.out.println("Колличество страниц в книге :"+ NumPages);
        System.out.println("Номер каталога :"+ NumKatalog);
        if(weheIs==1) {
            System.out.println("Книга в Библиотеке!");
        }else{
            System.out.println("Книга у читателя!");
        }


    }



}
