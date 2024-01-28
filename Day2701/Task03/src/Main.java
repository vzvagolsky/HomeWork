
import scanner.UserInput;

public class Main {
    public static void main(String[] args)
    {
        UserInput ui = new UserInput();

        String Inp = ui.inputText("Введите  число от 1 до 7: ");

        switch(Inp){

            case "1":
                System.out.println("Понедельник");
                break;
            case "2":
                System.out.println("Вторник");
                break;
            case "3":
                System.out.println("Середа");
                break;
            case "4":
                System.out.println("Четверг");
                break;
            case "5":
                System.out.println("Пятница");
                break;
            case "6":
            case "7":
                System.out.println("Выходной день!");
                break;

            default:
                System.out.println("Не правильно введенное число");

        }


    }
}