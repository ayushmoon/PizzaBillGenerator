public class Pizza {
    private int price;
    private Boolean veg;

    private int basePizza;
    private int extraCheese = 40;
    private int extraToppings = 30;
    private int backPack = 20;

    private boolean isExtraCheeseAdded;
    private boolean isToppingsAdded;
    private boolean isOptedForTakeAway;


    public Pizza(Boolean veg) {
        this.veg = veg;
        if (veg){
            this.price=300;
        }
        else{
            this.price=400;
        }
        basePizza=this.price;
    }

    void addExtraCheese(){
        isExtraCheeseAdded=true;
        this.price += extraCheese;
    }

    void addExtraToppings(){
        isToppingsAdded=true;
        this.price += extraToppings;
    }

    void takeAway(){
        isOptedForTakeAway=true;
        this.price += backPack;
    }

    void getBill(){
        String Bill = "";
        System.out.println("Pizza: "+basePizza);
        if (isExtraCheeseAdded){
            Bill+="Extra Cheese Added: "+extraCheese+"\n";
        }
        if (isToppingsAdded){
            Bill+="Extra Toppings Added: "+extraToppings+"\n";
        }
        if (isOptedForTakeAway){
            Bill+="Opted For Take Away: "+backPack+"\n";
        }
        System.out.println(Bill+"Final Price: "+this.price);
    }
}


