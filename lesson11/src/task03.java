import scanner.UserInput;

public class task03 {
    /*
    Используйте цикл, чтобы просуммировать все числа, которые ввел пользователь, до первого отрицательного.
     */
    public static void main(String[] args){
        UserInput ui=new UserInput();

        int num =0;
        int Sum=0;
        while(num>=0)
        {


            num = ui.inputInteger("Введите число для суммирования : ");
            if(num>0) {
                Sum = Sum + num;
                  }
        }

        System.out.println("сумма чисел введенных Вами равна "+ Sum);

    }

}
