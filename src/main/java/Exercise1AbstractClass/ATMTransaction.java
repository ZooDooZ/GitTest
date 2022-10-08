package Exercise1AbstractClass;

public class ATMTransaction extends Bank implements ATM {

    public void enterAmountToWithdraw(){
        System.out.println("Wprowadz kwote jaka chcesz wyplacic.");
    }

    public void withdrawingCash(){
        System.out.println("Wyplacenie gotowki.");

    }

    public void acknowledgments(){
        System.out.println("Dziekujemy z skorzystanie z uslug naszego banku.");

    }

    public void process(){
        insertCard();
        enterPIN();
        enterAmountToWithdraw();
        infoAboutAcceptReqBank();
        checkingAccBalance();
        confirmationPossibilityWithdrawal();
        withdrawingCash();
        acknowledgments();
    }
}
