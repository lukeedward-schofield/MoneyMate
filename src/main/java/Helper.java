import java.util.Scanner;

public class Helper {

    static Scanner scn = new Scanner(System.in);

    public static boolean loop(){
        System.out.print("\n\nContinue(y/n)?: ");
        String input = scn.nextLine();

        if(input.equals("n")){
            return false;
        }

        return true;
    }


    public static double getDoubleInput(){
        String doubleInput = scn.nextLine();
        if(! doubleInput.isEmpty()){
            System.out.println("Invalid input for expense amount");
            return;
        }
    }



}
