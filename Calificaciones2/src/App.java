import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    static Scanner globalScanner = new Scanner(System.in);
    static List<Double> student1grades = new ArrayList<>();

    public static void userDataInput() {
        for(int i = 0; i<4; ++i) {
            System.out.println("Dame la calificación 1: ");
            double grade = globalScanner.nextDouble();
            student1grades.add(grade);
        }

    }

    public static void main(String[] args) throws Exception {
        userDataInput();
        System.out.println(student1grades);

    }
}
