public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Courtney Alexander";
        String itemDesc = "Sunflower dress";
        String message = custName+" wants to purchase a "+itemDesc;

        double price = 39.99;
        int quantity = 2;
        double tax = 2.04;
        double total;

        message = custName+" wants to purchase "+quantity+ " "+itemDesc;

        System.out.println(message);

        total = quantity * price * tax;

        System.out.println("Total cost with tax: "+total);
    }

}
