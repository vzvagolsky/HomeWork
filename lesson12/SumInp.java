import scanner.UserInput;
public class SumInp {
    public static void main(String[] args){
        UserInput ui=new UserInput();
        int num=1;

        int Sum=0;
        int i=0;
        int Srednee=0;
        while(num!=0)
        {


            num = ui.inputInteger("Введите число для суммирования : ");

                Sum = Sum + num;
               if(num!=0) {
                   i = i + 1;
               }

        }
        Srednee=Sum/i;
        System.out.println("сумма чисел введенных Вами равна "+ Sum);
        System.out.println("Среднее чисел введенных Вами равна "+ Srednee);

    }


}
