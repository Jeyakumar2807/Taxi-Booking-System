import java.util.ArrayList;
import java.util.List;

public class taxi {
    private int taxiId;
    private char CurrentSpot;
    private int freeTime;
    private int earnings;
    private List<Booking>bookings;

    taxi(int id)
    {
        this.taxiId=id;
        this.CurrentSpot='A';
        this.freeTime=0;
        this.earnings=0;
        bookings=new ArrayList<>();
    }

    public boolean isfree(char pickup,int pickuptime)
    {
        int traveltime=Math.abs(CurrentSpot-pickup);
        if(freeTime+traveltime<=pickuptime)
        {
            return true;
        }
        return false;
    }
    public void assignBooking(Booking b)
    {
        bookings.add(b);
    }
    public int getTaxiId(){ return taxiId;}
    public char getCurrentSpot(){return CurrentSpot;}
    public int getFreeTime(){return freeTime;}
    public int getEarnings() {return earnings;}

    public List<Booking> getBookings() {
        return bookings;
    }
    public void SetFreetime(int freeTime)
    {
        this.freeTime=freeTime;
    }
    public void SetEarnings(int earnings)
    {
        this.earnings=earnings;
    }

    public void setCurrentSpot(char currentSpot) {
        this.CurrentSpot=currentSpot;
    }
}
