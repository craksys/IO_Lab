package com.io;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;

public class Kierowcy {
	protected ArrayList<Kierowca> listKierowcow = new ArrayList<>();
	Scanner in = new Scanner(System.in);
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
		printAll();
		int id = in.nextInt();
		listKierowcow.remove(id-1);
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

		if(!containsKierowca(name,surname)) {
			listKierowcow.add(new Kierowca(birthYear, birthMonth, birthDay, name, surname, entitlement, 0, 0));
		}
	}

	public boolean containsKierowca(String name, String surname) {
		for (Kierowca kierowca : listKierowcow) {
			if (kierowca.getName().equals(name) && kierowca.getSurname().equals(surname)) {
				return true;
			}
		}
		return false;
	}

	public void editKierowca(int index, String variable, Object newValue) {
		Kierowca tempKierowca = listKierowcow.get(index);

		if (variable.equals("rok urodzenia")) {
			tempKierowca.setBirth_year((int) newValue);
		} else if (variable.equals("miesiac urodzenia")) {
			tempKierowca.setBirth_month((int) newValue);
		} else if (variable.equals("dzien urodzenia")) {
			tempKierowca.setBirth_day((int) newValue);
		} else if (variable.equals("imie")) {
			tempKierowca.setName((String) newValue);
		} else if (variable.equals("nazwisko")) {
			tempKierowca.setSurname((String) newValue);
		} else if (variable.equals("entitlement")) {
			tempKierowca.setEntitlement((ArrayList) newValue);
		} else if (variable.equals("pesel")) {
			tempKierowca.setPesel((long) newValue);
		} else if (variable.equals("status")) {
			tempKierowca.setStatus((int) newValue);
		}
	}

}