import java.util.ArrayList;
import java.util.List;

public class ReservationSystem {
    private List<Train> trains = new ArrayList<>();
    private List<String> reservations = new ArrayList<>();

    public ReservationSystem() {
        trains.add(new Train(101, "Express"));
        trains.add(new Train(102, "Superfast"));
    }

    public void displayTrains() {
        System.out.println("Available Trains:");
        for (Train train : trains) {
            System.out.println("Train Number: " + train.getTrainNumber() + ", Train Name: " + train.getTrainName());
        }
    }

    public void reserveTicket(String name, int trainNumber, String classType, String dateOfJourney, String from, String to) {
        reservations.add(name + "," + trainNumber + "," + classType + "," + dateOfJourney + "," + from + "," + to);
        System.out.println("\nReservation successful for " + name);
    }

    public void cancelTicket(String name) {
        boolean found = false;
        for (String reservation : reservations) {
            if (reservation.contains(name)) {
                reservations.remove(reservation);
                System.out.println("\nReservation cancelled for " + name);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("\nNo reservation found for " + name + ". Unable to cancel.");
        }
    }
}
