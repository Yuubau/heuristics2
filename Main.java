public class Main {

    public static void main(String[] args) {
        App app = new App();
        Order order = new Order(args[0], args[1], args[2], args[3], args[4], args[5], Boolean.valueOf(args[6]));
        int price = app.Compute(order);
        System.out.println("\nPrix à payer : " + price + "€");
    }
}