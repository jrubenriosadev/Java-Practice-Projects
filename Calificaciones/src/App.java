import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {

    public static Scanner s = new Scanner(System.in);
    public static List<Double> grades = new ArrayList<>();

    public static class Util {
        public double min = 0.0;
        public double max = 0.0;
        public double average = 0.0;

        public Util(List<Double> list) {
            min = Collections.min(list);
            max = Collections.max(list);
        }
    }

   
    public static void main(String[] args) {
        Util utilList = new Util(grades);

        for (int i = 0; i < 4; i++) {
            double grade = readDouble("Dame la calificación " + i + ":");
            if(grade >= 0) {
                grades.add(grade);
            }
        }
        System.out.println(grades);
        System.out.println("El maximo es " + utilList.max);
        System.out.println("El minimo es " + utilList.min);
    }

    public static double readDouble(String msg) {
        while (true) {
            try {
                System.out.println(msg);
                double num = Double.parseDouble(s.nextLine());
                return num;
            } catch (NumberFormatException err) {
                System.out.println("Ese no es un número valido!");
            }
        }
    }
}