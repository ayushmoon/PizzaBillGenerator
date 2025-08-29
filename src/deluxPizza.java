public class deluxPizza extends Pizza {

    public deluxPizza(Boolean veg) {
        super(veg);
        super.addExtraCheese();
        super.addExtraToppings();
    }

    @Override
    void addExtraCheese() {}

    @Override
    void addExtraToppings() {}

    @Override
    void takeAway() {
        super.takeAway();
    }
}
