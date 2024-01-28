public class Main {
    public static void main(String[] args) {

        /*
        **Task 4** Реализовать с использованием **switch**
Ваш ребенок принес оценку за контрольную работу по математике. В школе 12 бальная система.
Запишите в переменную случайное число от 0 до 12.
Вы разрешаете ребенку смотреть телевизор не более 60 минут в день.
* (Оставшееся время не может быть больше 1 часа)
На сегодня у него осталось 45 минут. (записать в переменную)

Если оценка от 10 до 12 баллов -> Скажите ему, как вы рады
* и добавьте к оставшемуся на сегодня времени 1 час
*
от 7 до 9 -> Слова похвалы на экран + ко времени 45 минут
от 4 до 6 -> Нейтральные слова + ко времени 15 минут
3 -> Огорчитесь. Минус 30 минут ко времени
оценка меньше -> Трагедия. Сегодня ТВ смотреть запрещено

Выведите на экран оставшееся на сегодня время для просмотра ТВ


         */

        int timeOstatok = 45;
        int ocenka = (int) (0 + (12 - 0 + 1) * Math.random());
        System.out.println("Оценка школьника " + ocenka);

/*
        if ((ocenka >= 10) && (ocenka <= 12)) {
            timeOstatok = timeOstatok + 60;
            System.out.println("Я очень рад,отлично за твою оценку в школе!!!");

        } else if ((ocenka >= 7) && (ocenka <= 9)) {
            System.out.println("Я рад за твою оценку,хорошо в школе!!!");
            timeOstatok = timeOstatok + 45;
        } else if ((ocenka >= 4) && (ocenka <= 6)) {
            System.out.println("Ну это тоже оценка.Бывает хуже.");
            timeOstatok = timeOstatok + 15;
        } else if (ocenka == 3) {
            System.out.println("Плоховато сынок.");
            timeOstatok = timeOstatok - 30;
        } else if (ocenka < 3) {
            System.out.println("Трагедия .Сегодня ТВ тебе смотреть запрещено!");
        }

        if (timeOstatok > 60) {
            timeOstatok = 60;
            System.out.println("Оставшееся время " + timeOstatok);
        } else {
            System.out.println("Оставшееся время " + timeOstatok);

        }
*/
        switch(ocenka){

            case 12:
            case 11:
            case 10:
                timeOstatok = timeOstatok + 60;
                System.out.println("Я очень рад,отлично за твою оценку в школе!!!");
                break;
            case 9:
            case 8:
            case 7:
                System.out.println("Я рад за твою оценку,хорошо в школе!!!");
                timeOstatok = timeOstatok + 45;

                break;
            case 6:
            case 5:
            case 4:

                System.out.println("Ну это тоже оценка.Бывает хуже.");
                timeOstatok = timeOstatok + 15;
                break;
            case 3:
                System.out.println("Плоховато сынок.");
                timeOstatok = timeOstatok - 30;
                break;
            default:
                System.out.println("Трагедия .Сегодня ТВ тебе смотреть запрещено!");
                timeOstatok=0;
        }

        if (timeOstatok > 60) {
            timeOstatok = 60;
            System.out.println("Оставшееся время " + timeOstatok);
        } else {
            System.out.println("Оставшееся время " + timeOstatok);

        }

    }
}