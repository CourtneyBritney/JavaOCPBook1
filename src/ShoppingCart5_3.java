public class ShoppingCart5_3 {

        public static void main(String[] args) {
            String custName = "Courtney Alexander";
            String message;

            double price = 21.99;
            int quantity = 2;
            double tax = 1.04;

            String items[];
            items = new String[4];
            items[0] = "Sunflower dress";
            items[1] = "Necklace";
            items[2] = "Sandals";
            items[3] = "Perfume";

            message = custName + " wants to purchase "+items.length+" items.";
            System.out.println(message);

            System.out.println("Items purchased: ");

            for (String item : items ){
                System.out.print(item + ", ");
            }
        }
    }


