package edu.pitt.cs;

public class CatImpl implements Cat {
	int id;
	String name;
	boolean isRented; //true means cat is rented

	public CatImpl(int id, String name) {
		this.id = id;
		this.name = name;
		isRented = false;
	}

	public void rentCat() {
		isRented = true;
	}

	public void returnCat() {
		isRented = false;
	}

	public void renameCat(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public boolean getRented() {
		return isRented;
	}

	public String toString() {
		return String.format("ID %d. %s", id, name);
	}

}