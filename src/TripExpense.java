public class TripExpense {

    public static void main(String[] args) {
        Account account = new Account();
        account.addExpense(50);
        account.addExpense(9000);
        System.out.println("Can i shop further " +  account.checkForShopping(2000));
        System.out.println("Can i shop further " +  account.checkForShopping(10));
//        System.out.println("Account Balance : " + account.balance);
    }
}
