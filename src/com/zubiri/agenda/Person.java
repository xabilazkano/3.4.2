package com.zubiri.agenda;
import java.util.Random;

/**
 * Person class
 * 
 * @author xabilazkano
 *
 */

public class Person extends Agenda {

	private String name = "example";
	private int age = 0;
	private double weight = 0;
	private String dni = this.dniByDefault();

	/**
	 * Default constructor
	 */
	public Person() { // first constructor

	}

	/**
	 * Second constructor
	 * 
	 * @param name   The name of the person
	 * @param age    The age of the person
	 * @param weight The weight of the person
	 * @param dni    The dni of the person
	 */
	public Person(String name, int age, double weight, String dni) { // second constructor
		this.name = name;
		if (age > 0 && age < 120) {
			this.age = age;
		}
		if (weight > 0) {
			this.weight = weight;
		}
		this.dni = dni;
	}

	/**
	 * Third constructor
	 * 
	 * @param name   The name of the person
	 * @param age    The age of the person
	 * @param weight The weight of the person
	 */

	public Person(String name) { // third constructor
		this.name = name;

	}

	/**
	 * Set a new name
	 * 
	 * @param name
	 */

	public void setName(String name) { // change the name
		this.name = name;
	}

	/**
	 * Set a new age
	 * 
	 * @param age
	 */

	public void setAge(int age) { // change the age
		if (age > 0 && age < 120) {
			this.age = age;
		}
	}

	/**
	 * Set a new weight
	 * 
	 * @param weight
	 */
	public void setWeight(double weight) { // change the weight
		if (weight > 0) {
			this.weight = weight;
		}
	}

	/**
	 * Set a new dni
	 * 
	 * @param dni
	 */

	public void setDni(String dni) { // change the dni
		this.dni = dni;
	}

	/**
	 * Gets the name
	 * 
	 * @return Returns the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the age
	 * 
	 * @return Returns the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Gets the weight
	 * 
	 * @return Returns the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * Gets the dni
	 * 
	 * @return Returns the dni
	 */

	public String getDni() {
		return dni;
	}

	/**
	 * Checks if the person has an ideal weight
	 */
	public void idealWeight() { // we check that the weight is between these two values
		if (this.weight > 50 && this.weight < 90) {
			System.out.println("You have an ideal weight");
		} else {
			System.out.println("You dont have an ideal weight");
		}
	}

	/**
	 * Checks if the person is adult
	 */
	public void adult() { // we check that he is an adult
		if (this.age >= 18) {
			System.out.println("You are adult");
		} else {
			System.out.println("You arent adult");
		}
	}

	/**
	 * Print all the values
	 */
	public String tostring() { // we show all the properties
		return this.name + " " + this.age + " " + this.weight + " " + this.dni;
	}

	/**
	 * Create a new dni
	 * 
	 * @return Returns the new dni
	 */
	public String dniByDefault() { // we create a random dni
		String number = "";
		for (int i = 0; i < 9; i++) { // we create 9 random numbers
			number = number + String.valueOf(new Random().nextInt(10));
		}
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // we create a random letter and add it to the number
		number = number + alphabet.charAt(new Random().nextInt(alphabet.length()));
		return number;
	}
}
