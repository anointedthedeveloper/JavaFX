package Session5;
// Represents a booking agent capable of making seat reservations for customers
public class BookingAgent {
    private String agentName;// Unique name identifying this booking agent

    // Initialises the agent with a unique name
    public BookingAgent(String agentName) {
        this.agentName = agentName;
    }

    // Attempts to book a seat on the given screen; prints success or failure
    public void bookTicket(MovieTheatre theatre) {
        if (theatre.bookSeat()) {
            System.out.println(agentName + " booked a seat.");
        } else {
            System.out.println(agentName + " could not book a seat.");
        }
    }
}