package Day2701.Task05;

public class Chislo {
private String chislo;
Chislo (String str){
    this.chislo=str;
}

    public int Proverka(){
    int Rez;
     int SumFirst,SumEnd;
    if(chislo.length()==4){

        SumFirst=chislo.charAt(0)+chislo.charAt(1);
        SumEnd=chislo.charAt(2)+chislo.charAt(3);
        if(SumFirst==SumEnd){
            Rez=1 ;//Это счастливый Билет и это выиграш!!!
;        }else{
            Rez=2;//Неудача! Это несчастливый билет к сожалению.
        }

    }else{
        Rez=3;//Число не четырехзначное .Программа будет завершена!"

    }

   return Rez;
    }


}
