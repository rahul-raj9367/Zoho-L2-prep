import java.util.*;

// Class to represent a Taxi
class Taxi {
    private String taxiNo;
    private String currentPoint;
    private int earnings;
    private Booking currentBooking;

    public Taxi(String taxiNo) {
        this.taxiNo = taxiNo;
        this.currentPoint = "A"; // All taxis initially stationed at point A
        this.earnings = 0;
        this.currentBooking = null;
    }

    // Getter for taxi number
    public String getTaxiNo() {
        return taxiNo;
    }

    // Getter for current point
    public String getCurrentPoint() {
        return currentPoint;
    }

    // Getter for earnings
    public int getEarnings() {
        return earnings;
    }

    // Method to update current point
    public void setCurrentPoint(String point) {
        this.currentPoint = point;
    }

    // Method to assign a booking to the taxi
    public void assignBooking(Booking booking) {
        this.currentBooking = booking;
    }

    // Method to complete the current booking and update earnings
    public void completeBooking() {
        if (currentBooking != null) {
            earnings += currentBooking.calculateFare();
            currentBooking = null;
        }
    }
}

// Class to represent a Customer
class Customer {
    private int customerId;
    private String pickupPoint;
    private String dropPoint;
    private int pickupTime;

    public Customer(int customerId, String pickupPoint, String dropPoint, int pickupTime) {
        this.customerId = customerId;
        this.pickupPoint = pickupPoint;
        this.dropPoint = dropPoint;
        this.pickupTime = pickupTime;
    }

    // Getters for customer attributes
    public int getCustomerId() {
        return customerId;
    }

    public String getPickupPoint() {
        return pickupPoint;
    }

    public String getDropPoint() {
        return dropPoint;
    }

    public int getPickupTime() {
        return pickupTime;
    }
}

// Class to represent a Booking
class Booking {
    private int bookingId;
    private Customer customer;
    private String from;
    private String to;
    private int pickupTime;
    private int dropTime;

    public Booking(int bookingId, Customer customer, String from, String to, int pickupTime, int dropTime) {
        this.bookingId = bookingId;
        this.customer = customer;
        this.from = from;
        this.to = to;
        this.pickupTime = pickupTime;
        this.dropTime = dropTime;
    }

    // Getters for booking attributes
    public int getBookingId() {
        return bookingId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public int getPickupTime() {
        return pickupTime;
    }

    public int getDropTime() {
        return dropTime;
    }

    // Method to calculate fare based on distance
    public int calculateFare() {
        // For simplicity, assuming a flat rate of Rs.100 for the first 5 kilometers and Rs.10 for subsequent kilometers
        int distance = Math.abs(to.charAt(0) - from.charAt(0)) * 15;
        int fare = 100; // Minimum fare for the first 5 kilometers
        if (distance > 5) {
            fare += (distance - 5) * 10; // Additional fare for subsequent kilometers
        }
        return fare;
    }
}

// Class to represent the Call Taxi Booking Application
public class CallTaxiBooking {
    private List<Taxi> taxis;
    private List<Booking> bookings;

    public CallTaxiBooking() {
        // Initialize taxis
        taxis = new ArrayList<>();
        for (int i = 1; i <= 4; i++) {
            taxis.add(new Taxi("Taxi-" + i));
        }
        // Initialize bookings list
        bookings = new ArrayList<>();
    }

    // Method to handle taxi booking
    public void bookTaxi(Customer customer) {
        Taxi availableTaxi = findNearestFreeTaxi(customer);
        if (availableTaxi != null) {
            availableTaxi.assignBooking(new Booking(bookings.size() + 1, customer, customer.getPickupPoint(), customer.getDropPoint(), customer.getPickupTime(), -1));
            bookings.add(new Booking(bookings.size() + 1, customer, customer.getPickupPoint(), customer.getDropPoint(), customer.getPickupTime(), -1));
            System.out.println("Taxi can be allotted.");
            System.out.println(availableTaxi.getTaxiNo() + " is allotted.");
        } else {
            System.out.println("No taxi available at the moment. Booking rejected.");
        }
    }

    // Method to find the nearest free taxi
    private Taxi findNearestFreeTaxi(Customer customer) {
        int minDistance = Integer.MAX_VALUE;
        Taxi nearestFreeTaxi = null;
        for (Taxi taxi : taxis) {
            if (taxi.getCurrentBooking() == null) {
                int distance = Math.abs(taxi.getCurrentPoint().charAt(0) - customer.getPickupPoint().charAt(0));
                if (distance < minDistance) {
                    minDistance = distance;
                    nearestFreeTaxi = taxi;
                } else if (distance == minDistance && taxi.getEarnings() < nearestFreeTaxi.getEarnings()) {
                    nearestFreeTaxi = taxi;
                }
            }
        }
        return nearestFreeTaxi;
    }

    // Method to complete the booking and update taxi details
    public void completeBooking(int bookingId, String dropPoint, int dropTime) {
        for (Taxi taxi : taxis) {
            Booking booking = taxi.getCurrentBooking();
            if (booking != null && booking.getBookingId() == bookingId) {
                taxi.setCurrentPoint(dropPoint);
                taxi.completeBooking();
                booking = booking.setDropTime(dropTime);
                break;
            }
        }
    }

    // Method to display taxi details
    public void displayTaxiDetails() {
        System.out.println("Taxi No\tTotal Earnings\tBookingID\tCustomerID\tFrom\tTo\tPickupTime\tDropTime\tAmount");
        for (Taxi taxi : taxis) {
            System.out.print(taxi.getTaxiNo() + "\t" + taxi.getEarnings() + "\t");
            Booking booking = taxi.getCurrentBooking();
            if (booking != null) {
                System.out.println(booking.getBookingId() + "\t" + booking.getCustomer().getCustomerId() + "\t" + booking.getFrom() + "\t" + booking.getTo() + "\t" + booking.getPickupTime() + "\t" + booking.getDropTime() + "\t" + booking.calculateFare());
            } else {
                System.out.println("-");
            }
        }
    }

    // Main method to test the application
    public static void main(String[] args) {
        CallTaxiBooking callTaxiBooking = new CallTaxiBooking();

        // Test cases
        Customer customer1 = new Customer(1, "A", "B", 9);
        callTaxiBooking.bookTaxi(customer1);

        Customer customer2 = new Customer(2, "B", "D", 9);
        callTaxiBooking.bookTaxi(customer2);

        Customer customer3 = new Customer(3, "B", "C", 12);
        callTaxiBooking.bookTaxi(customer3);

        // Complete bookings
        callTaxiBooking.completeBooking(1, "B", 10);
        callTaxiBooking.completeBooking(2, "D", 11);
        callTaxiBooking.completeBooking(3, "C", 13);

        // Display taxi details
        callTaxiBooking.displayTaxiDetails();
    }
}
