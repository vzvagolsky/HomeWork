


public class PenDemo {
/*
    №5
            1. Создайте класс ручка (Pen)
    a. Определите свойство color типа String с доступом private
    b. Создайте методы getColor(); setColor(String newColor);
2. Создайте класс PenDemo (метод main)
3. Создайте три объекта типа Pen
4. Создайте массив L = 3
            5. Сохраните все объекты в массив
6. Достаньте поочередно из массива ручки и измените цвет каждой на
    a. “Green”
    b. “Red”
    c. “Black”
            7. Распечатайте цвета ручек из массива
*/

    public static void main(String[] args)
    {
       int L=3;

    Pen pen1=new Pen("Yellow");
    Pen pen2=new Pen("Whiet");
    Pen pen3=new Pen("Grau");
    Pen[] Arrpen={pen1,pen2,pen3};

    Arrpen[0].setColor("Green");
    Arrpen[1].setColor("Red");
    Arrpen[2].setColor("Black");

for(int i=0;i<3;i++){
    System.out.println("Цвет ручки "+(i+1)+" "+Arrpen[i].getColor()) ;
}


    }




}
