public class task04 {
    /*
    №4
            1. Создать массив типа String с размером 7.
            2. Записать в него значения дней недели.
            3. Вывести на консоль значение последнего элемента.

*/
    public static void main(String[] args)
    {
       //1
       String[] Str=new String[7];
        Str[0]="Понедельник";
        Str[1]="Вторник";
        Str[2]="Середа";
        Str[3]="Четверг";
        Str[4]="Пятница";
        Str[5]="Суббота";
        Str[6]="Воскресенье";
        System.out.println(Str[6]);
    }
}
