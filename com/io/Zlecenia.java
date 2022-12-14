package com.io;

import java.util.ArrayList;
import java.util.Scanner;

public class Zlecenia {
	private ArrayList <Zlecenie> listaZlecen = new ArrayList<Zlecenie>();
	public Zlecenie unnamed_Zlecenie_;
	public Main unnamed_Main_;

	public void printAll() {
		throw new UnsupportedOperationException();
	}

	public void addZlecenie(Zlecenie zlecenie) {
		throw new UnsupportedOperationException();
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
					System.out.println("Dzień: ");
					edytowane.setStart_day(in.nextInt());
					System.out.println("Miesiąc: ");
					edytowane.setStart_month(in.nextInt());
					System.out.println("Rok: ");
					edytowane.setStart_year(in.nextInt());
				case 2:
					System.out.println("Dzień: ");
					edytowane.setFinish_year(in.nextInt());
					System.out.println("Miesiąc: ");
					edytowane.setFinish_month(in.nextInt());
					System.out.println("Rok: ");
					edytowane.setFinish_year(in.nextInt());
				case 3:
					System.out.println("Sugerowany koszt: " + edytowane.calculateValue() + " zł \n");
					System.out.println("Nowy koszt: ");
					double x = in.nextDouble();
					if(x > (0.9 * edytowane.calculateValue()) && x < (1.1 * edytowane.calculateValue())){
						edytowane.setValue(x);
					} else {
						System.out.println("Koszt nie jest poprawny");
					}
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
					if (edytowane.getValue() < (0.9 * edytowane.calculateValue()) || edytowane.getValue() > (1.1 * edytowane.calculateValue())){
						System.out.println("Koszt nie jest poprawny");
					} else {
						break;
					}
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
}