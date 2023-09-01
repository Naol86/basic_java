package basic_java;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class JAVA1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.print("enter number x : ");
        System.out.print("enter ur weight in kg : ");
        double x = scanner.nextDouble();
        System.out.print("enter ur height in meter : ");
        double y = scanner.nextDouble();

        double BMI = x / Math.pow(y, 2);

        if (BMI<15){
            System.out.printf("your BMI is %.2f so u r under weight",BMI);
        }
        else if (BMI>15 && BMI<25){
            System.out.printf("your BMI is %.2f so u r normal",BMI);
        }
        else{
            System.out.printf("your BMI is %.2f so u r over weight",BMI);
        }

        scanner.close();
    }
}