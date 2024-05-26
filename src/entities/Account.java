package entities;

public class Account {
    private String name;
    private String agencia;
    private Integer number;
    protected double balance;
    public Account(String name , String agencia, Integer number, double balance) {
        this.agencia = agencia;
        this.number = number;
        this.balance = balance;
        this.name = name;
    }
    public String getAgencia() {
        return agencia;
    }
    public Integer getNumber() {
        return number;
    }
    public double getBalance() {
        return balance;
    }
    public String getName() {
        return name;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    @Override
    public String toString() {
        return "Account [name=" + name + ", agencia=" + agencia + ", number=" + number + ", balance=" + balance + "]";
    }
    

   /* 
    
    public void deposit(double amount){
        balance += amount;
    }

    public void sacar(double amount){
        balance -= amount;
    }
    */


}
