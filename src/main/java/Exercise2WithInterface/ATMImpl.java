package Exercise2WithInterface;

public class ATMImpl implements ATM {

    public void depositMoney(){
        System.out.println("Money deposited");
    }

    public void withdrawMoney(){
        System.out.println("Money withdrawn");
    }

    @Override
    public void connectionWithBank() {
        ATM.super.connectionWithBank();
    }
}
