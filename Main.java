import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        
        Scanner scanner = new Scanner(System.in);
        ReservationSystem reservationSystem = new ReservationSystem();
        Login login = new Login();

        System.out.println("\nWelcome to the Online Reservation System!\n");
        if (!login.authenticate()) {
            return;
        }

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. View Available Trains");
            System.out.println("2. Reserve Ticket");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Exit\n");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            System.out.print("\n");

            switch (choice) {
                case 1:
                    reservationSystem.displayTrains();
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter train number: ");
                    int trainNumber = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter class type: ");
                    String classType = scanner.nextLine();
                    System.out.print("Enter date of journey: ");
                    String dateOfJourney = scanner.nextLine();
                    System.out.print("Enter from place: ");
                    String from = scanner.nextLine();
                    System.out.print("Enter destination: ");
                    String to = scanner.nextLine();

                    reservationSystem.reserveTicket(name, trainNumber, classType, dateOfJourney, from, to);
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.print("\nEnter your name to cancel ticket: ");
                    String cancelName = scanner.nextLine();
                    reservationSystem.cancelTicket(cancelName);
                    break;
                case 4:
                    System.out.println("Thank you for using the Online Reservation System!");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
