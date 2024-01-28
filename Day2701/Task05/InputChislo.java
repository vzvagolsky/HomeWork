package Day2701.Task05;

import scanner.UserInput;


public class InputChislo {

    public Chislo createChislo() {

        UserInput ui = new UserInput();

        String StrInp = ui.inputText("Введите четырезначное число: ");


        return new Chislo(StrInp);


    }

}
