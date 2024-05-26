package Application;


import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;


public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Cliente cl = new Cliente();


         // Adicionando algumas contas ao banco para fins de teste
          
        cl.addCliente("dady", "1234-23", 54326, 7000.00);
        cl.addCliente("taizy", "123-5", 54322, 0);
        System.out.println(cl);
        System.out.println("----------------------------------------");
        cl.deposit(54322, "123-5", 16000);
        
        cl.sacar(54322, "123-5", 15995);
       
        cl.sacar(54322, "123-5", 15995);
        
        
        

        System.out.println("Bem-vindo ao Banco!");

        // Criação de uma nova conta
        System.out.println("Criação de uma nova conta:");
        System.out.print("Digite seu Nome: ");
        String name = sc.nextLine();
        System.out.print("Digite sua agência: ");
        String agencia = sc.nextLine();
        System.out.print("Digite o número da conta: ");
        Integer number = sc.nextInt();
        System.out.print("Digite o saldo inicial: ");
        double amount = sc.nextInt();
        cl.addCliente(name, agencia, number, amount);

        
        System.out.println("Conta criada com sucesso!");
    
        
        System.out.println("Vai realizar um deposito (s/n): ");
       char resp = sc.next().charAt(0);
       if (resp == 's') {
        
       
         System.out.print("Digite sua agencia: ");
        sc.nextLine();
        String agenciap =sc.nextLine();
        System.out.print("Digite numero da conta: ");
        Integer numeros = sc.nextInt();
        System.out.print("Digite o valor a ser depositado: ");
        double amounts = sc.nextInt();
        Double newBalance = cl.deposit(numeros, agenciap, amounts);

        if (newBalance != null) {
            System.out.println("Depósito realizado com sucesso! Novo saldo: " + newBalance);
        } else {
            System.out.println("Conta não encontrada.");
        }

        System.out.println(cl.exibir(number, agencia, amount));

        System.out.println("Vai realizar um saque (s/n): ");
        char resps = sc.next().charAt(0);
        if (resps == 's') {
         
        
          System.out.print("Digite sua agencia: ");
         sc.nextLine();
         String saqueAgencia =sc.nextLine();
         System.out.print("Digite numero da conta: ");
         Integer saqueNumero = sc.nextInt();
         System.out.print("Digite o valor a ser Sacado: ");
         double saqueAmounts = sc.nextInt();
         Double novoSaldo = cl.sacar(saqueNumero, saqueAgencia, saqueAmounts);
 
         if (newBalance != null) {
             System.out.println("Saque realizado com sucesso! Novo saldo: " + novoSaldo);
         } else {
             System.out.println("Conta não encontrada.");
         }
 
         cl.exibir(number, saqueAgencia, saqueAmounts);
    }



       

       }



    }
}