package Exercise2WithInterface;

public interface ATM {

    void depositMoney();
    void withdrawMoney();

    default void connectionWithBank(){
        System.out.println("Connect");
    }

    static void infoAboutEndWork(){
        System.out.println("The Bank has finished its work");
    }

}
