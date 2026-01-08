public class Customer {
    private int CustomerId;
    private char pickup;
    private char drop;
    private int pickuptime;

    Customer(int id,char pickup,char drop,int pickuptime)
    {
        this.CustomerId=id;
        this.pickup=pickup;
        this.drop=drop;
        this.pickuptime=pickuptime;
    }

    public int getCustomerId()
    {
        return CustomerId;
    }
    public char getPickup()
    {
        return pickup;
    }
    public char getDrop(){return drop;}
    public int getPickuptime(){return pickuptime; }
}
