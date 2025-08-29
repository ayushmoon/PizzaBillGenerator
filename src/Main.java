class Main{
    public static void main(String[] args) {
        Pizza basePizza = new Pizza(false);
        basePizza.addExtraCheese();
        basePizza.addExtraToppings();
        basePizza.takeAway();
        basePizza.getBill();

//        deluxPizza dp = new deluxPizza(true);
//        dp.takeAway();
//        dp.getBill();
    }
}