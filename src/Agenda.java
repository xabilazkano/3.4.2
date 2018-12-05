import java.util.ArrayList;

public class Agenda {

	private ArrayList<Contact> kontaktuak = new ArrayList<Contact>();

	public void addContact(Contact contact) {

		kontaktuak.add(contact);

	}

	public String readContact(String name) {

		return kontaktuak.get(index(name)).getContact();
	}

	public void deleteContact(String name) {

		if (index(name) == 100) {
			System.out.println("Contact not found");
		} else {
			kontaktuak.remove(index(name));
			System.out.println("Succesfuly deleted");
		}
	}

	public void modifyContact(String name, String what, String value) {
		if (index(name) == 100) {
			System.out.println("Contact not found");
		} else {

			switch (what) {

			case "name":

				kontaktuak.get(index(name)).getPerson().setName(value);
				break;

			case "age":
				int val = Integer.parseInt(value);
				kontaktuak.get(index(name)).getPerson().setAge(val);

				break;

			case "weight":
				val = Integer.parseInt(value);
				kontaktuak.get(index(name)).getPerson().setWeight(val);
				break;

			case "dni":

				kontaktuak.get(index(name)).getPerson().setDni(value);
				break;

			case "number":

				val = Integer.parseInt(value);

				kontaktuak.get(index(name)).setNumber(val);
				break;

			case "address":

				kontaktuak.get(index(name)).setAddress(value);
				break;

			}
			System.out.println("Succesfuly edited");
		}
	}

	private int index(String name) {
		int index = 100;
		for (int i = 0; i < kontaktuak.size(); i++) {
			if (kontaktuak.get(i).getPerson().getName().matches(name)) {
				index = i;
				break;
			}
		}

		return index;
	}

}