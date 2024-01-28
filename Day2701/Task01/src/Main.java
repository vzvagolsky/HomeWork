import scanner.UserInput;
public class Main {
    public static void main(String[] args)
    {
        UserInput ui = new UserInput();
// 1.Блок кода с if
        int Num  = ui.inputInteger("Введите цифру от 1 до 3: ");
        System.out.println("Блок кода с i3f:");
        if(Num==1){
            System.out.println("Вы ввели 1");
        }else if(Num==2){
            System.out.println("Вы ввели 2");
        }else{
            System.out.println("Вы ввели 3");
        }

        //****************************************************

        //2 Блок кода switch
        System.out.println("Блок кода с Switch :");
        switch(Num){

            case 1:
                System.out.println("Вы ввели 1 ");
                break;
            case 2:
                System.out.println("Вы ввели 2.");
                break;
            case 3:
                System.out.println("Вы ввели 3") ;
                break;
            default:
                System.out.println("Вы не то ввели2" +
                        "!") ;

        }




    }
}
