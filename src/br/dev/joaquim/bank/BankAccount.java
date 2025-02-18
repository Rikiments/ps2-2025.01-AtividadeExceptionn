package br.dev.joaquim.bank;

import br.dev.joaquim.exceptions.InsufficientFoundsException;

/**
 * Classe que representa uma conta bancária.
 */
public class BankAccount {
  private int accountNumber;
  private double balance;
  private String accountHolderName;

  /**
   * Construtor padrão da classe BankAccount.
   */
  public BankAccount() {
  }

  /**
   * Construtor da classe BankAccount que inicializa a conta com número, saldo e nome do titular.
   * 
   * @param accountNumber Número da conta bancária.
   * @param balance Saldo inicial da conta.
   * @param accountHolderName Nome do titular da conta.
   */
  public BankAccount(int accountNumber, double balance, String accountHolderName) {
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.accountHolderName = accountHolderName;
  }

  /**
   * Obtém o número da conta.
   * 
   * @return O número da conta bancária.
   */
  public int getAccountNumber() {
    return accountNumber;
  }

  /**
   * Obtém o saldo da conta.
   * 
   * @return O saldo atual da conta bancária.
   */
  public double getBalance() {
    return balance;
  }

  /**
   * Obtém o nome do titular da conta.
   * 
   * @return O nome do titular da conta bancária.
   */
  public String getAccountHolderName() {
    return accountHolderName;
  }

  /**
   * Deposita um valor na conta bancária.
   * 
   * @param value O valor a ser depositado.
   * @throws IllegalArgumentException Se o valor for negativo.
   */
  public void deposit(double value) {
    if (value < 0) {
      throw new IllegalArgumentException("O valor precisa ser positivo, foi informado o valor R$ " + value);
    }
    this.balance += value;
  }

  /**
   * Realiza um saque na conta bancária.
   * 
   * @param value O valor a ser sacado.
   * @throws IllegalArgumentException Se o valor for negativo.
   * @throws InsufficientFoundsException Se o saldo for insuficiente para o saque.
   */
  public void withdraw(double value) throws InsufficientFoundsException {
    if (value < 0) {
      throw new IllegalArgumentException("O valor precisa ser positivo, foi informado o valor R$ " + value);
    }
    if (value > this.balance) {
      throw new InsufficientFoundsException("O valor R$ " + value + " é superior ao saldo [R$ " + this.balance + "]");
    }
    this.balance -= value;
  }

  /**
   * Retorna uma representação textual da conta bancária.
   * 
   * @return Uma string com as informações da conta bancária.
   */
  @Override
  public String toString() {
    return "Conta " + accountNumber + " de " + accountHolderName + " tem R$ " + balance + " de saldo";
  }
}
