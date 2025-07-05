package ticket.booking.services;

import java.io.File;
import java.util.*;

public class UserBookingService {
    private User user;
    private List<User> userList;
    private ObjectMapper objectMapper = new ObjectMapper();
    private static final String USER_PATH = "app/src/main/java/ticket.booking/localDB/users.json";

    public UserBookingService(User user1){
        this.user = user1;
        File users = new File(USER_PATH);
        userList = objectMapper.readValue(users, new TypeReference<List<User>>(){});

    }
    
}
