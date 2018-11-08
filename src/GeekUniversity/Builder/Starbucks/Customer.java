package GeekUniversity.Builder.Starbucks;

public class Customer {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        StarbucksBuilder coffeeBuilder = new CoffeeBuilder();

        waiter.setStarbucksBuilder(coffeeBuilder);
        waiter.constructStarbucks();

        Starbucks drink = waiter.getstarbucksDrink();
    }
}
