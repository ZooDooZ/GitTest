package org.FilipS;



public class App {
    public static void main( String[] args ) {

        Account account = new Account();
        Account account1 =  new Account();

        System.out.println();
        account.setName("Konto Premium 1");
        account1.setName("Konto Premiun 2");
        System.out.println(account);
        System.out.println(account1);

        System.out.println("Wplata");
        account.deposit(1000);
        System.out.println("Stan konta nr 1: " + account.getBalance());
        System.out.println("Transfer pieniedzy");
        account.transfer(account1,1000);
        System.out.println(account);
        System.out.println(account1);
    }
}
