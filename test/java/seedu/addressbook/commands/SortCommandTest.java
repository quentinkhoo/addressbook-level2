package seedu.addressbook.commands;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.data.person.ReadOnlyPerson;
import seedu.addressbook.util.TypicalPersons;

public class SortCommandTest {

    private final AddressBook unsortedAddressBook = new TypicalPersons().getTypicalUnsortedAddressBook();
    private final AddressBook sortedAddressBook = new TypicalPersons().getTypicalAddressBook();

    @Test
    public void execute() throws IllegalValueException {
        //should be bill, dan, amy, candy before sorting
        assertSortCommandBehavior();
    }

    /**
     * Executes the sort command for the given keywords and verifies
     * the result matches the persons in the expectedPersonList exactly.
     */
    private void assertSortCommandBehavior() {
        SortCommand command = createSortCommand();
        command.execute();
        assertEquals(unsortedAddressBook, sortedAddressBook);
    }

    private SortCommand createSortCommand() {
        SortCommand command = new SortCommand();
        command.setData(this.unsortedAddressBook, Collections.emptyList());
        return command;
    }

}
