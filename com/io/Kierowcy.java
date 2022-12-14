package com.io;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;

public class Kierowcy {
	private ArrayList<Kierowca> listKierowcow = new ArrayList<>();

	public void printAll() {
		if(listKierowcow.size() == 0){
			System.out.println("Brak kierowców w bazie!");
		}

		System.out.println("Lista kierowców: ");
		for(int i = 0; i < listKierowcow.size(); i++){
			System.out.print(i+1 + ". ");
			System.out.print(listKierowcow.get(i).getName() + " ");
			System.out.println(listKierowcow.get(i).getSurname() + " ");
		}
	}


	public void removeKierowca() {
		Scanner in = new Scanner(System.in);
		printAll();
		int id = in.nextInt();
		listKierowcow.remove(id-1);
	}

	public void editKierowca(int id) {
		Scanner in = new Scanner(System.in);
		showSelected(id);
		System.out.println("Czy na pewno chcesz edytować wybranego kierowcę? 1 - tak, 0 - nie");
		int menu = in.nextInt();
		if(menu != 1){
			return;
		}
		System.out.println("Dobrze! Który element chcesz edytować? ");
		System.out.println("1. Imię, 2. Nazwisko, 3. Dzien urodzenia, 4. Miesiąc urodzenia, 5. Rok urodzenia, 6. Pesel, 7. Status, 8. Uprawnienia");
		menu = in.nextInt()-1;
		switch (menu){
			case 0:
				System.out.println("Podaj nowe imię: ");
				listKierowcow.get(id).setName(in.next());
			case 1:
				System.out.println("Podaj nowe nazwisko: ");
				listKierowcow.get(id).setSurname(in.next());
			case 2:
				System.out.println("Podaj dzień urodzenia: ");
				listKierowcow.get(id).setBirth_day(in.nextInt());
			case 3:
				System.out.println("Podaj miesiąc urodzenia: ");
				listKierowcow.get(id).setBirth_month(in.nextInt());
			case 4:
				System.out.println("Podaj rok urodzenia: ");
				listKierowcow.get(id).setBirth_year(in.nextInt());
			case 5:
				System.out.println("Podaj Pesel: ");
				listKierowcow.get(id).setPesel(in.nextLong());
			case 6:
				System.out.println("Podaj id statusu: ");
				listKierowcow.get(id).setStatus(in.nextInt());
			case 7:
				System.out.println("Ile uprawnień posiada kierowca: ");
				int tempNumber = in.nextInt();
				ArrayList entitlement = new ArrayList<String>();
				for (int i = 0; i < tempNumber; i++) {
					System.out.println("Podaj skrót uprawnienia: ");
					entitlement.add(in.next());
				}
				listKierowcow.get(id).setEntitlement(entitlement);
			default:
				throw new IllegalStateException("Unexpected value: " + menu);
		}

	}
	public void showSelected(int id) {
		System.out.println("Imię i nazwisko: "+ listKierowcow.get(id).getName() +" "+listKierowcow.get(id).getSurname());
		System.out.println("Data urodzenia: " + listKierowcow.get(id).getBirth_day()+"."+listKierowcow.get(id).getBirth_month()+"."+listKierowcow.get(id).getBirth_year());
		System.out.println("Pesel: "+listKierowcow.get(id).getPesel());
		System.out.println("Status: " + listKierowcow.get(id).getStatus());
		for (int i = 0; i < listKierowcow.get(id).getEntitlement().size(); i++) {
			System.out.println(listKierowcow.get(id).getEntitlement().get(i) + " ");
		}
	}
	public void addAndCreateKierowca() {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the birth year: ");
		int birthYear = input.nextInt();

		System.out.println("Enter the birth month: ");
		int birthMonth = input.nextInt();

		System.out.println("Enter the birth day: ");
		int birthDay = input.nextInt();

		System.out.println("Enter the name: ");
		String name = input.nextLine();

		System.out.println("Enter the surname: ");
		String surname = input.nextLine();

		System.out.println("Ile uprawnień posiada kierowca: ");
		int tempNumber = input.nextInt();
		ArrayList entitlement = new ArrayList<String>();
		for (int i = 0; i < tempNumber; i++) {
			System.out.println("Podaj skrót uprawnienia: ");
			entitlement.add(input.next());
		}

		listKierowcow.add(new Kierowca(birthYear, birthMonth, birthDay, name, surname, entitlement, 0, 0));
	}

	public boolean containsKierowca(String name, String surname) {
		for (Kierowca kierowca : listKierowcow) {
			if (kierowca.getName().equals(name) && kierowca.getSurname().equals(surname)) {
				return true;
			}
		}
		return false;
	}
}