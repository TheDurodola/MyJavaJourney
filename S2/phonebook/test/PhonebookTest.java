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
                Phone Number: 08148260470""", phonebook.findContact("Abolaji"));
    }

    @Test
    public void addTwoContact_FindSecondContactViaFirstName(){
        phonebook.addContact("Abolaji", "Durodola", "08148260470");
        phonebook.addContact("Tolu", "Dire", "08148260430");
        assertEquals("""
                ID: 2
                First Name: Tolu
                Last Name: Dire
                Phone Number: 08148260430""", phonebook.findContact("Tolu"));
    }

    @Test
    public void addContact_findContact(){
        phonebook.addContact("Abolaji", "Durodola", "08148260470");
        assertEquals("""
                ID: 1
                First Name: Abolaji
                Last Name: Durodola
                Phone Number: 08148260470""", phonebook.findContact("Durodola"));
    }

    @Test
    public void addTwoContact_FindSecondContactViaLastName(){
        phonebook.addContact("Abolaji", "Durodola", "08148260470");
        phonebook.addContact("Tolu", "Dire", "08148260430");
        assertEquals("""
                ID: 2
                First Name: Tolu
                Last Name: Dire
                Phone Number: 08148260430""", phonebook.findContact("Dire"));
    }

    @Test
    public void addContact_FindViaPhoneNumber(){
        phonebook.addContact("Abolaji", "Durodola", "08148260470");
        assertEquals("""
                ID: 1
                First Name: Abolaji
                Last Name: Durodola
                Phone Number: 08148260470""", phonebook.findContact("08148260470"));
    }

    @Test
    public void addTwoContact_FindSecondContactViaPhoneNumber(){
        phonebook.addContact("Abolaji", "Durodola", "08148260470");
        phonebook.addContact("Tolu", "Dire", "08148260430");
        assertEquals("""
                ID: 2
                First Name: Tolu
                Last Name: Dire
                Phone Number: 08148260430""", phonebook.findContact("08148260430"));
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

    @Test
    public void addedContactCanBeEditedUsingTheContactID() {
        phonebook.addContact("Abolaji", "Durodola", "08148260470");
        assertEquals("""
                ID: 1
                First Name: Abolaji
                Last Name: Durodola
                Phone Number: 08148260470""", phonebook.findContact("Durodola"));

        phonebook.editContact(1, "Toliat", "Rufus", "08026848847");
        assertEquals("""
                ID: 1
                First Name: Toliat
                Last Name: Rufus
                Phone Number: 08026848847""", phonebook.findContact("Toliat"));

    }

    @Test
    public void addedContactCanBeDeleted(){
        phonebook.addContact("Abolaji", "Durodola", "08148260470");
        phonebook.deletedContact("Abolaji", "Durodola", "08148260470");
        assertEquals(0, phonebook.size());
    }

    @Test
    public void contactCantBeDeletedIfPhonebookIsEmpty(){
        assertThrows(IllegalArgumentException.class, ()-> phonebook.deletedContact("Abolaji", "Durodola","08148260470"));

    }

    @Test
    public void ifContactDoesntExist_DeleteContactReturnsFalse(){
        phonebook.addContact("Abolaji", "Durodola", "08148260470");
        assertFalse(phonebook.deletedContact("Bolaji", "Durodola", "08148260470"));
    }


//    @Test
//    public void contactCanBeRetrievedUsingTheContactID(){
//        phonebook.addContact("Abolaji", "Durodola", "08148260470");
//        assertEquals("""
//                ID: 1
//                First Name: Abolaji
//                Last Name: Durodola
//                Phone Number: 08148260470""", phonebook.findContact("1"));
//    }


    @Test
    public void contactInfoCantBeRetrievedUsingContactFirstName(){
        phonebook.addContact("Abolaji", "Durodola", "08148260470");
        assertEquals("""
                ID: 1
                First Name: Abolaji
                Last Name: Durodola
                Phone Number: 08148260470""", phonebook.findContactViaFirstName("Abolaji"));


        phonebook.addContact("Adeoluwa", "Ireoluwa", "08148260444");
        assertEquals("""
                ID: 1
                First Name: Abolaji
                Last Name: Durodola
                Phone Number: 08148260470""", phonebook.findContactViaFirstName("Abolaji"));

        assertEquals("""
                ID: 2
                First Name: Adeoluwa
                Last Name: Ireoluwa
                Phone Number: 08148260444""", phonebook.findContactViaFirstName("Adeoluwa"));
    }

    @Test
    public void contactInfoCantBeRetrievedUsingContactLastName(){
        phonebook.addContact("Abolaji", "Durodola", "08148260470");
        assertEquals("""
                ID: 1
                First Name: Abolaji
                Last Name: Durodola
                Phone Number: 08148260470""", phonebook.findContactViaLastName("Durodola"));


        phonebook.addContact("Adeoluwa", "Ireoluwa", "08148260444");
        assertEquals("""
                ID: 1
                First Name: Abolaji
                Last Name: Durodola
                Phone Number: 08148260470""", phonebook.findContactViaLastName("Durodola"));

        assertEquals("""
                ID: 2
                First Name: Adeoluwa
                Last Name: Ireoluwa
                Phone Number: 08148260444""", phonebook.findContactViaLastName("Ireoluwa"));
    }

    @Test
    public void contactInfoCantBeRetrievedUsingContactPhoneNumber(){
        phonebook.addContact("Abolaji", "Durodola", "08148260470");
        assertEquals("""
                ID: 1
                First Name: Abolaji
                Last Name: Durodola
                Phone Number: 08148260470""", phonebook.findContactViaNumber("08148260470"));


        phonebook.addContact("Adeoluwa", "Ireoluwa", "08148260444");
        assertEquals("""
                ID: 1
                First Name: Abolaji
                Last Name: Durodola
                Phone Number: 08148260470""", phonebook.findContactViaNumber("08148260470"));

        assertEquals("""
                ID: 2
                First Name: Adeoluwa
                Last Name: Ireoluwa
                Phone Number: 08148260444""", phonebook.findContactViaNumber("08148260444"));
    }
}
