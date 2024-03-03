public class LinkedDemo {
    public static void main(String[] args) {


        MyLinkedCollection Linkcollection = new MyLinkedCollection();
        Linkcollection.add("First");
        Linkcollection.add("Second");
        Linkcollection.add("Third");

        System.out.println("Initial size: " + Linkcollection.size());

        Linkcollection.add(1, "Inserted");

        System.out.println("Size after insertion: " + Linkcollection.size());

        Linkcollection.remove(2);

        System.out.println("Size after removal: " + Linkcollection.size());





    }
}