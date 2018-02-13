package seedu.addressbook.commands;

public class SortCommand extends Command {
    public static final String COMMAND_WORD = "sort";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Sorts all persons in the address book alphabetically, ignoring case-sensitivity"
            +"\n" + "Example: " + COMMAND_WORD;

    public static final String MESSAGE_SORT_ACKNOWLEDGEMENT = "Address Book has been sorted!";

    public CommandResult execute() {
        addressBook.sortAlphabetically();
        return new CommandResult(MESSAGE_SORT_ACKNOWLEDGEMENT);
    }
}
