
public class Contact extends Agenda {

	private Person pertsona;
	private int number;
	private String address;

	public Contact() {

	}

	public Contact(Person person, int number, String address) {
		this.pertsona = person;
		this.number = number;
		this.address = address;
	}

	public void setPerson(Person person) {
		this.pertsona = person;
	}

	public Person getPerson() {
		return this.pertsona;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return this.number;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return this.address;
	}

	public String getContact() {
		return pertsona.tostring() + " " + number + " " + address;

	}
}
