package duke;


/**
 * Class that deals with exceptions
 * @author Ashiqur Rahman A0230107Y
 */
public class DukeException extends Exception{

    DukeException(String error) {
        super(error);
    }

    /**
     * Method that reminds user that description of Task cannot be empty
     * @param command User input
     * @return String errorText
     */
    public static String taskErrorMessage(String command) {
        String modifiedComm = command.replace(" ", "");
        String errorText = String.format("OOPS!!! The description of a %s cannot be empty.", modifiedComm);
        return errorText;
    }

    /**
     * Method that reminds user that description of Task cannot be empty
     * @return String errorText
     */
    public static String taskErrorMessage() {
        String errorText = String.format("OOPS!!! I'm sorry, but I don't know what that means :-(");
        return errorText;
    }

    /**
     * Method that reminds user that taskList index is greater than taskList size
     * @param tasklist Arraylist of tasks
     * @return String errorText
     */
    public static String IndexOutofBoundsException(TaskList tasklist) {
        String errorText = String.format("OOPS!!! There is only %d task(s) in the tasklist", tasklist.size());
        return errorText;
    }

    /**
     * Method that reminds user to use proper format for deadline object
     */
    public static String DateTimeFormatErrorMessage() {
        String errorText = String.format("OOPS!!! Please input deadline in this format yyyy-MM-dd\n" +
                "E.g: 2020-01-01");
        return Parser.echo(errorText);
    }

    public static String DeadlineFormatErrorMessage() {
        String errorText = String.format("OOPS!!! Please input deadline in this format\n" +
                "E.g: deadline Project Submission /by 2021-07-24");
        return Parser.echo(errorText);
    }
}
