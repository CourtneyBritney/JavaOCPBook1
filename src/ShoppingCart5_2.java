public class ShoppingCart5_2 {

        public static void main(String[] args) {

            String custName = "Courtney Alexander";
            String message = custName + " wants to purchase a several items.";

            String[] items = {"Sunflower dress","Necklace","Sandals","Perfume"};

            message = custName + " wants to purchase "+items.length+" items.";
            System.out.println(message);


            System.out.println(items[3]);
            //System.out.println(items[4]);
        }
    }

