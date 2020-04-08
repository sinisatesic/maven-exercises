import org.apache.commons.lang3.StringUtils;

import java.lang.Object;
import java.util.Scanner;

public class MainMavClass {
    public static void main(String[] args) {

        //need a scanner for "Enter Something"; we need input from user
        Scanner userInput = new Scanner(System.in);
        String text;
        System.out.println("Enter something:");
        text = userInput.nextLine();

        //conditional below will add strings based on whether input is numeric
        if (StringUtils.isNumeric(text) == false){
            System.out.println(text + " is not a number");
        } else {
            System.out.println(text + " is a number");
        }

        //below prints user input but with each case changed to its opposite
        System.out.println("Flipped case: " + StringUtils.swapCase(text));

        //below prints user input but with all strings reversed
        System.out.println("Reversed: " + StringUtils.reverse(text));
    }


}
