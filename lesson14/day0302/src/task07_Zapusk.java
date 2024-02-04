/*
№7 **
Создать массив размера , полученного от пользователя
Наполнить этот массив случайными числами в диапазоне до 100
- найти максимум среди элементов массива и его индекс (если значения повторяются то найти первый)
- найти сумму всех элементов

если максимальный элемент повторяется несколько раз то создать массив из индесов

в идеале - оформить основные модули вашей программы отдельными методами


 */


import java.util.Arrays;

public class task07_Zapusk {
    public static void main(String[] args)
    {
        CreateMassivInt mass=new CreateMassivInt();
        int[] intArr1=mass.createMassiv();
        System.out.println(Arrays.toString(intArr1));
        Utilsmassiv util1=new Utilsmassiv();
        int Max=util1.findeMax(intArr1);
        System.out.println("Максимальное значение есть "+Max);
        int Sum=util1.Sum(intArr1);
        System.out.println(" Сумма значений есть "+Sum);
        String[] index=util1.IndexArr(intArr1);
       // System.out.println(Arrays.toString(index));
    }

}
