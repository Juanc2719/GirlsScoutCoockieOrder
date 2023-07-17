import java.util.ArrayList;
import java.util.List;

public class OrdersMasterList {
    List<Order> orders;

    public OrdersMasterList(){
        orders = new ArrayList<Order>();
    }

    public void displayAllOrders(){
        for(Order orderIndex : this.orders){
            System.out.println("Variety :" + orders.get(orders.indexOf(orderIndex)).getVariety() + " -  Boxes: " + orders.get(orders.indexOf(orderIndex)).getNumBoxes());
        }
    }
    public void addOrder(Order orderToAdd){
        orders.add(orderToAdd);
    }

    public int getTotalBoxes(){
        int boxes = 0;
        for(Order order : this.orders){
            boxes += order.getNumBoxes();
        }
        return boxes;
    }

    public void removeVariety(String varietyToRemove){
        for(Order orderIndex : this.orders){
            if(orders.get(orders.indexOf(orderIndex)).getVariety().equals(varietyToRemove)){
                orders.remove(orders.indexOf(orderIndex));
            }
            else{
                System.out.println("variety not found");
            }
        }
    }

    public int getVarietyBoxes(String varietyToView){
        int numBoxes = 0;
        for(Order orderIndex : this.orders){
            if(orders.get(orders.indexOf(orderIndex)).getVariety().equals(varietyToView)){
                numBoxes += orders.get(orders.indexOf(orderIndex)).getNumBoxes();
            }
        }
        return numBoxes;
    }
}
