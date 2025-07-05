package ticket.booking.entities;

public class User {
        private int userId;
        private String name;
        private String password;
        private String hashPassword;
        List<Ticket> ticketsBooked;
        
    public User(int userId, String name, String password, String hashPassword, List<Ticket> ticketsBooked){
        this.userId = userId;
        this.name = name;
        this.password = password;
        this.hashPassword = hashPassword;
        this.ticketsBooked = ticketsBooked;
    }

    public User(){} 
    
    public String getName(){
        return this.name;
    }

    public int getUserId(){
        return this.userId;
    }

    public String getPassword(){
        return this.password;
    }

    public String getHashPassword(){
        return this.hashPassword;
    }

    public List<Ticket> getTicketsBooked() {
        return ticketsBooked;
    }

    public void printTickets(){
        for (int i = 0; i<ticketsBooked.size(); i++){
            System.out.println(ticketsBooked.get(i).getTicketInfo());
        }
    }

    public String getUserId() {
        return userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHashedPassword(String hashPassword) {
        this.hashPassword = hashPassword;
    }

    public void setTicketsBooked(List<Ticket> ticketsBooked) {
        this.ticketsBooked = ticketsBooked;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }


}

