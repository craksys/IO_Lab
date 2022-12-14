package com.io;

import java.util.Scanner;

public class Main {
	public static Kierowcy kierowcy;
	public static Pojazdy pojazdy;
	public static Zlecenia zlecenia;

	public static void main(String []arg){
		kierowcy = new Kierowcy();
		pojazdy = new Pojazdy();
	}

	public void modifyCiezarowka(){
		Scanner in = new Scanner(System.in);
		pojazdy.printAll();
		System.out.println("Podaj id: ");
		int temp = in.nextInt() - 1 ;
		pojazdy.modifyCiezarowkaFields(temp);
	}
}