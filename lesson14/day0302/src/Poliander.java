public class Poliander {
    public void isPoliander(String Str){
       boolean yesNo=false;
       int length=Str.length();
       for(int i=0;i<length/2;i++) {
           if (Str.charAt(i) != Str.charAt(length - 1 - i)) {
               yesNo=false;
           }else{
               yesNo=true;
           }
       }
        if(yesNo==true) {
            System.out.println("Строка Полиандер!");
        }else{
            System.out.println("Строка НЕ Полиандер!");
        }


    }

}
