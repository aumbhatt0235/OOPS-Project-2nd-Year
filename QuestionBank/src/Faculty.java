import java.io.FileWriter;
import java.io.IOException;

public class Faculty extends User {

    Faculty(String facultyName, String facultyID, String facultyPassword, String type) {
        userName = facultyName;
        userPassword = facultyPassword;
        userID = facultyID;
        userType = type;
    }

    void createUser() throws IOException {
        FileWriter facultyFile = new FileWriter("Faculty.txt", true);
        facultyFile.append(userID + " " + userName + "\n");
        FileWriter loginFile = new FileWriter("Login.txt", true);
        loginFile.append(userID + " " + userPassword + " " + userType + "\n");
        facultyFile.close();
        loginFile.close();
    }
}
