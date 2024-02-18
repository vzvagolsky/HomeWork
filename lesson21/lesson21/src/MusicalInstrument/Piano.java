package MusicalInstrument;

public class Piano extends MusicalInstrument {


    @Override
    public void PlayNote(){
        System.out.println("Я Piano!");
    }

    public Piano(String nameMusikInstrumen) {
        super(nameMusikInstrumen);
    }
}
