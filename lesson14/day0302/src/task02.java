import java.util.Arrays;

public class task02 {
    /*
    №2
1. Создайте массив из всех нечётных чисел от 1 до 99.
2. Выведите его на экран в строку в обратном порядке
     */
    public static void main(String[] args)
    {
        //число четн чисел=(int)99/2;четн чисел =49
        //число нечетн чисел=Math.cell(99/2) то есть 50
        double Max=99;
        int NechetInt=(int)Math.ceil(Max/2);

        int[] intArr=new int[NechetInt];
        int m=1;
        int j=0;
        //Заполняем значения
        for(int i=1;i<=Max;i=i+2){

            intArr[j]=i;
            j++;
        }

      String Str="";

        for(int i=NechetInt-1;i>=0;i--){
            Str=Str+" "+intArr[i];

        }



        System.out.println( Str);
    }
}
