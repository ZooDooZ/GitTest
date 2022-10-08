package Exercise2WithInterface;

public class Application {
    public static void main(String[] args) {

        ATM atm = new ATMImpl();

        atm.depositMoney();
        atm.connectionWithBank();
        atm.withdrawMoney();
        ATM.infoAboutEndWork();

    }
}
