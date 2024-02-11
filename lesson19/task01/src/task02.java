/*
2. Напишите программу, которая определит, сколько слов Вы ввели с консоли.
 */



import scanner.UserInput;
public class task02 {
    public static void main(String[] args)
    {
        UserInput ui=new UserInput();
        String InpStr;
        int count=0;
      do {

              InpStr = ui.inputText("Введите слово  : ");
              if(InpStr!="") {
                  count++;
              }

      }while (InpStr!="");
      System.out.println("Колличество введенных слов:"+count);
    }


}
