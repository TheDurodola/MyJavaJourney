import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    private List<Contact> contacts = new ArrayList<Contact>();
    private int id;


    public boolean isEmpty() {
        return contacts.isEmpty();
    }

    public int size() {
        return contacts.size();
    }

    public void addContact(String firstName, String lastName, String number) {
        ++id;
        contacts.add(new Contact(id, firstName, lastName, number));
    }

    public String findContact(String userInput) {
        for (Contact contact : contacts) {
//            if ((char) contact.getId() == userInput.charAt(0)) {
//                return "ID: " + contact.getId() + "\nFirst Name: " + contact.getFirstName() + "\nLast Name: " + contact.getLastName() + "\nPhone Number: " + contact.getPhoneNumber();
//            }
            if (contact.getFirstName().equals(userInput)) {
                return "ID: " + contact.getId() + "\nFirst Name: " + contact.getFirstName() + "\nLast Name: " + contact.getLastName() + "\nPhone Number: " + contact.getPhoneNumber();
            }
            if (contact.getLastName().equals(userInput)) {
                return "ID: " + contact.getId() + "\nFirst Name: " + contact.getFirstName() + "\nLast Name: " + contact.getLastName() + "\nPhone Number: " + contact.getPhoneNumber();
            }
            if (contact.getPhoneNumber().equals(userInput)) {
                return "ID: " + contact.getId() + "\nFirst Name: " + contact.getFirstName() + "\nLast Name: " + contact.getLastName() + "\nPhone Number: " + contact.getPhoneNumber();
            }
        }


        throw new IllegalArgumentException("No such contact");
    }

    public void editContact(int id, String firstName, String lastName, String phoneNumber) {
        for (Contact contact : contacts) {
            if (contact.getId()==(id)) {
                contact.updateContact(firstName, lastName, phoneNumber);
            }
        }
    }

    public boolean deletedContact(String firstName, String lastName,  String phoneNumber) {
        if(contacts.isEmpty()) throw new IllegalArgumentException("Phonebook is empty");
        return contacts.removeIf(contact -> contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName) && contact.getPhoneNumber().equals(phoneNumber));

    }
}