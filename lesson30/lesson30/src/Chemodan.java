/*

Чемодан - 3 параметра материал (пластик или ткань),
размер - M, L, XL и цвет.
   Создать две коллекции - TreeSet и LinkedList и отсортировать
   по трем параметрам - размеру и материалу и цвету



 */


public class Chemodan {
    private Color color;
    private Razmer razmer;
    private MaterialType material;

    public Chemodan(Color color, Razmer razmer, MaterialType material) {
        this.color = color;
        this.razmer = razmer;
        this.material = material;
    }

    public Color getColor() {
        return color;
    }

    public Razmer getRazmer() {
        return razmer;
    }

    public MaterialType getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "Chemodan{" +
                "color=" + color +
                ", razmer=" + razmer +
                ", material=" + material +
                '}';
    }
}
