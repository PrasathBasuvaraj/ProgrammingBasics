package InheritanceBankaccount;

public class Statement {

    public static void main(String[] args) {
        Passbook mydetails = new Passbook();

        System.out.println("account holder name" + " : " + mydetails.accountHolder + " \n" +
                "account number" + "=" + mydetails.account_number + "\n" +
                "bank balance" + " =" + mydetails.bankBalance);
        System.out.println("secret code" + "=" + mydetails.secret_code);
        System.out.println("minimum" + " " + mydetails.minimum_balance);

    }
}
