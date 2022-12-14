package com.io;

import java.util.ArrayList;
import java.util.Scanner;

public class Zlecenia {
	private ArrayList <Zlecenie> listaZlecen = new ArrayList<Zlecenie>();
	private Kierowcy kierowcy = new Kierowcy();
	private Pojazdy pojazdy = new Pojazdy();
	Scanner scanner = new Scanner(System.in);
	public void printAll(ArrayList<Zlecenie> listaZlecen) {
		for (Zlecenie zlecenie : listaZlecen) {
			System.out.println("Company name: " + zlecenie.getCompany_name());
			System.out.println("ID: " + zlecenie.getId());
		}
	}


	public void addZlecenie() {
		Zlecenie zlecenie = new Zlecenie();
		askUserAndSetZlecenieVariables(zlecenie);
		zlecenie.calculateValue();
		System.out.println("Sugerowany koszt zlecenia to: " + Math.round(zlecenie.getValue()) + " zł");
		System.out.println("Czy chcesz nadpisać koszt? 1 - tak, 0 - nie: ");
		int isWantToChangeCost = scanner.nextInt();
		double newCost;
		if(isWantToChangeCost == 1){
			System.out.println("Wprowadź nowy koszt: ");
			newCost = scanner.nextDouble();
			zlecenie.setValue(newCost);
			System.out.println("Nadpisano!");
		}

		if(!containsZlecenie(zlecenie.getCompany_name(),zlecenie.getDistance())){
			addKierowcaAndPojazd(zlecenie);
			listaZlecen.add(zlecenie);
		}
	}

	public Zlecenie createZlecenie() {
		throw new UnsupportedOperationException();
	}

	public void removeZlecenie(int id) {
		throw new UnsupportedOperationException();
	}

	public void editZlecenie(int id) {
		Zlecenie edytowane = listaZlecen.get(id);
		while(true){
			Scanner in = new Scanner(System.in);
			System.out.println("Co edytować? \n");
			System.out.println("0. Zakończ \n");
			System.out.println("1. Data rozpoczęcia \n");
			System.out.println("2. Data zakończenia \n");
			System.out.println("3. Koszt \n");
			System.out.println("4. Odległość \n");
			System.out.println("5. Status \n");
			System.out.println("6. Pojazd \n");
			System.out.println("7. Kierowca \n");
			int a = in.nextInt();
			switch (a){
				case 1:

				case 2:

				case 3:
					//System.out.println("Sugerowany koszt: " + edytowane.calculateValue() + " zł \n");
					System.out.println("Nowy koszt: ");
					double x = in.nextDouble();
					//if(x > (0.9 * edytowane.calculateValue()) && x < (1.1 * edytowane.calculateValue())){
					//	edytowane.setValue(x);
					//} else {
					//	System.out.println("Koszt nie jest poprawny");
					//}
				case 4:
					System.out.println("Odległość: ");
					edytowane.setDistance(in.nextInt());
				case 5:
					System.out.println("Status: ");
					edytowane.setStatus(in.nextInt());
				case 6:
					edytowane.getPojazd();
				case 7:
					edytowane.getKierowca();
				case 0:
					//if (edytowane.getValue() < (0.9 * edytowane.calculateValue()) || edytowane.getValue() > (1.1 * edytowane.calculateValue())){
					//	System.out.println("Koszt nie jest poprawny");
					//} else {
					//	break;
					//}
			}

		}
	}

	public void showSelected(int id) {
		throw new UnsupportedOperationException();
	}

	public void accept(int id, int user_id) {
		if(user_id != 0){
			System.out.println("Niepoprawny pracownik \n");
			System.out.println("Zlecenie nie zostało zaakceptowane \n");
		} else {
			listaZlecen.get(id).setStatus(1);
		}
	}

	public void addAndCreateZlecenie() {
		throw new UnsupportedOperationException();
	}

	public boolean containsZlecenie(String companyName, int distance) {
		for (Zlecenie zlecenie : listaZlecen) {
			if (zlecenie.getCompany_name().equals(companyName) && zlecenie.getDistance() == distance) {
				return true;
			}
		}
		return false;
	}

	public void askUserAndSetZlecenieVariables(Zlecenie zlecenie) {

		System.out.println("Enter company name: ");
		zlecenie.setCompany_name(scanner.nextLine());

		System.out.println("Enter distance: ");
		zlecenie.setDistance(scanner.nextInt());

		System.out.println("Enter duration: ");
		zlecenie.setDuration(scanner.nextInt());

		System.out.println("Enter status: ");
		zlecenie.setStatus(scanner.nextInt());

		System.out.println("Enter id: ");
		zlecenie.setId(scanner.nextInt());
	}

	public void addKierowcaAndPojazd(Zlecenie zlecenie){
		kierowcy.printAll();
		System.out.println("Podaj id kierowcy do przypisania: ");
		int id = scanner.nextInt()-1;
		zlecenie.setKierowca(kierowcy.listKierowcow.get(id));
		kierowcy.listKierowcow.get(id).setStatus(10);

		pojazdy.printAll();
		System.out.println("Podaj id pojazdu do przypisania: ");
		id = scanner.nextInt()-1;
		zlecenie.setPojazd(pojazdy.listaCiezarowek.get(id));
		pojazdy.listaCiezarowek.get(id).setStatus(10);
	}
}