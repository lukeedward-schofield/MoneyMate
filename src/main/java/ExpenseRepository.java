import java.util.ArrayList;
import java.util.List;

public class ExpenseRepository {

    List<Expense> expenses = new ArrayList<>();

    public Expense createExpense(String expenseType, double amount){
        Expense expense = new Expense(expenseType, amount);

        this.expenses.add(expense);

        return expense;
    }

    public List<Expense> viewExpenses(){
        return this.expenses;
    }

}
