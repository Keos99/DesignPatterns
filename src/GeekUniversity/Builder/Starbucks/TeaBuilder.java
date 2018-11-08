package GeekUniversity.Builder.Starbucks;

public class TeaBuilder extends StarbucksBuilder {
    protected Starbucks starbucks;

    public void buildSize() {
        starbucks.setSize("large");
        System.out.println("build large size");
    }

    public void buildDrink() {
        starbucks.setDrink("tea");
        System.out.println("build tea");
    }
}
