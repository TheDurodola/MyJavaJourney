import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PhonebookTest {
    Phonebook phonebook;

    @BeforeEach
    public void setUp(){
         phonebook = new Phonebook();
    }


    @Test
    public void phonebookIsEmpty(){
        assertTrue(phonebook.isEmpty());
    }

    @Test
    public void addContact_phonebookIsNotEmpty(){
        phonebook.addContact("Abolaji", "Durodola", "08148260470");
        assertFalse(phonebook.isEmpty());
    }

    @Test
    public void addTwoContacts_phonebookSizeTwo(){
        phonebook.addContact("Abolaji", "Durodola", "08148260470");
        phonebook.addContact("Tolu", "Dire", "08148260430");
        assertEquals(2, phonebook.size());
    }

    @Test
    public void addContact_FindViaFirstName(){
        phonebook.addContact("Abolaji", "Durodola", "08148260470");
        assertEquals("""
                ID: 1
                First Name: Abolaji
                Last Name: Durodola
                Phone Number: 08148260470""", phonebook.findViaFirstName("Abolaji"));
    }

    @Test
    public void addTwoContact_FindSecondContactViaFirstName(){
        phonebook.addContact("Abolaji", "Durodola", "08148260470");
        phonebook.addContact("Tolu", "Dire", "08148260430");
        assertEquals("""
                ID: 2
                First Name: Tolu
                Last Name: Dire
                Phone Number: 08148260430""", phonebook.findViaFirstName("Tolu"));
    }

    @Test
    public void addContact_FindViaLastName(){
        phonebook.addContact("Abolaji", "Durodola", "08148260470");
        assertEquals("""
                ID: 1
                First Name: Abolaji
                Last Name: Durodola
                Phone Number: 08148260470""", phonebook.findViaLastName("Durodola"));
    }

    @Test
    public void addTwoContact_FindSecondContactViaLastName(){
        phonebook.addContact("Abolaji", "Durodola", "08148260470");
        phonebook.addContact("Tolu", "Dire", "08148260430");
        assertEquals("""
                ID: 2
                First Name: Tolu
                Last Name: Dire
                Phone Number: 08148260430""", phonebook.findViaLastName("Dire"));
    }



    @Test
    public void addContact_FindViaPhoneNumber(){
        phonebook.addContact("Abolaji", "Durodola", "08148260470");
        assertEquals("""
                ID: 1
                First Name: Abolaji
                Last Name: Durodola
                Phone Number: 08148260470""", phonebook.findViaPhoneNumber("08148260470"));
    }

    @Test
    public void addTwoContact_FindSecondContactViaPhoneNumber(){
        phonebook.addContact("Abolaji", "Durodola", "08148260470");
        phonebook.addContact("Tolu", "Dire", "08148260430");
        assertEquals("""
                ID: 2
                First Name: Tolu
                Last Name: Dire
                Phone Number: 08148260430""", phonebook.findViaPhoneNumber("08148260430"));
    }


    @Test void addContact_FindViaContact(){
        phonebook.addContact("Abolaji", "Durodola", "08148260470");
        assertEquals("""
                ID: 1
                First Name: Abolaji
                Last Name: Durodola
                Phone Number: 08148260470""", phonebook.findContact("08148260470"));

        assertEquals("""
                ID: 1
                First Name: Abolaji
                Last Name: Durodola
                Phone Number: 08148260470""", phonebook.findContact("Abolaji"));


        assertEquals("""
                ID: 1
                First Name: Abolaji
                Last Name: Durodola
                Phone Number: 08148260470""", phonebook.findContact("Durodola"));
    }





}
