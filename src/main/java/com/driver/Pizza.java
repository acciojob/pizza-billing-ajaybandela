package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int cheese;
    private int toppings;

    boolean isExtraCheeseAdded;
    boolean isExtraToppingsAdded;
    boolean isTakeAwayAdded;
    boolean isBillGenerated;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.isExtraCheeseAdded=false;
        this.isExtraToppingsAdded=false;
        this.isTakeAwayAdded=false;
        this.isBillGenerated=false;
        this.bill="";

        if(isVeg){
            this.price=300;
            this.toppings=70;
        }else{
            this.price=400;
            this.toppings=120;
        }
        this.cheese=80;
        this.bill = this.bill + "Base Price Of The Pizza: "+this.price+ "\n";
    }
    /////////////
    public void setPrice(int price) {
        this.price = price;
    }

    public Boolean getVeg() {
        return isVeg;
    }

    public void setVeg(Boolean veg) {
        isVeg = veg;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public int getCheese() {
        return cheese;
    }

    public void setCheese(int cheese) {
        this.cheese = cheese;
    }

    public int getToppings() {
        return toppings;
    }

    public void setToppings(int toppings) {
        this.toppings = toppings;
    }


    /////////

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes her
        if(!isExtraCheeseAdded){
            this.price = this.price + cheese;
            isExtraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppingsAdded){
            this.price = this.price + toppings;
            isExtraToppingsAdded = true;
        }
    }
    public void addTakeaway(){
        // your code goes here
        if(!isTakeAwayAdded){
            this.price = this.price + 20;
            isTakeAwayAdded = true;
        }

    }

    public String getBill(){
        // your code goes here
         if(!isBillGenerated){
             if(isExtraCheeseAdded){
                 this.bill = this.bill + "Extra Cheese Added: "+this.cheese + "\n";
             }
             if(isExtraToppingsAdded){
                 this.bill = this.bill + "Extra Toppings Added: "+this.toppings + "\n";
             }
             if(isTakeAwayAdded){
                 this.bill += "Paperbag Added: "+"20" + "\n";
             }
             this.bill=this.bill + "Total Price:;
             isBillGenerated=true;
         }
        return  this.bill;

    }
}