class bakery{
    static String procurementday = "Bread: Order Every First of each month";
    public static void orderBread(){
        int breadQuant = 10;
        int price = 5;
        int order = breadQuant * price;
        System.out.println("Bread Order is placed for this month in the value of " + order);
    }
}

class hotDrinksVendor{

    static String procurementday = "Hot Drinks: Order Every Second of each month";
    public static void hotDrinks(){
        int coffeePrice = 600;
        int teaPrice = 380;
        int price = 40;
        int quantity = 15;
        int CoffeeOrderAmt = coffeePrice * quantity;
        int teaOrderAmt = teaPrice *quantity;
        System.out.println("Coffee order placed in the amount of " + CoffeeOrderAmt);
        System.out.println("Tea order placed in the amount of "+ teaOrderAmt);
        System.out.println(price);
    }

}

public class cafe {
    public static void main(String[] args) {
        System.out.println(bakery.procurementday);
        bakery.orderBread();
        System.out.println(hotDrinksVendor.procurementday);
        hotDrinksVendor.hotDrinks();
    }
    
}
