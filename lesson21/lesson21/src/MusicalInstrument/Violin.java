package MusicalInstrument;

public class Violin extends MusicalInstrument{
    public Violin(String nameMusikInstrumen) {
        super(nameMusikInstrumen);
    }

    @Override
    public void PlayNote(){
        System.out.println("Я Violin!");
    }


}
