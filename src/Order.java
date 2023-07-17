public class Order{
    private String variety;
    private int numBoxes;

    public Order(String cookieVariety, int numBox){
        this.numBoxes = numBox;
        this.variety = cookieVariety;
    }

    public int getNumBoxes(){
        return this.numBoxes;
    }

    public String getVariety(){
        return this.variety;
    }


}