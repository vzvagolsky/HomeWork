/*
№7 **
Создать массив размера , полученного от пользователя
Наполнить этот массив случайными числами в диапазоне до 100
- найти максимум среди элементов массива и его индекс (если значения повторяются то найти первый)
- найти сумму всех элементов

если максимальный элемент повторяется несколько раз то создать массив из индесов

в идеале - оформить основные модули вашей программы отдельными методами


 */


public class Utilsmassiv {

    public int findeMax(int[] Arr) {
        int Max = Arr[0];

        for (int i = 0; i < Arr.length; i++) {
            if (Max < Arr[i]) {
                Max = Arr[i];
            }

        }
        return Max;
    }

    public int Sum(int[] Arr){
        int Sum=0;
        for(int i=0;i<Arr.length;i++){
            Sum=Sum+Arr[i];
        }

     return Sum;
    }

    public String[] IndexArr(int[] Arr) {


        int Max = findeMax(Arr);
        String StrIndex="";

        for (int i = 0; i < Arr.length; i++) {

           if (Arr[i] == Max) {
                StrIndex = StrIndex + " " + i;
            }
        }
        System.out.println("Инндексы : "+StrIndex);
        String[] Index = StrIndex.split(" ");

        return Index;

    }

}






