package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Irasykite nuvaziuotus KM");
	float a = sc.nextFloat();
	System.out.println("Irasykite kuro sanaudas L");
	float b = sc.nextFloat();
	System.out.println("Jusu vidutines kuro sanaudos: " +((b*100)/a) );

    }
}
