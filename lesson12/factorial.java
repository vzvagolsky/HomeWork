import scanner.UserInput;

import scanner.UserInput;
public class factorial {

        public static void main(String[] args) {
            UserInput ui = new UserInput();
            int Num = 0;
            int Factorial = 1;
            int i = 1;
            Num = ui.inputInteger("Введите число для вычисления Факториала : ");
            while (i <= Num) {

                Factorial = Factorial * i;
                i++;
            }


            System.out.println("Факториал равен " + Factorial);
        }
}
