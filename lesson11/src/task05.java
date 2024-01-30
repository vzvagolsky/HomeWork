import scanner.UserInput;
public class task05 {

/*
Пользователь ввел число N. Подсчитайте количество четных и
не четных чисел в диапазоне от 0 до N

 */
    public static void main(String[] args) {
        UserInput ui=new UserInput();

        int N = ui.inputInteger("Введите число N  : ");



        //int N=7;
        int Sum=0;
        int countChetn=0;
        int countNechetn=0;
        for(int i=1;i<=N;i++){
            if(i%2==0) {
                ++countChetn;
            }else{
                ++countNechetn;
            }

        }
        System.out.println("Колличество четных чисел равно "+countChetn);
        System.out.println("Колличество нечетных чисел равно "+countNechetn);

    }
}