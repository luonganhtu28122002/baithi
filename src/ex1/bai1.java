package ex1;

import java.util.Scanner;

public class bai1 {
    public static void main(String args[]) {

        double banlance,annualInterestRate,interest;
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap vao so tien gui ngan hang : ");
        banlance = scan.nextDouble();
        System.out.print("Nhap vao lai suat hang nam (%) : ");
        annualInterestRate = scan.nextDouble();
        scan.close();
        interest = banlance * (annualInterestRate/1200);
        System.out.print("So tien lai la : " +interest);
    }
}
