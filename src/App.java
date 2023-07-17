import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String orderName;
        int orderQuantity;
        OrdersMasterList orderList = new OrdersMasterList();
        

        orderList.addOrder(new Order("Oreo", 5));
        orderList.addOrder(new Order("Cameo", 21));
        orderList.addOrder(new Order("Oreo", 5));
        orderList.addOrder(new Order("Keebler",7));
        orderList.addOrder(new Order("Binbo", 4));
        orderList.addOrder(new Order("Oreo", 5));
        char option = 'a';

        while(option != '0'){
            printMenu();
            option = input.next().charAt(0);
            switch(option){
                case '1':
                    orderList.displayAllOrders();
                break;
                case '2':
                    System.out.println("Enter the order name");
                    orderName = input.next();
                    System.out.println("Enter the order quantity");
                    orderQuantity = input.nextInt();
                    orderList.addOrder(new Order( orderName, orderQuantity));
                break;
                case '3':
                    System.out.println("Amount of total boxes: " + orderList.getTotalBoxes());
                break;
                case '4':
                    System.out.println("Enter the order name you like to remove");
                    orderName = input.next();
                    orderList.removeVariety(orderName);
                break;
                case '5':
                    System.out.println("Give me the total boxes of the following order variety");
                    orderName = input.next();
                    System.out.println(orderList.getVarietyBoxes(orderName));
                break;
                default:
                    System.out.println("goodbye");
                break;
            }
        }
        //orderList.removeVariety("test");
        input.close();
    }

    public static void printMenu(){
        System.out.println("");
        System.out.println("");
        System.out.println("Enter an option from the list.");
        System.out.println("1. Show me all orders");
        System.out.println("2. Add an Order");
        System.out.println("3. Get Total boxes of all variety");
        System.out.println("4. Remove a variety of orders");
        System.out.println("5. Get all boxes of same variety");
        System.out.println("0. End the program");
    }
}
