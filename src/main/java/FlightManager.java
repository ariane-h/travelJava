import java.util.ArrayList;

public class FlightManager {


    private Flight flight;
    private int reservedWeight;
    private int bookedWeight;

    public FlightManager(Flight flight) {
        this.flight = flight;
        this.reservedWeight = 0;
        this.bookedWeight = 0;
    }

    public Flight getFlight() {
        return flight;
    }

    public int getReservedWeight(){
        Plane plane = this.flight.getPlane();
        this.reservedWeight = (plane.getTotalWeight()/2);
        return this.reservedWeight;
    }

    public int getFlightPassengerCount(){
        return flight.getBookedPassengers().size();
    }

    public int getPassengerBagCount(){
        ArrayList<Passenger> bookedpassengers = this.flight.getBookedPassengers();
        int bags = 0;
        for (Passenger passenger : bookedpassengers){
             bags += passenger.countBags();
        } return bags;
    }

    public double getBagWeightPP(){
        Plane plane = this.flight.getPlane();
        double capacity = plane.getCapacity();
        double reservedWeight = this.getReservedWeight();
        return reservedWeight / capacity;
    }

    public double getAvailableReservationWeight(){
        double passengerBags = this.getPassengerBagCount();
        double singleBagWeight = this.getBagWeightPP();
        double reservedWeight = this.reservedWeight;

        double totalPassengerBagWeight = passengerBags * singleBagWeight;
        return reservedWeight - totalPassengerBagWeight;
    }

}
