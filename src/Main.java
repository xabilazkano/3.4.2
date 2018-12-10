import java.util.Scanner;

import com.zubiri.agenda.Contact;
import com.zubiri.agenda.Person;
import com.zubiri.agenda.Agenda;

public class Main {

	public static void main(String[] args) {
		Person pertsona = new Person();
		Contact kontaktua = new Contact();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("What do you want to do?");
			System.out.println("1.- Add a contact");
			System.out.println("2.- View a contact");
			System.out.println("3.- Delete a contact");
			System.out.println("4.- Modify a contact");
			System.out.println("0.- Quit");

			if (sc.hasNextInt()) {
				int option = sc.nextInt();
				if (option >= 0 && option < 5) {
					switch (option) {

					case 0:
						System.out.println("Bye!");
						flag = false;
						break;

					case 1:
						System.out.println("Enter the name of the contact:");
						String name = sc.next();
						System.out.println("Age:");
						int age = sc.nextInt();
						System.out.println("Weight:");
						double weight = sc.nextDouble();
						System.out.println("DNI:");
						String dni = sc.next();
						System.out.println("Telephone number");
						int phone = sc.nextInt();
						System.out.println("Address");
						String address = sc.next();
						Person create = new Person(name, age, weight, dni);
						Contact sortu = new Contact(create, phone, address);
						pertsona.addContact(sortu);
						System.out.println("Succesfuly added.");

						break;

					case 2:
						System.out.println("Enter the name of the contact:");
						name = sc.next();

						System.out.println(pertsona.readContact(name));

						break;

					case 3:
						System.out.println("Enter the name of the contact");
						name = sc.next();
						pertsona.deleteContact(name);

						break;

					case 4:
						System.out.println("Enter the name of the contact");
						name = sc.next();
						System.out.println("What do you want to change?");
						String change = sc.next();
						System.out.println("New value");
						String value = sc.next();
						pertsona.modifyContact(name, change, value);
					}

				}

			} else {
				sc.next();
				System.out.println("Enter a valid number");
			}

		}
	}
}
