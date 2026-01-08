public class Booking {
    private int bookingId;
    private int dropTime;
    private int charges;
    private Customer customer;

    Booking(int id,int dropTime,int charges,Customer customer)
    {
        this.bookingId=id;
        this.dropTime=dropTime;
        this.charges=charges;
        this.customer=customer;
    }

    public int getBookingId() {return bookingId;}
    public int getDropTime(){return dropTime;}
    public int getCharges(){return charges;}

    public void setDropTime(int dropTime) {
        this.dropTime = dropTime;
    }

    public Customer getCustomer() {return customer;}
}
