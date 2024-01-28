public class workStr {
    private String Str;

    public workStr(String s) {
        this.Str = s;
        System.out.println("Строка создана" + Str);
    }


    //печать последнего символа

    public void printLast() {

        System.out.println("Последний символ строки есть символ " + Str.charAt(Str.length() - 1));
    }

    //Проверка содержит ли строка строку
    public void Sravnit(String str0) {
        if (Str.contains(str0)) {
            System.out.println("Строка  " + str0 + " есть в строке " + Str);

        } else {
            System.out.println("Строки  " + str0 + " нет в строке " + Str);

        }

    }

    public String Zamena(char a,char b)
    {
     return Str.replace(a,b);
    }


    //Верхний регистр

    public String Verh()
    {
        return Str.toUpperCase();
    }
    public String Niz()
    {
        return Str.toLowerCase();
    }



}
