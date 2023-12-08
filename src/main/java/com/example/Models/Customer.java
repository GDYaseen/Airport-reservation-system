package Models;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person{
    private List<Booking> bookings = new ArrayList<Booking>();

    
    public Customer(Booking b) {
        bookings.add(b);
    }

    public Customer(List<Booking> bookings) {
        this.bookings = bookings;
    }
    
    //#region getter and setter
    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
    //#endregion
}
