public class Product {
    public static int count = 1;
    private String id, name, unit;
    private int buy_cost, sell_cost;

    public int getProfit(){
        return sell_cost - buy_cost;
    }

    public String getId() {
        return id;
    }

    public Product(String name, String unit, int buy_cost, int sell_cost) {
        this.id = "MH" + String.format("%03d", count++);
        this.name = name;
        this.unit = unit;
        this.buy_cost = buy_cost;
        this.sell_cost = sell_cost;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + unit + " " + buy_cost + " " + sell_cost + " " + getProfit();
    }
}
