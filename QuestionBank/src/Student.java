import java.io.FileWriter;
import java.io.IOException;

public class Student extends User {

    Student(String studentName, String studentID, String studentPassword, String type) {
        userName = studentName;
        userPassword = studentPassword;
        userID = studentID;
        userType = type;
    }

    void createUser() throws IOException {
        FileWriter studentsFile = new FileWriter("Students.txt", true);
        studentsFile.append(userID + " " + userName + "\n");
        FileWriter loginFile = new FileWriter("Login.txt", true);
        loginFile.append(userID + " " + userPassword + " " + userType + "\n");
        studentsFile.close();
        loginFile.close();
    }
}
