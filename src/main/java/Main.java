import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        ExpenseRepository expenseRepository = new ExpenseRepository();
        ExpenseService expenseService = new ExpenseService(expenseRepository);

        mainLoop:
        while(true){
            System.out.print("Enter Choice\n" +
                    "1.Add Expense\n" +
                    "2.View Expense\n" +
                    "3.Edit Expense\n" +
                    "4.Delete Expense\n" +
                    "5. Exit\n" +
                    ": ");


            int input = Integer.parseInt(scn.nextLine());
            switch(input){
                case 1:
                    //add expense
                    System.out.print("Enter expense type: ");
                    String expenseType = scn.nextLine();

                    System.out.print("Enter amount: ");
                    double expenseAmount = Double.parseDouble(scn.nextLine());

                    expenseService.createExpense(expenseType, expenseAmount);
                    break;
                case 2:
                    //view expense
                    List<Expense> expenses = expenseService.viewExpenses();

                    for(Expense expense : expenses){
                        System.out.println("|-----------------------|");
                        System.out.println("Expense: " + expense.getExpenseType());
                        System.out.println("Amount: " + expense.getExpenseAmount());
                        System.out.println("|-----------------------|");
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Exiting MoneyMate...");
                    break mainLoop;

                default:
                    System.out.println("Invalid choice.");

            }




            //edit expense

            //delete expense

        }


    }

}
