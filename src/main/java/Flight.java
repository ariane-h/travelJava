import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> bookedPassengers;
    private Plane plane;
    private String flightNumber;
    private Airport destinationAirport;
    private Airport departureAirport;
    private String departureTime;
    private int availableSeats;

    public Flight( Plane plane, String flightNumber, Airport destinationAirport, Airport departureAirport, String departureTime) {
        this.bookedPassengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destinationAirport = destinationAirport;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.availableSeats = plane.getCapacity();
    }

    public ArrayList<Passenger> getBookedPassengers() {
        return bookedPassengers;
    }

    public int getBookedPassengersCount() {
        return bookedPassengers.size();
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public Airport getDestinationAirport() {
        return destinationAirport;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getAvailableSeats() {
        return this.availableSeats - this.getBookedPassengersCount();
    }

    public void addPassenger(Passenger passenger) {
        if (this.availableSeats > bookedPassengers.size()) {
            this.bookedPassengers.add(passenger);
        }
    }

}
