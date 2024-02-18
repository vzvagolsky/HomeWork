package MusicalInstrument;
/*
### Задача 2: Музыкальные инструменты

Определите абстрактный класс MusicalInstrument с абстрактным методом playNote,
 который должен имитировать звучание ноты.
От этого класса создайте производные классы Guitar, Piano, и Violin,
реализующие метод playNote для имитации звука соответствующего инструмента.



 */
abstract public class MusicalInstrument {
     abstract void PlayNote();
     private String NameMusikInstrumen;
     public String getNameMusikInstrumen() {
          return NameMusikInstrumen;
     }

     public MusicalInstrument(String nameMusikInstrumen) {
          NameMusikInstrumen = nameMusikInstrumen;
     }
}
