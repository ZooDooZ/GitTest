package Exercise1AbstractClass;

public interface ATM {

    default void insertCard(){
        System.out.println("Wprowadz karte.");
    }

    default void enterPIN(){
        System.out.println("Wprowadz PIN.");
    }

    // A request to enter the amount to be withdrawn
    void enterAmountToWithdraw();

    // Withdrawing cash
    void withdrawingCash();

    // Acknowledgments for using the Bank's services
    void acknowledgments();


}
