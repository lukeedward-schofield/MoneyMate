public class Expense {

    private String expenseType = "";
    private double expenseAmount = 0.0;

    public Expense(String type, double amount){
        this.expenseType = type;
        this.expenseAmount = amount;
    }

    public String getExpenseType() {return expenseType;}
    public void setExpenseType(String expenseType) {this.expenseType = expenseType;}

    public double getExpenseAmount() {return expenseAmount;}
    public void setExpenseAmount(double expenseAmount) {this.expenseAmount = expenseAmount;}
}
