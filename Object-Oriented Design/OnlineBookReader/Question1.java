import java.util.*;

public class Question1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        OnlineReaderSystem ors = new OnlineReaderSystem();
        User user = new User(1, "Jp", 4);
        ors.setActiveUser(user);

        System.out.println("Active User : " + user.getDetails());

    }

}