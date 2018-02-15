package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Contact {
    public String value;
    private boolean isPrivate;

    public Contact(String value, boolean isPrivate, String constraints, String regex) throws IllegalValueException{
        this.isPrivate = isPrivate;
        String trimmedValue = value.trim();
        if (!isValid(trimmedValue, regex)) {
            throw new IllegalValueException(constraints);
        }
        this.value = trimmedValue;
    }

    /**
     * Returns true if the given string is a valid person value.
     */

    public boolean isValid(String test, String regex) {
        return test.matches(regex);
    }

    public String toString() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public boolean isPrivate() {
        return this.isPrivate;
    }

}
