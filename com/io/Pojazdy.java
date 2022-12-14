package com.io;

import java.util.ArrayList;
import java.util.Scanner;

public class Pojazdy {
	private ArrayList<Ciezarowka> listaCiezarowek = new ArrayList<>();
	private ArrayList<Dostawczak> listaDostawczakow = new ArrayList<>();

	void printAll() {
		System.out.println("Samochody Ciezarowe: ");
		for (int i = 0; i < listaCiezarowek.size(); i++) {
			Pojazd pojazd = listaCiezarowek.get(i);
			System.out.println(i+1 + ": Brand Name: " + pojazd.getBrand_name());
			System.out.println(i+1 + ": Car Registration: " + pojazd.getCar_registration());
		}
	}

	public void addCiezarowka() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter production date: ");
		int productionDate = scanner.nextInt();
		System.out.print("Enter max capacity: ");
		int maxCapacity = scanner.nextInt();
		System.out.print("Enter status: ");
		int status = scanner.nextInt();
		System.out.print("Enter brand name: ");
		String brandName = scanner.nextLine();
		System.out.print("Enter car registration: ");
		String carRegistration = scanner.nextLine();
		System.out.print("Enter trailer length: ");
		float trailerLength = scanner.nextFloat();
		System.out.print("Enter trailer weight: ");
		int trailerWeight = scanner.nextInt();
		System.out.print("Enter axle load: ");
		int axleLoad = scanner.nextInt();
		System.out.print("Enter type: ");
		char type = scanner.nextLine().charAt(0);

		Ciezarowka ciezarowka = new Ciezarowka(productionDate, maxCapacity, status, brandName, carRegistration, trailerLength, trailerWeight, axleLoad, type);

		listaCiezarowek.add(ciezarowka);
	}


	public void addDostawczak(){

	}

	public void removePojazd(int id) {
		throw new UnsupportedOperationException();
	}

	public void modifyCiezarowkaFields(int id) {
		Scanner scanner = new Scanner(System.in);
		Ciezarowka c = listaCiezarowek.get(id);

		System.out.println("Enter new production date: ");
		int productionDate = scanner.nextInt();
		c.setProduction_date(productionDate);

		System.out.println("Enter new max capacity: ");
		int maxCapacity = scanner.nextInt();
		c.setMax_capacity(maxCapacity);

		System.out.println("Enter new status: ");
		int status = scanner.nextInt();
		c.setStatus(status);

		System.out.println("Enter new brand name: ");
		String brandName = scanner.nextLine();
		c.setBrand_name(brandName);

		System.out.println("Enter new car registration: ");
		String carRegistration = scanner.nextLine();
		c.setCar_registration(carRegistration);

		System.out.println("Enter new trailer length: ");
		float trailerLength = scanner.nextFloat();
		c.setTrailer_length(trailerLength);

		System.out.println("Enter new trailer weight: ");
		int trailerWeight = scanner.nextInt();
		c.setTrailer_weight(trailerWeight);

		System.out.println("Enter new axle load: ");
		int axleLoad = scanner.nextInt();
		c.setAxle_load(axleLoad);

		System.out.println("Enter new type: ");
		char type = scanner.next().charAt(0);
		c.setType(type);
	}

	public void printCiezarowkaFields(int id) {
		if (id >= 0 && id < listaCiezarowek.size()) {
			Ciezarowka c = listaCiezarowek.get(id);
			System.out.println("Production Date: " + c.getProduction_date());
			System.out.println("Max Capacity: " + c.getMax_capacity());
			System.out.println("Status: " + c.getStatus());
			System.out.println("Brand Name: " + c.getBrand_name());
			System.out.println("Car Registration: " + c.getCar_registration());
			System.out.println("Trailer Length: " + c.getTrailer_length());
			System.out.println("Trailer Weight: " + c.getTrailer_weight());
			System.out.println("Axle Load: " + c.getAxle_load());
			System.out.println("Type: " + c.getType());
		} else {
			System.out.println("Invalid ID!");
		}
	}

}