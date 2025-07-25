import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    private List<Contact> contacts = new ArrayList<>();
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

    public String findContactViaFirstName(String firstName) {
        isPhonebookEmpty();
        for (Contact contact : contacts) {
            if (contact.getFirstName().equals(firstName)) {
                return "ID: " + contact.getId() + "\nFirst Name: " + contact.getFirstName() + "\nLast Name: " + contact.getLastName() + "\nPhone Number: " + contact.getPhoneNumber();
            }
        }
        for (Contact contact : contacts) {
            if (contact.getFirstName().equalsIgnoreCase(firstName)) {
                return "ID: " + contact.getId() + "\nFirst Name: " + contact.getFirstName() + "\nLast Name: " + contact.getLastName() + "\nPhone Number: " + contact.getPhoneNumber();
            }
        }
        throw new IllegalArgumentException("No such contact");
    }

    public String findContactViaLastName(String lastName) {
        isPhonebookEmpty();
        for (Contact contact : contacts) {
            if (contact.getLastName().equals(lastName)) {
                return "ID: " + contact.getId() + "\nFirst Name: " + contact.getFirstName() + "\nLast Name: " + contact.getLastName() + "\nPhone Number: " + contact.getPhoneNumber();
            }
        }
        for (Contact contact : contacts) {
            if (contact.getLastName().equalsIgnoreCase(lastName)) {
                return "ID: " + contact.getId() + "\nFirst Name: " + contact.getFirstName() + "\nLast Name: " + contact.getLastName() + "\nPhone Number: " + contact.getPhoneNumber();
            }
        }
        throw new IllegalArgumentException("No such contact");
    }

    public String findContactViaNumber(String number) {
        isPhonebookEmpty();
        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().equalsIgnoreCase(number)) {
                return "ID: " + contact.getId() + "\nFirst Name: " + contact.getFirstName() + "\nLast Name: " + contact.getLastName() + "\nPhone Number: " + contact.getPhoneNumber();
            }
        }
        throw new IllegalArgumentException("No such contact");
    }

    public String findContact(String userInput) {
        isPhonebookEmpty();

        for (Contact contact : contacts) {
//
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
        isPhonebookEmpty();
        for (Contact contact : contacts) {
            if (contact.getId()==(id)) {
                contact.updateContact(firstName, lastName, phoneNumber);
            }
        }
    }

    public boolean deletedContact(String firstName, String lastName,  String phoneNumber) {
        isPhonebookEmpty();
        return contacts.removeIf(contact -> contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName) && contact.getPhoneNumber().equals(phoneNumber));

    }

    public void isPhonebookEmpty() {
        if(isEmpty()){
            throw new NoContactsException("No contacts added yet");
        }
    }
}