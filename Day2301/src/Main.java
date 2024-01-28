public class Main {
    public static void main(String[] args)
    {

            workStr Str =new workStr("I study Basic Java!");
            //Последний символ строки
            Str.printLast();
            //Есть строка в строке
            Str.Sravnit("Java");
           //Замена в строке символов а на о
            System.out.println("Новая строка после замены a на o " + Str.Zamena('a','o'));
           //Верхний регистр
           System.out.println("Перевод строки в верхний регистр" + Str.Verh());
           //Нижний регистр
           System.out.println("Перевод строки в верхний регистр" + Str.Niz());


    }




}