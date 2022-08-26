package org.FilipS;

import javax.naming.spi.NamingManager;

public class Account {

    private String name;
    private int balance = 0;
    private boolean debit = false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public boolean isDebit(){
        return debit;
    }

    public void deposit(int amount) {
        if(amount > 0) {
            balance += amount;
        } else {
            System.out.println("Kwota wplaty/wyplaty musi byc dodatnia!");
        }
    }
    public void withdraw(int amount) {
        if(amount > 0) {
            if(balance - amount >= -1000) {
                balance -= amount;
            } else {
                System.out.println("Nie mozna wykonac operacji przekraczajacej debet");
                System.out.println("Twoj stan konta po tej operacji wynosilby :" + (balance - amount) + "zl, a debet moze wynosic -1000zl.");
            }
        } else {
            System.out.println("Kwota wplaty/wyplaty musi byc dodatnia!");
        }
        if(balance < 0){
            debit = true;
            System.out.println("Ujemny stan konta");
        }
    }

    public void transfer(Account other, int amount){
        withdraw(amount);
        other.deposit(amount);
    }

}
