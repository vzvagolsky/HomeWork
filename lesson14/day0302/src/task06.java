import java.util.Arrays;

public class task06 {
    /*
    №6
Дан массив слов.
Создать два массива:
- один из слов в котором нечетное количество букв
- второй в котором четное
     */
    public static void main(String[] args)
    {
/*1.Дан массив слов:
        Четные 1 5 6 7 8 11 12 13 14 17
        Нечетные 0 2 3 4 9 10 15 16
     */

   String[] MassivWord={ "Дан", "массив" ,"слов.", "Создать", "два", "массива:",
        "один" ,"из", "слов" ,"в" ,"котором", "нечетное", "количество" ,"букв",
             "второй", "в", "котором", "четное"};





/*
2.Создать два массива:
- один из слов в котором нечетное количество букв
- второй в котором четное
*/
String StrChetn,StrNeChetn;
        StrChetn="";
        StrNeChetn="";
 //Перебираем циклом   создаем две строки одна строка для  индексов четных слов вторая
        // для нечетных.

      for(int i=0;i< MassivWord.length;i++) {
      if(MassivWord[i].length()%2==0) {
          StrChetn = StrChetn + i+" ";
      }else{
          StrNeChetn=StrNeChetn+i+" ";
      }

      }
       String []IndexChetn=StrChetn.split(" ");
       String []IndexNeChetn=StrNeChetn.split(" ");
       //Создаем массавы четных
        String [] Chetn=new String[IndexChetn.length];
        String [] NeChetn=new String[IndexNeChetn.length];
               int k=0;//четные тек индексы
                int n=0;//нечетные текущие индексы
        for(int i=0;i<IndexChetn.length;i++){
          k=Integer.parseInt(IndexChetn[i]);
          Chetn[i]=MassivWord[k];
            //System.out.println("Четные "+Chetn[i]);
        }

        for(int i=0;i<IndexNeChetn.length;i++){
            n=Integer.parseInt(IndexNeChetn[i]);
            NeChetn[i]=MassivWord[n];

        }


        System.out.println("Массив четных чисел "+Arrays.toString(Chetn));
        System.out.println("Массив нечетных чисел "+Arrays.toString(NeChetn));

   }
}

