import java.util.ArrayList;
import java.util.List;

public class bookingSystem {
    private List<taxi> taxis=new ArrayList<>();
    private int BookingTaxiId=1;

    bookingSystem(int taxicnt)
    {
        for(int i=1;i<=taxicnt;i++)
        {
            taxis.add(new taxi(i));
        }
    }
    private int calculateCharges(char pickup,char drop)
    {
        int distance=Math.abs(pickup-drop)*15;
        int amount=100;
        distance-=5;
        amount+=distance*10;
        return amount;
    }

    taxi findtaxi(char pickup,int pickuptime)
    {
        List<taxi>freetaxi=new ArrayList<>();
        for(taxi t:taxis)
        {
            if(t.isfree(pickup,pickuptime))
            {
                freetaxi.add(t);
            }
        }
        if(freetaxi.isEmpty()) return null;
        int mindistance=Integer.MAX_VALUE;
        for(taxi t:freetaxi)
        {
            int distance=Math.abs(pickup- t.getCurrentSpot());
            if(distance<mindistance)
            {
                mindistance=distance;
            }
        }
        List<taxi>closest=new ArrayList<>();
        for(taxi t:freetaxi)
        {
            int distance=Math.abs(pickup-t.getCurrentSpot());
            if(distance==mindistance)
            {
                closest.add(t);
            }
        }
        taxi selected=closest.get(0);
        for(taxi t:closest)
        {
            if(t.getEarnings()<selected.getEarnings())
            {
                selected=t;
            }
        }
        return selected;
    }

    void booktaxi(Customer c)
    {
        taxi selectedtaxi=findtaxi(c.getPickup(), c.getPickuptime());
        if(selectedtaxi==null)
        {
            System.out.println("No taxi available");
            return;
        }
        int traveltime=Math.abs(c.getPickup()-c.getDrop());
        int droptime=c.getPickuptime()+traveltime;
        int charges=calculateCharges(c.getPickup(), c.getDrop());
        Booking b=new Booking(BookingTaxiId,droptime,charges,c);
        BookingTaxiId++;

        selectedtaxi.assignBooking(b);
        selectedtaxi.SetFreetime(droptime);
        selectedtaxi.SetEarnings(selectedtaxi.getEarnings()+charges);
        selectedtaxi.setCurrentSpot(c.getDrop());
        System.out.println("Taxi- "+selectedtaxi.getTaxiId()+" is allocated");
    }
    void displaytaxi()
    {
        for(taxi t:taxis)
        {
            System.out.println("Taxi- "+t.getTaxiId()+" Earnings- " + t.getEarnings());
            System.out.println("Booking id      customer Id     From        To      Pickuptime     Droptime        charges");
            for(Booking b: t.getBookings()){
                System.out.println(b.getBookingId()+"       "+b.getCustomer().getCustomerId()+"     "+
                        b.getCustomer().getPickup()+"       "+b.getCustomer().getDrop()+"       "+b.getCustomer().getPickuptime()+"     "+b.getDropTime()+"     "+b.getCharges());
            }
        }
    }

}
