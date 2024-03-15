import java.util.List;

public class Order {
    private String Date;
    private List<Purchase> purchases;


    // Создание списка заказов


    public Order(String date, List<Purchase> purchases) {
        Date = date;
        this.purchases = purchases;
    }

    public List<Purchase> getPurchases() {
        return purchases;
    }

    public String getDate() {
        return Date;
    }

    @Override
    public String toString() {
        return "Order{" +
                "Date='" + Date + '\'' +
                ", purchases=" + purchases +
                '}';
    }
}
