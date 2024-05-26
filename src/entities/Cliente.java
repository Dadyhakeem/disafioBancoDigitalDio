package entities;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    List<Account> client;
    
    public Cliente( ) {
        this.client = new ArrayList<>();
        
    }


    public void addCliente(String name,String agencia, Integer number, double balance){
        client.add(new  Account(name,agencia, number, balance));
    }

    public Double deposit(Integer number,String agencia,double amount){
            if (!client.isEmpty()) {
            for (Account c : client) {
                if (c.getAgencia().equalsIgnoreCase(agencia)&& c.getNumber().equals(number)) {
                   Double newBalance = c.getBalance()+ amount;
                   c.setBalance(newBalance);
                   return newBalance ;
                    
                }
            }
        }
        return null;
    }

    public Double sacar(Integer number,String agencia,double amount){
        if (!client.isEmpty()) {
           for (Account a : client) {
            if (a.getAgencia().equalsIgnoreCase(agencia)&& a.getNumber().equals(number)) {
                if (a.getBalance()> 0) {
                    a.setBalance(a.getBalance() - amount- 5);
                    return a.getBalance();
                } else {
                    System.out.println("Impossivel realizer saque . Saldo insufisciente");
                }
            }
           } 
        }
        return null;
    }



    public Account exibir(Integer number,String agencia,double amount){
        for (Account a : client) {
            if (a.getAgencia().equalsIgnoreCase(agencia)&& a.getNumber().equals(number) ) {
                return a;
            }
        }
        return null;
    }


    @Override
    public String toString() {
        return "Cliente [client=" + client + "]";
    }


    

    

   

    
}
