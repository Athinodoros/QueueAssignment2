package queueassignment;

/**
 *
 * @author favl
 */
public class Contestant {
    
    /*
    Add attributes and methods.
    */
    
    private String firstName;
    private String lastName;
    private int ticketNumber;

    public Contestant(String firstName, String lastName, int ticketNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ticketNumber = ticketNumber;
    }

    @Override
    public String toString() {
        return firstName + ", " + lastName + ", " + ticketNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }
    
    
}
