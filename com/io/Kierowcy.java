package com.io;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;

public class Kierowcy {
	private ArrayList<Kierowca> listKierowcow = new ArrayList<>();
	private Kierowca kierowca = new Kierowca();

	public void printAll() {
		kierowca.setName("Bartosz");
		kierowca.setSurname("Kipa");
		listKierowcow.add(kierowca);
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

	public Kierowca createKierowca() {
		Kierowca tempKierowca = new Kierowca();
		return tempKierowca;
	}

	public void removeKierowca(int id) {
		throw new UnsupportedOperationException();
	}
	public void editKierowca(int id) {
		throw new UnsupportedOperationException();
	}
	public void showSelected(int id) {
		throw new UnsupportedOperationException();
	}
	public void addAndCreateKierowca() {
		Kierowca tempKierowca = createKierowca();
		Scanner in = new Scanner(System.in);
		System.out.println("Podaj Imię: ");
		tempKierowca.setName(in.next());
		System.out.println("Podaj Nazwisko: ");
		tempKierowca.setSurname(in.next());
		listKierowcow.add(tempKierowca);
	}
	
	public boolean searchKierowca(Kierowca kierowca) {
		throw new UnsupportedOperationException();
	}
}