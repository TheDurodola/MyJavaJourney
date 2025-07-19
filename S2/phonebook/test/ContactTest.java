import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ContactTest {
    private Contact contact;


    @BeforeEach
    public void setUp() {
        contact = new Contact(1, "Abolaji", "Durodola", "08148260470");
    }

    @Test
    public void contactCanBeUpdated() {
        contact.updateContact("Toliat", "Raphael", "08146660470");
        assertEquals("Toliat", contact.getFirstName());
    }

    @Test
    public void ifLastNameOrFirstNameConsistOfNumbersWhenUpdatingContactIllegalNameExceptionIsThrown() {
        assertThrows(IllegalArgumentException.class, () -> contact.updateContact("Toliat", "1", "08146660470"));
        assertThrows(IllegalArgumentException.class, () -> contact.updateContact("1", "Durodola", "08146660470"));

    }

    @Test
    public void contactCantBeCreatedWithNumbersInFirstNameOrLastName() {
        assertThrows(IllegalArgumentException.class, () -> new Contact(2, "1", "Raphael", "08146660470"));
        assertThrows(IllegalArgumentException.class, () -> new Contact(3, "Toliat", "2", "08146660470"));
    }

    @Test
    public void contactPhoneNumberCanOnlyContainNumbers() {
        assertThrows(IllegalArgumentException.class, () -> new Contact(4, "Toliat", "Raphael", "0814666047a"));
        assertThrows(IllegalArgumentException.class, () -> new Contact(5, "Toliat", "Raphael", "0814666047!"));
    }

    @Test
    public void contactCantBeUpdatedWithInvalidPhoneNumberInput(){
        assertThrows(IllegalArgumentException.class, () -> contact.updateContact("Toliat", "Durodola", "0814666047!"));
    }

    @Test
    public void phoneNumberMustStartWithZeroAndStringLengthMustBeEleven(){
        assertThrows(IllegalArgumentException.class, () -> new Contact(3, "Toliat", "Duro", "18146660470"));
        assertThrows(IllegalArgumentException.class, () -> new Contact(3, "Toliat", "Duro", "018146660470"));

    }






}
