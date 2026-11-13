package Session5;
// Implements Runnable so each screen can be managed as a thread
public class MovieTheatre implements Runnable {
    private String showName; // Name of the movie
    private String showTime; // time of the show
    private int totalSeats; // Total seat of the screen room
    private int availableSeats; // Seats still available 
    private BookingAgent agent; // The agent assigned to book a seat 

    // Sets up the screen with show details and the assigned agent
    public MovieTheatre(String showName, String showTime, int totalSeats, int availableSeats, BookingAgent agent) {
        this.showName = showName;
        this.showTime = showTime;
        this.totalSeats = totalSeats;
        this.availableSeats = availableSeats;
        this.agent = agent;
    }

    // Prints show details to the console
    public void displaysShows() {
        System.out.println("Show Name: " + showName);
        System.out.println("Show Time: " + showTime);
        System.out.println("Available Seats: " + availableSeats);
        System.out.println("Total Seats: " + totalSeats);
    }

    // Checks if a seat is available
    public boolean isSeatAvailable() {
        return availableSeats > 0;
    }

    // Books a seat safely across multiple threads
    public synchronized boolean bookSeat() {
        if (isSeatAvailable()) {
            availableSeats--;
            return true;
        } else {
            return false;
        }
    }

    // Called when the thread starts; agent attempts to book a seat
    @Override
    public void run() {
        agent.bookTicket(this);
    }

    public static void main(String[] args) {
        // Create agents with unique names
        BookingAgent agent1 = new BookingAgent("Agent Anointed");
        BookingAgent agent2 = new BookingAgent("Agent Demilade");

        // Create screens and assign an agent to each
        MovieTheatre screen1 = new MovieTheatre("Shrek", "12:00 PM", 2, 2, agent1);
        MovieTheatre screen2 = new MovieTheatre("Shrek", "12:00 PM", 2, 2, agent2);

        // Display movie details
        screen1.displaysShows();
        screen2.displaysShows();

        // Create and start threads
        Thread thread1 = new Thread(screen1);
        Thread thread2 = new Thread(screen2);

        thread1.start();
        thread2.start();
    }
}
