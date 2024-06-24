public class Order {
    private String type;
    private String name;
    private String beverage;
    private String size;
    private String dessert;
    private String dessertSize;
    private Boolean coffee;

    public Order(String type, String name, String beverage, String size, String dessert, String dessertSize, Boolean coffee) {
        this.type = type;
        this.name = name;
        this.beverage = beverage;
        this.size = size;
        this.dessert = dessert;
        this.dessertSize = dessertSize;
        this.coffee = coffee;
    }

    // Getters et Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBeverage() {
        return beverage;
    }

    public void setBeverage(String beverage) {
        this.beverage = beverage;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDessert() {
        return dessert;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public String getDessertSize() {
        return dessertSize;
    }

    public void setDessertSize(String dessertSize) {
        this.dessertSize = dessertSize;
    }

    public Boolean getCoffee() {
        return coffee;
    }

    public void setCoffee(Boolean coffee) {
        this.coffee = coffee;
    }
}