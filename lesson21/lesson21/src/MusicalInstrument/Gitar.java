package MusicalInstrument;

public class Gitar extends MusicalInstrument{


   @Override
    public void PlayNote(){
        System.out.println("Я гитара!");
    }

    public Gitar(String nameMusikInstrumen) {
        super(nameMusikInstrumen);
    }

}
