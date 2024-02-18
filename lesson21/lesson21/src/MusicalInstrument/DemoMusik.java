package MusicalInstrument;

public class DemoMusik {
    public static void main(String[] args) {
        MusicalInstrument musik1=new Gitar("Gitar") ;
        MusicalInstrument musik2=new Piano("Piano") ;
        MusicalInstrument musik3=new Violin("Violin") ;

        System.out.println(musik1.getNameMusikInstrumen());
        musik1.PlayNote();
        System.out.println(musik2.getNameMusikInstrumen());
        musik2.PlayNote();
        System.out.println(musik3.getNameMusikInstrumen());
        musik3.PlayNote();


    }
}
