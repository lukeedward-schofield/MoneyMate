import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExpenseService {

    private final ExpenseRepository repository;
    private final Scanner scanner = new Scanner(System.in);

    public ExpenseService(ExpenseRepository repository){
        this.repository = repository;
    }

    public void createExpense(String expenseType, double expenseAmount){

        this.repository.createExpense(expenseType, expenseAmount);
    }

    public List<Expense> viewExpenses(){
        return this.repository.viewExpenses();
    }



}
