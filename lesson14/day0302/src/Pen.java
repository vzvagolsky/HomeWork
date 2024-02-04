/*
1. Создайте класс ручка (Pen)
*a. Определите свойство color типа String с доступом private
b. Создайте методы getColor(); setColor(String newColor);

 */

/*
1. Создайте класс ручка (Pen)
*a. Определите свойство color типа String с доступом private
b. Создайте методы getColor(); setColor(String newColor);

 */
public class Pen {
    private String color;

    Pen(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}