import scanner.UserInput;
/*
проверить является ли число которое ввел пользователь - простым
   (делится без остатка только на 1 и на себя)
 */
public class task02 {
    public static void main(String[] args)
    {
        UserInput ui=new UserInput();

        int num = ui.inputInteger("Введите число для проверки : ");

        int temp;
        boolean isProstoe=true;


        // проверяем число на простоту
        for (int i=2; i<=num/2; i++) {
            temp = num % i;
            if (temp == 0) {
                isProstoe = false;
                break;
            }
        }
        // если переменная isPrime равна true, то число простое
        if(isProstoe) {
            System.out.println(num + " - простое число");
        } else {
            System.out.println(num + " - составное число");
        }
    }

    }



