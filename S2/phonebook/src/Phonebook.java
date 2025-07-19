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

    public String findViaFirstName(String firstName) {
        for (Contact contact : contacts) {
            if (contact.getFirstName().equals(firstName)) {
                return "ID: " + contact.getId() + "\nFirst Name: " + contact.getFirstName() + "\nLast Name: " + contact.getLastName() + "\nPhone Number: " + contact.getPhoneNumber();
            }
        }
     return null;
    }

    public String findViaLastName(String lastName) {
        for (Contact contact : contacts) {
            if (contact.getLastName().equals(lastName)) {
                return "ID: " + contact.getId() + "\nFirst Name: " + contact.getFirstName() + "\nLast Name: " + contact.getLastName() + "\nPhone Number: " + contact.getPhoneNumber();
            }
        }
        return null;
    }

    public String findViaPhoneNumber(String phoneNumber) {
        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                return "ID: " + contact.getId() + "\nFirst Name: " + contact.getFirstName() + "\nLast Name: " + contact.getLastName() + "\nPhone Number: " + contact.getPhoneNumber();
            }
        }
        throw new  IllegalArgumentException("No such contact");
    }



    public String findContact(String userInput) {
        for (Contact contact : contacts) {
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
        throw new  IllegalArgumentException("No such contact");
    }





}
