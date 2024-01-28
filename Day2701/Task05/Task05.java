package Day2701.Task05;


public class Task05 {
    public static void main(String[] args) {
        InputChislo VagnoeChislo=new InputChislo();
        Chislo chislo=  VagnoeChislo.createChislo();
        int num = chislo.Proverka();

       /*
        Rez=1 ;//Это счастливый Билет и это выиграш!!!

        Rez=2;//Неудача! Это несчастливый билет к сожалению.

        Rez=3;//Число не четырехзначное .Программа будет завершена!"
        */

        switch(num){

            case 1:
                System.out.println("Это счастливый Билет и это выиграш!!!");
                break;
            case 2:
                System.out.println("Неудача! Это несчастливый билет к сожалению.");

                break;
            case 3:
                System.out.println("Число не четырехзначное .Программа будет завершена!") ;
                break;
            default:
                System.out.println("Что то пошло не так .Программа будет завершена!") ;

        }


    }
}