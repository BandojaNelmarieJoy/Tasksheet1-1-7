/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasksheet1.pkg1.pkg7;
import java.util.Scanner;
/**
 *
 * @author NelJoy
 */
public class Tasksheet117 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int c= in.nextInt();
        System.out.print("Enter second number: ");
        int j = in.nextInt();
        
        int sum, sub, mul, mod;
        float div;

        sum = c + j;
        sub = c - j;
        mul = c * j;
        div = c / j;
        mod = c % j;

        System.out.println("SUM         " + c + " + " + j + " = " + sum);
        System.out.println("DIFFERENCE  " + c + " - " + j + " = " + sub);
        System.out.println("PRODUCT     " + c + " * " + j + " = " + mul);
        System.out.println("QUOTIENT    " + c + " / " + j + " = " + div);
        System.out.println("MODULUS     " + c + " % " + j + " = " + mod);
    }
}