public class Account {

    private int balance = 10000;

    public int getBalance() {
        return balance;
    }

    public void addExpense(int expense) {
        balance = balance-expense;
    }

    public boolean checkForShopping(int budget) {
        return  budget < balance;
    }




}
