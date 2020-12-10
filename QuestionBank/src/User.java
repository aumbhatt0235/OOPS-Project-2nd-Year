import java.io.IOException;

public abstract class User {
    String userName;
    String userID;
    String userPassword;
    String userType;

    abstract void createUser() throws IOException;

    public String getUserName() {
        return userName;
    }

    public String getUserID() {
        return userID;
    }
}
