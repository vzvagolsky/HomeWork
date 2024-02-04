
/*
№7 **
Создать массив размера , полученного от пользователя
Наполнить этот массив случайными числами в диапазоне до 100
- найти максимум среди элементов массива и его индекс (если значения повторяются то найти первый)
- найти сумму всех элементов

если максимальный элемент повторяется несколько раз то создать массив из индесов

в идеале - оформить основные модули вашей программы отдельными методами


 */

import scanner.UserInput;

import java.util.Random;

public class CreateMassivInt {
    public int[]  createMassiv() {

        UserInput ui = new UserInput();
        int start = 0;
        int end = 100;
        int sizeMassiv = ui.inputInteger("Введите размер массива : ");
        int[] massiv=new int[sizeMassiv];

        Random rand=new Random();

        for(int i=0;i<sizeMassiv;i++) {
            massiv[i] = rand.nextInt(0, 100 + 1);
        }

        return massiv;

    }


}
